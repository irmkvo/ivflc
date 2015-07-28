/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service.postgres;

import dao.postgres.UsersDAO;
import domain.postgres.Puser;
import domain.postgres.Roles;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Andrey
 */
@Service("userService")
@Transactional("postgresT")
public class UsersServiceImpl implements UserDetailsService, UsersService {

    @Autowired
    UsersDAO userDAO;  

    @Override
    public void addOrUpdateUser(Puser user) {
        userDAO.addOrUpdateUser(user);
    }

    @Override
    public Puser getUser(Integer id) {
        return userDAO.getUser(id);
    }

    @Override
    public List<Puser> listUser() {
        return userDAO.listUser();
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException, DataAccessException {
        Puser innerUser = getUserbyLogin(login);
        System.out.println(innerUser.getUserLogin() + "  ########################## login");
        if (null == innerUser) {
            System.out.println(" Нет пользователя  ########################## login");
            throw new UsernameNotFoundException("user not found in database");
        }
        System.out.println(innerUser.getRole().getRoleCode() + " ########################## login");
        org.springframework.security.core.userdetails.User springUser = new org.springframework.security.core.userdetails.User(innerUser.getUserLogin(), innerUser.getUserPassword(), true, true, true, true, getAuthorities(innerUser.getRole()));

        return springUser;
    }

    @Override
    public String generateUserPassword(Integer length) {
        Random rg = new Random();
        String alphabet = "0123456789abcdefghijklmnopqrstuvwxyz#$&@^*?";
        String password = "";
        for (int i = 0; i < length; i++) {
            password = password + alphabet.charAt(rg.nextInt(alphabet.length()));
        }
        System.out.println("*** Generated password:" + password);
        return password;
    }

    @Override
    public String createHash(String password) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(password.getBytes(), 0, password.length());
            String hashedPass = new BigInteger(1, messageDigest.digest()).toString(16);
            if (hashedPass.length() < 32) {
                hashedPass = "0" + hashedPass;
            }
            return hashedPass;
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }

    @Override
    public GrantedAuthority[] defaultAuthority() {
        GrantedAuthority[] authorities = new GrantedAuthority[1];
        authorities[0] = new GrantedAuthorityImpl("ROLE_USER");
        return authorities;
    }

    @Override
    public GrantedAuthority[] employeeAuthority() {
        GrantedAuthority[] authorities = new GrantedAuthority[1];
        authorities[0] = new GrantedAuthorityImpl("ROLE_EMPLOYEE");
        return authorities;
    }

    @Override
    public GrantedAuthority[] adminAuthority() {
        GrantedAuthority[] authorities = new GrantedAuthority[1];
        authorities[0] = new GrantedAuthorityImpl("ROLE_ADMIN");
        return authorities;
    }

    public GrantedAuthority[] clientAuthority() {
        GrantedAuthority[] authorities = new GrantedAuthority[1];
        authorities[0] = new GrantedAuthorityImpl("ROLE_CLIENT");
        return authorities;
    }

    @Override
    public Puser getUserbyLogin(String login) {
        return userDAO.getUserbyLogin(login);
    }
    
    public List<String> getRoles(Roles role) {
        List<String> roles = new ArrayList<String>();

        roles.add(role.getRoleName());

        return roles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(Roles role) {
        List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(role));
        return authList;
    }

    public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (String role : roles) {
            authorities.add(new GrantedAuthorityImpl(role));
        }
        return authorities;
    }

    @Override
    public Roles getRole(Integer id) {
       return userDAO.getRole(id);
    }

    @Override
    public void saveOrUpdateRole(Roles role) {
        userDAO.saveOrUpdateRole(role);
    }

    @Override
    public List<Roles> getRoles() {
        return userDAO.getRoles();
    }
    
}

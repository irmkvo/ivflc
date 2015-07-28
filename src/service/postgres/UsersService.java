/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service.postgres;

import domain.postgres.Puser;
import domain.postgres.Roles;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Andrey
 */
public interface UsersService {

    public void addOrUpdateUser(Puser user);

    public Puser getUser(Integer id);

    public List<Puser> listUser();

    public String generateUserPassword(Integer length);

    public Puser getUserbyLogin(String login);

    public String createHash(String password);

    public GrantedAuthority[] defaultAuthority();

    public GrantedAuthority[] adminAuthority();

    public GrantedAuthority[] clientAuthority();
     
    public GrantedAuthority[] employeeAuthority();
    
    public Collection<? extends GrantedAuthority> getAuthorities(Roles role);
    
    // РАБОТА С РОЛЯМИ
    
    public void saveOrUpdateRole(Roles role);  // Сохранить или обновить роль
    
    public Roles getRole(Integer id);  // Получить роль
    
    public List<Roles> getRoles();  // Получить все роли
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.postgres;

import dao.postgres.BroadcastRegistrationDAO;
import domain.postgres.BroadcastRegistration;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kvo
 */
@Service("broadcastService")
@Transactional("postgresT")
public class BroadcastRegistrationServiceImpl implements BroadcastRegistrationService{

    @Autowired
    BroadcastRegistrationDAO brdcDAO;
    
    @Override
    public List<BroadcastRegistration> getAllBrdcUsers() {
        return this.brdcDAO.getAllBrdcUsers();
    }

    @Override
    public BroadcastRegistration getBrdcUserById(Integer Id) {
        return this.brdcDAO.getBrdcUserById(Id);
    }

    @Override
    public BroadcastRegistration getBrdcUserByLogin(String login) {
        return this.brdcDAO.getBrdcUserByLogin(login);
    }

    @Override
    public void addBrdcUser(BroadcastRegistration brdc) {
        this.brdcDAO.addBrdcUser(brdc);
    }

    @Override
    public void updateBrdcUser(BroadcastRegistration brdc) {
        this.brdcDAO.updateBrdcUser(brdc);
    }
    
}

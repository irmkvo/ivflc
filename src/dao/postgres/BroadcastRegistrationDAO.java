/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.postgres;

import domain.postgres.BroadcastRegistration;
import java.util.List;

/**
 *
 * @author kvo
 */
public interface BroadcastRegistrationDAO {
    
    public List<BroadcastRegistration> getAllBrdcUsers();
    public BroadcastRegistration getBrdcUserById(Integer Id);
    
    public BroadcastRegistration getBrdcUserByLogin(String login);
    
    public void addBrdcUser(BroadcastRegistration brdc);
    public void updateBrdcUser(BroadcastRegistration brdc);
}

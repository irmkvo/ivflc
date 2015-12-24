/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.postgres;

import domain.postgres.Broadcasts;
import domain.postgres.Puser;
import java.util.List;

/**
 *
 * @author kvo
 */
public interface BroadcastDAO {
    
    public List<Broadcasts> getBroadcasts();
    
    public void addBroadcast(Broadcasts brdc);
    
    public void updateBroadcast(Broadcasts brdc);
    
    public Broadcasts getBroadcastByID(Integer ID);
    
    public Broadcasts getBroadcastByMeetingID(String meetingID);
    
    public List<Broadcasts> getBroadcastByUserId(Puser ID);
    
    public void deleteBroadcastByID(Broadcasts brdc);
}

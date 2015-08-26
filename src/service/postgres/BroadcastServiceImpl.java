/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.postgres;

import dao.postgres.BroadcastDAO;
import domain.postgres.Broadcasts;
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
public class BroadcastServiceImpl implements BroadcastService {

    @Autowired
    BroadcastDAO broadcastDAO;
    
    @Override
    public List<Broadcasts> getBroadcasts() {
        return this.broadcastDAO.getBroadcasts();
    }

    @Override
    public void addBroadcast(Broadcasts brdc) {
        this.broadcastDAO.addBroadcast(brdc);
    }

    @Override
    public void updateBroadcast(Broadcasts brdc) {
        this.broadcastDAO.updateBroadcast(brdc);
    }

    @Override
    public Broadcasts getBroadcastByID(Integer ID) {
        return this.broadcastDAO.getBroadcastByID(ID);
    }

    @Override
    public Broadcasts getBroadcastByMeetingID(String meetingID) {
        return this.broadcastDAO.getBroadcastByMeetingID(meetingID);
    }

    @Override
    public void deleteBroadcastByID(Broadcasts brdc) {
        this.broadcastDAO.deleteBroadcastByID(brdc);
    }
    
}

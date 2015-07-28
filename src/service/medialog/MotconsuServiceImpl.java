/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.medialog;

import dao.medialog.MotconsuDAO;
import domain.medialog.Motconsu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kvo
 */
@Service("motconsuService")
@Transactional("mssqlT")
public class MotconsuServiceImpl implements MotconsuService {

    @Autowired
    MotconsuDAO motconsuDAO;
    
    @Override
    public List<Motconsu> getMotconsuList() {
        return motconsuDAO.getMotconsuList();
    }

    @Override
    public Motconsu getMotconsuById(Integer ID) {
        return motconsuDAO.getMotconsuById(ID);
    }

    @Override
    public List<Motconsu> getMotconsuListByPatientId(Integer ID) {
        return motconsuDAO.getMotconsuListByPatientId(ID);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.medialog;

import dao.medialog.MedecinsDAO;
import domain.medialog.Medecins;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kvo
 */
@Service("medecinsService")
@Transactional("mssqlT")
public class MedecinsServiceImpl implements MedecinsService {

    @Autowired
    MedecinsDAO medecinsDAO;
    
    @Override
    public List<Medecins> getMedecinList() {
        return medecinsDAO.getMedecinList();
    }

    @Override
    public Medecins getMedecinById(Integer ID) {
        return medecinsDAO.getMedecinById(ID);
    }
    
}

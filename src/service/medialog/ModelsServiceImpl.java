/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.medialog;

import dao.medialog.MedecinsDAO;
import dao.medialog.ModelsDAO;
import domain.medialog.Models;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kvo
 */
@Service("modelsService")
@Transactional("mssqlT")
public class ModelsServiceImpl implements ModelsService {

    @Autowired
    ModelsDAO modelsDAO;
    
    @Override
    public List<Models> getModels() {
        return modelsDAO.getModels();
    }

    @Override
    public Models getModeleById(Integer ID) {
        return modelsDAO.getModeleById(ID);
    }
    
}

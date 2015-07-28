/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.postgres;

import dao.postgres.PagesDAO;
import domain.postgres.Pages;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Shah
 */

@Service("pageService")
@Transactional("postgresT")

public class PagesServiceImpl implements PagesService{
    
    @Autowired
    PagesDAO pagesDAO;
    

    @Override
    public List<Pages> getPagesList() {
        return pagesDAO.getPagesList();
    }

    @Override
    public void addPages(Pages page) {
        pagesDAO.addPages( page);
    }

    @Override
    public void updatePages(Pages page) {
         pagesDAO.updatePages(page);
    }

    @Override
    public Pages getPagesByID(int ID) {
       return pagesDAO.getPagesByID(ID);
    }

    @Override
    public Pages getPagesByName(String name) {
      return  pagesDAO.getPagesByName(name);
    }
    
    public Pages getMainPages(){
        return pagesDAO.getMainPages();
    }

    @Override
    public Pages getLoginPages() {
        return pagesDAO.getLoginPage();
    }
    
}

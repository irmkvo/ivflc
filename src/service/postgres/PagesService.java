/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.postgres;

import domain.postgres.Pages;
import java.util.List;

/**
 *
 * @author Shah
 */


public interface PagesService {
    public List<Pages> getPagesList(); //Получить список Страниц
    
    public void addPages(Pages page); // Добавить Страницу 
    
    public void updatePages(Pages page);// Обновить Страницы
    
    public Pages getPagesByID(int ID);// Получить Страницы по ID
    
    public Pages getPagesByName(String name);// Получить Страницу по названию
    
    public Pages getMainPages();// Получить главную страницу
    
    public Pages getLoginPages();// Получить страницу авторизации
    
}

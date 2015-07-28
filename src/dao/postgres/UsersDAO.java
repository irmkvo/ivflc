/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.postgres;

import domain.postgres.Puser;
import domain.postgres.Roles;
import java.util.List;
/**
 *
 * @author Andrey
 */
public interface UsersDAO {
    // РАБОТА С ПОЛЬЗОВАТЕЛЯМИ
    
    public void addOrUpdateUser(Puser user);    // Добавить нового пользователя
    
    public Puser getUser(Integer id);   // Получить пользователя по ID

    public List<Puser> listUser();  // Получить всех пользователей
    
    public Puser getUserbyLogin(String login);  // Получить пользователя по имени
    
    // РАБОТА С РОЛЯМИ
    
    public void saveOrUpdateRole(Roles role);  // Сохранить или обновить роль
    
    public Roles getRole(Integer id);  // Получить роль
    
    public List<Roles> getRoles();  // Получить все роли
            
}

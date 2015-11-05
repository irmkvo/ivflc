/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.medialog;

import domain.medialog.Data143;
import java.util.List;

/**
 *
 * @author kvo
 */
public interface Data143DAO {
    public List<Data143> getAllData143(); 
    public Data143 getAllData143ByID(Integer Id);
    
    public Data143 getAllData143ByMotconsuId(Integer Id);
    public Data143 getAllData143ByPatientsId(Integer Id);
}

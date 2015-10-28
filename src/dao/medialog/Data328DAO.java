/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.medialog;

import domain.medialog.Data328;
import java.util.List;

/**
 *
 * @author kvo
 */
public interface Data328DAO {
    
    public List<Data328> getData328List();

    public Data328 getData328ById(Integer ID);
    
    public Data328 getData328ByMotconsuId(Integer ID);
    
    public List<Data328> getData328ByPatientId(Integer ID);
}

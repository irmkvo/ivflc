/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.medialog;

import domain.medialog.Medecins;
import domain.medialog.Models;
import domain.medialog.Motconsu;
import java.util.List;

/**
 *
 * @author kvo
 */
public interface MotconsuDAO {
    public List<Motconsu> getMotconsuList();

    public Motconsu getMotconsuById(Integer ID);
    
    public List<Motconsu> getMotconsuListByPatientId(Integer ID);
    
    public List<Motconsu> getMotconsuListByPatientIdAndModel(Integer ID, Models model);
}

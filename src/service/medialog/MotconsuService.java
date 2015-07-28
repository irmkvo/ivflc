/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.medialog;

import domain.medialog.Motconsu;
import java.util.List;

/**
 *
 * @author kvo
 */
public interface MotconsuService {
    public List<Motconsu> getMotconsuList();

    public Motconsu getMotconsuById(Integer ID);
    
    public List<Motconsu> getMotconsuListByPatientId(Integer ID);
}

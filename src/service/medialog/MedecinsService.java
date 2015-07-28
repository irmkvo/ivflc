/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.medialog;

import domain.medialog.Medecins;
import java.util.List;

/**
 *
 * @author kvo
 */
public interface MedecinsService {
    public List<Medecins> getMedecinList();

    public Medecins getMedecinById(Integer ID);
}

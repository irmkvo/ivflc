/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.medialog;

import domain.medialog.Models;
import java.util.List;

/**
 *
 * @author kvo
 */
public interface ModelsService {
    public List<Models> getModels();

    public Models getModeleById(Integer ID);
}

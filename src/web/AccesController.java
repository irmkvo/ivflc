/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AccesController {
    
    @RequestMapping(value="/error403", method= RequestMethod.GET)
    public String getError403(Map<String, Object> map){
    return "error403";
    }
    
}

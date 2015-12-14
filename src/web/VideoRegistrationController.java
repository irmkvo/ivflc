/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.postgres.BroadcastRegistration;
import domain.postgres.Broadcasts;
import domain.postgres.Menu;
import domain.postgres.Pages;
import domain.postgres.Roles;
import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import service.postgres.BroadcastRegistrationService;
import service.postgres.BroadcastService;
import video.api.API;

/**
 *
 * @author kvo
 */
@Controller
public class VideoRegistrationController {
    
    @Autowired
    BroadcastRegistrationService brdcService;
    
    @Autowired
    BroadcastService broadcastService;
    
    @Autowired
    BroadcastRegistrationService broadcastRegistrationService;
    
    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {

        binder.registerCustomEditor(Broadcasts.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
                setValue(broadcastService.getBroadcastByID(Integer.parseInt(text)));
            }
        });
    }
    
    // GET BROADCAST REGISTRATION PAGE
    @RequestMapping("/video/logining/{mettingId}")
    public String getVideoLoginPage(@PathVariable("mettingId") String meetingId, Map<String, Object> map) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
       
        API broadcastAPI = new API();
        
        Broadcasts brdc = this.broadcastService.getBroadcastByMeetingID(meetingId);
        
        if (brdc != null) {
            String status = broadcastAPI.isMeetingRunning(meetingId);

            if (status.equalsIgnoreCase("true")) {
                map.put("status", 1);
                map.put("meetingId", meetingId);
            } else {
                map.put("status", 0);
                String strDate = sdf.format(brdc.getStartDate());
                map.put("brdcDate", strDate);
            }
        } else {
            map.put("status", 3);
        }

        return "meeting/login";
    }
    
    // GET BROADCAST REGISTRATION PAGE
    @RequestMapping("/video/registration/{mettingId}")
    public String getVideoRegistrationPage(@PathVariable("mettingId") String meetingId, Map<String, Object> map) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
       
        Broadcasts brdc = this.broadcastService.getBroadcastByMeetingID(meetingId);
        
        if (brdc != null) {
            BroadcastRegistration brdcReg = new BroadcastRegistration();
            brdcReg.setBrdc(brdc);
            
            map.put("brdcInfo", brdc.getDescription());
            
            map.put("brdcReg", brdcReg);
        } else {
            map.put("brdcInfo", "Ошибка нет такой конференции!");
        }

        return "meeting/registration";
    }
    // GET BROADCAST REGISTRATION SAVE PAGE
    @RequestMapping("/video/registration/save")
    public String getVideoRegistrationSavePage(@ModelAttribute(value = "brdcReg") BroadcastRegistration brdcReg, Map<String, Object> map) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
       
        BroadcastRegistration brdcRegTemp = this.broadcastRegistrationService.getBrdcUserByLogin(brdcReg.getLogin());
        
        if (brdcRegTemp == null) {
            if (!brdcReg.getLogin().isEmpty() && !brdcReg.getPass().isEmpty() && !brdcReg.getEmail().isEmpty()) {
                brdcReg.setCrationDate(new Date());
                brdcReg.setBlock(false);

                this.broadcastRegistrationService.addBrdcUser(brdcReg);
                map.put("brdcInfo", brdcReg.getBrdc().getDescription());
                map.put("brdcSucces", "Регистрация выполненна успешно, на указаный email высланы данные.");
                return "meeting/registration";
            } else {
                map.put("brdcError", "Не заполненны необходимые поля.");
                map.put("brdcInfo", brdcReg.getBrdc().getDescription());
                map.put("brdcReg", brdcReg);
                return "meeting/registration";
            }
        } else {
            map.put("brdcError", "Пользователь с таким именем уже существует, измените имя пользователя.");
            map.put("brdcInfo", brdcReg.getBrdc().getDescription());
            map.put("brdcReg", brdcReg);
            return "meeting/registration";
        }        
    }
}

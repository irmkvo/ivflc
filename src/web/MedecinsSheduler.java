/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.medialog.PlDay;
import domain.medialog.Planning;
import domain.postgres.Puser;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.PlJson;
import pojo.PlanningPojo;
import service.medialog.PlanningService;
import service.postgres.UsersService;

/**
 *
 * @author kvo
 */
@Controller
public class MedecinsSheduler {
    
    @Autowired
    UsersService userService;
    
    @Autowired
    PlanningService planningService;
    
    @RequestMapping(value="/med/schedule", method= RequestMethod.GET)
    public String getSchedule(Map<String, Object> map){
        
        Puser CurrentUser = GetCurrentUser();
        
        map.put("UserData", CurrentUser);
        
        List<PlDay> plDays = this.planningService.getPLDAYByAgentID(CurrentUser.getPlAgendId());
        map.put("PLDays", plDays);
                      
        Integer deure = this.planningService.getPLMinDeure(firstDayOfWeek(new Date()), lastDayOfWeek(new Date()), CurrentUser.getPlSubId());
        
        System.out.println(deure);
        System.out.println(firstDayOfWeek(new Date()).toString());
        System.out.println(lastDayOfWeek(new Date()).toString());
        Integer plMax = this.planningService.getPLMax(firstDayOfWeek(new Date()), lastDayOfWeek(new Date()), CurrentUser.getPlSubId());
        Integer plMin = this.planningService.getPLMin(firstDayOfWeek(new Date()), lastDayOfWeek(new Date()), CurrentUser.getPlSubId());
        System.out.println(plMax);
        System.out.println(plMin);
        
        List<PlanningPojo> plps = new ArrayList<PlanningPojo>();
        
        for(int i = plMin; i < plMax; i = i + deure){
            
            PlanningPojo plp = new PlanningPojo();
            plp.setTime("" + i);
            plp.setDeure("" + deure);
            
            plps.add(plp);
        }
        
        map.put("PLDayDeures", plps);
        
        map.put("loadContent", "/WEB-INF/views/doctor/schedule/schedule.jsp");
        
        return "index";
    }
    // JSON
    @RequestMapping(value="/med/schedule/json", method={RequestMethod.POST,RequestMethod.GET})
    public String getScheduleJSON(@RequestParam("start") String start, @RequestParam("end") String end, Map<String, Object> map){
        
        Puser CurrentUser = GetCurrentUser();
        
        map.put("UserData", CurrentUser);

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dStart = new Date();
        Date dEnd = new Date();
        try {
            dStart = format.parse(start);
            dEnd = format.parse(end);
        } catch (ParseException ex) {
            Logger.getLogger(MedecinsSheduler.class.getName()).log(Level.SEVERE, null, ex);
        }
        // firstDayOfWeek(new Date()), lastDayOfWeek(new Date())
        List<Planning> pls = this.planningService.getPLByWeekAndSub(dStart, dEnd, CurrentUser.getPlSubId());
        
        List<PlJson> pljs = new ArrayList<PlJson>();
        
        for(int i = 0; i < pls.size(); i++){
            PlJson plj = new PlJson();
            
            plj.setTitle(pls.get(i).getNom() + " " + pls.get(i).getPrenom());
            plj.setStart(generateDate(pls.get(i).getDateCons(), pls.get(i).getHeure()));
            plj.setEnd(generateEndDate(pls.get(i).getDateCons(), pls.get(i).getHeure(), pls.get(i).getDuree()));
            plj.setUrl("http://my.ivf.kz/med/patients/info/" + pls.get(i).getPatientsId());
            plj.setDescription(pls.get(i).getCommentaire());
            
            pljs.add(plj);
        }
        
        ObjectMapper mapper = new ObjectMapper();
        String res = "";
        try {
            res = mapper.writeValueAsString(pljs);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        map.put("body", res);

        return "json";
    }
    // GENERATE DATE
    private String generateDate(Date date, int val){
        
        String res = "";
        String fixs = "" + val;
        
        char[] fix = fixs.toCharArray();
        res = new SimpleDateFormat("yyyy-MM-dd").format(date);
        res = res + "T" + (fix.length == 3 ? "0" + fix[0] + ":" + fix[1] + fix[2] : fix[0] + "" + fix[1] + ":" + fix[2] + "" + fix[3]) + ":00";
        
        return res;
    }  
    // GENERATE END DATE
    private String generateEndDate(Date date, int val, int dure){
        
        String res = "";
        String fixs = "" + val;
        
        char[] fix = fixs.toCharArray();
        String h = (fix.length == 3 ? "" + fix[0] : fix[0] + "" + fix[1]);
        String m = (fix.length == 3 ? "" + fix[1] + "" + fix[2] : fix[2] + "" + fix[3]);
        int hh = Integer.parseInt(h);
        int mm = Integer.parseInt(m);
        int mmm = mm + dure;
        int mmmm = mmm - 60;
        String fh = "";
        String fm = "";
        if(mmmm >= 0){
            fh = "" + (hh + 1);
            fm = "" + mmmm;
        } else {
            fh = "" + hh;
            fm = "" + mmm;
        }
        System.out.println(fh);
        System.out.println(fm);
        res = new SimpleDateFormat("yyyy-MM-dd").format(date);
        res = res + "T" + (fh.length() == 1 ? "0" + fh + ":" + (fm.length() > 1 ? fm : fm + "0"): fh + ":" + (fm.length() > 1 ? fm : fm + "0")) + ":00";
        System.out.println(res);
        return res;
    }
    // GET FIRST DAY OF WEEK BY DATE
    private static Date firstDayOfWeek(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK) - c.getFirstDayOfWeek();
        c.add(Calendar.DAY_OF_MONTH, -dayOfWeek);

        Date weekStart = c.getTime();
        c.add(Calendar.DAY_OF_MONTH, 6);
        Date weekEnd = c.getTime();
        return weekStart;
    }
    // GET LAST DAY OF WEEK BY DATE
    private static Date lastDayOfWeek(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK) - c.getFirstDayOfWeek();
        c.add(Calendar.DAY_OF_MONTH, -dayOfWeek);

        Date weekStart = c.getTime();
        c.add(Calendar.DAY_OF_MONTH, 6);
        Date weekEnd = c.getTime();
        return weekEnd;
    }

    // GET CURRENT USER FOR INDEX PAGE INFO
    private Puser GetCurrentUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (null == auth) {
            // throw new NotFndException("");
        }

        Object obj = auth.getPrincipal();

        String username = "";

        if (obj instanceof UserDetails) {
            username = ((UserDetails) obj).getUsername();
        } else {
            username = obj.toString();
        }

        return userService.getUserbyLogin(username);
    }
}

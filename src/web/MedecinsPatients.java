/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.medialog.Motconsu;
import domain.medialog.Patients;
import domain.postgres.Puser;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pojo.AaDataMotconsu;
import pojo.AaDataPatients;
import pojo.MotconsuPOJO;
import pojo.PatientsPOJO;
import service.medialog.MotconsuService;
import service.medialog.PatientsService;
import service.postgres.UsersService;

/**
 *
 * @author kvo
 */
@Controller
public class MedecinsPatients {
    @Autowired
    UsersService userService;
    
    @Autowired
    PatientsService patientsService;
    
    @Autowired
    MotconsuService motconsuService;
    
    @RequestMapping(value="/med/patients", method= RequestMethod.GET)
    public String getSchedule(Map<String, Object> map){
        
        Puser CurrentUser = GetCurrentUser();
        
        map.put("UserData", CurrentUser);
                     
        map.put("loadContent", "/WEB-INF/views/doctor/patients/list.jsp");
        
        return "index";
    }
    // JSON
    @RequestMapping(value="/med/patients/json", method={RequestMethod.POST,RequestMethod.GET})
    public String getPatientsJSON(HttpServletRequest request, Map<String, Object> map){
        
        Integer iDisplayStart = 0;
        String searchParameter = request.getParameter("sSearch");
        Integer pageDisplayLength = Integer.valueOf(request.getParameter("iDisplayLength"));
        
        Integer pageNumber = 0;
        if (null != request.getParameter("iDisplayStart")){
                iDisplayStart = Integer.valueOf(request.getParameter("iDisplayStart"));
    		pageNumber = (iDisplayStart/10)+1;	
        }
      
        Puser CurrentUser = GetCurrentUser();
        
        map.put("UserData", CurrentUser);
        
        Integer patientsCount = 0;
        List<Patients> pts = new ArrayList<Patients>();
        if(searchParameter.isEmpty()){
            pts = this.patientsService.GetPatientsListByPage(pageNumber, pageDisplayLength);
            patientsCount = this.patientsService.GetPatientsCount();
        } else {
            pts = this.patientsService.GetPatientsListByPageAndSearchParam(pageNumber, pageDisplayLength, searchParameter);
            patientsCount = this.patientsService.GetPatientsCountBySearch(searchParameter);
        }
        List<PatientsPOJO> patPojo = new ArrayList<PatientsPOJO>();
        
        for(int i = 0; i < pts.size(); i++){
            PatientsPOJO pj = new PatientsPOJO();
            String bDate = "";
            String FIO = "";
            String type = "Пациент";
            if(pts.get(i).getNeLe() != null){
                bDate = new SimpleDateFormat("yyyy-MM-dd").format(pts.get(i).getNeLe());
            }
            if(pts.get(i).getNom() != null){
                FIO = pts.get(i).getNom();
            }
            if(pts.get(i).getPrenom() != null){
                FIO += " " + pts.get(i).getPrenom();
            }
            if(pts.get(i).getPatronyme() != null){
                FIO += " " + pts.get(i).getPatronyme();
            }
            pj.setPatId(pts.get(i).getPatientsId());
            pj.setFIO(FIO);
            pj.setbDate(bDate);
            pj.setType(type);
            
            patPojo.add(pj);
        }
        
        AaDataPatients aaData = new AaDataPatients();
        aaData.setiTotalDisplayRecords(patientsCount);
        aaData.setiTotalRecords(patientsCount);
//        aaData.setsColumns("");
        aaData.setAaData(patPojo);        
                
        ObjectMapper mapper = new ObjectMapper();
        String res = "";
        try {
            res = mapper.writeValueAsString(aaData);
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
    // GET PATIENT INFORMATION
    @RequestMapping("/med/patients/info/{patId}")
    public String getPatientsInfo(@PathVariable("patId") Integer patId, Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();

        map.put("patId", patId);
        map.put("loadContent", "/WEB-INF/views/doctor/patients/info/index.jsp");
        return "index";            
    }
    // GET MOTCONSU
    @RequestMapping(method={RequestMethod.POST,RequestMethod.GET} , value="/med/getmotconsu/{patId}")
    public String getMotconsu(@PathVariable("patId") Integer patId, Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();        

        if (CurrentUser != null) {
            List<Motconsu> mtcs = this.motconsuService.getMotconsuListByPatientId(patId);          
            
            String mtcsDataJson = "";
            if (mtcs != null) {
                List<MotconsuPOJO> mtcsPojo = new ArrayList<MotconsuPOJO>();
                Locale dLocale = new Locale.Builder().setLanguage("ru").setScript("Cyrl").build();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MMMMM.dd", dLocale);
                for(int i = 0; i < mtcs.size(); i++){
                    String medecinsNPS = ((Motconsu)mtcs.get(i)).getMedecinsId().getSpecialisation() + " " + 
                            ((Motconsu)mtcs.get(i)).getMedecinsId().getNom() + " " + 
                            ((Motconsu)mtcs.get(i)).getMedecinsId().getPrenom();
                    String url = "";
                    switch(((Motconsu)mtcs.get(i)).getModelsId().getModelsID()){
                        case 180: 
                            url = "/med/patients/tests/180/" + ((Motconsu)mtcs.get(i)).getMotconsuId();
                            break;
                        case 181:
                            url = "/med/patients/tests/181/" + ((Motconsu) mtcs.get(i)).getMotconsuId();
                            break;
                        case 222:
                            url = "/med/patients/tests/222/" + ((Motconsu) mtcs.get(i)).getMotconsuId();
                            break;
                        case 257:
                            url = "/med/patients/tests/257/" + ((Motconsu) mtcs.get(i)).getMotconsuId();
                            break;
                        default: url = "";
                            break;
                        
                    }
                    
                    mtcsPojo.add(new MotconsuPOJO(
                            ((Motconsu)mtcs.get(i)).getMotconsuId(), 
                            ((Motconsu)mtcs.get(i)).getModelsId().getModeleName(), 
                            formatter.format(((Motconsu)mtcs.get(i)).getDateConsultation()), 
                            medecinsNPS, url));
                }
                ObjectMapper mapper = new ObjectMapper();
                AaDataMotconsu aa = new AaDataMotconsu();
                aa.setAaData(mtcsPojo);
                try {                    
                    mtcsDataJson = mapper.writeValueAsString(aa);
                } catch (JsonGenerationException e) {
                    e.printStackTrace();
                } catch (JsonMappingException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            
            map.put("body", mtcsDataJson);
            
            return "json";
        } else {
            // ЕСЛИ НЕ АВТОРИЗОВАН ПЕРЕНАПРАВИТЬ НА СТРАНИЦУ АВТОРИЗАЦИИ
            return "login";
        }
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

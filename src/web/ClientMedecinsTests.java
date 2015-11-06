/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.medialog.Motconsu;
import domain.postgres.Puser;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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
import pojo.MotconsuPOJO;
import service.medialog.ModelsService;
import service.medialog.MotconsuService;
import service.postgres.UsersService;

/**
 *
 * @author kvo
 */
@Controller
public class ClientMedecinsTests {
    
    @Autowired
    UsersService userService;
    
    @Autowired
    MotconsuService motconsuService;
    
    @Autowired
    ModelsService modelsService;
    
    @RequestMapping("/generallbloodanalysis/{modelid}")
    public String getBloodAnalysis(@PathVariable("modelid") Integer modelId, Map<String, Object> map) {
        
        map.put("modelId", modelId);
        map.put("loadContent", "/WEB-INF/views/clients/tests/blood/list.jsp");

        return "index";
        
    }
    // АНАЛИЗ КРОВИ
    @RequestMapping("/generallbloodanalysis/print/{motconsuid}")
    public String getGenerallBloodAnalysis(@PathVariable("motconsuid") Integer motconsuId, Map<String, Object> map) {
        
        Motconsu mtcs = this.motconsuService.getMotconsuById(motconsuId);
        
        map.put("GBA", mtcs.getData328());
        map.put("loadContent", "/WEB-INF/views/clients/tests/blood/print.jsp");

        return "index";
        
    }
    // АНАЛИЗ КРОВИ JSON
    // JSON ESB
    @RequestMapping(method={RequestMethod.POST,RequestMethod.GET} , value="/generallbloodanalysis/json/{modelid}")
    public String getGenerallBlodAnalysis(@PathVariable("modelid") Integer modelId, Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();        

        if (CurrentUser != null) {
            List<Motconsu> mtcs = this.motconsuService.getMotconsuListByPatientIdAndModel(CurrentUser.getPatientId(), this.modelsService.getModeleById(modelId));          
            
            String mtcsDataJson = "";
            if (mtcs != null) {
                List<MotconsuPOJO> mtcsPojo = new ArrayList<MotconsuPOJO>();
                Locale dLocale = new Locale.Builder().setLanguage("ru").setScript("Cyrl").build();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MMMMM.dd", dLocale);
                for(int i = 0; i < mtcs.size(); i++){
                    String medecinsNPS = ((Motconsu)mtcs.get(i)).getMedecinsId().getSpecialisation() + " " + 
                            ((Motconsu)mtcs.get(i)).getMedecinsId().getNom() + " " + 
                            ((Motconsu)mtcs.get(i)).getMedecinsId().getPrenom();
                    mtcsPojo.add(new MotconsuPOJO(
                            ((Motconsu)mtcs.get(i)).getMotconsuId(), 
                            ((Motconsu)mtcs.get(i)).getModelsId().getModeleName(), 
                            formatter.format(((Motconsu)mtcs.get(i)).getDateConsultation()), 
                            medecinsNPS));
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
    // АНАЛИЗ ПРОСТАТЫ
    @RequestMapping("/analiz-sekreta/{modelid}")
    public String getASL(@PathVariable("modelid") Integer modelId, Map<String, Object> map) {
        
        map.put("modelId", modelId);
        map.put("loadContent", "/WEB-INF/views/clients/tests/analizsekreta/list.jsp");

        return "index";
        
    }
    // АНАЛИЗ ПРОСТАТЫ
    @RequestMapping("/analiz-sekreta/print/{motconsuid}")
    public String getAnalizSekreta(@PathVariable("motconsuid") Integer motconsuId, Map<String, Object> map) {
        
        Motconsu mtcs = this.motconsuService.getMotconsuById(motconsuId);
        
        map.put("GBA", mtcs.getData143());
        map.put("loadContent", "/WEB-INF/views/clients/tests/analizsekreta/print.jsp");

        return "index";
        
    }
    // АНАЛИЗ ПРОСТАТЫ JSON
    // JSON ESB
    @RequestMapping(method={RequestMethod.POST,RequestMethod.GET} , value="/analiz-sekreta/json/{modelid}")
    public String getAnalizSekretaJSON(@PathVariable("modelid") Integer modelId, Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();        

        if (CurrentUser != null) {
            List<Motconsu> mtcs = this.motconsuService.getMotconsuListByPatientIdAndModel(CurrentUser.getPatientId(), this.modelsService.getModeleById(modelId));          
            
            String mtcsDataJson = "";
            if (mtcs != null) {
                List<MotconsuPOJO> mtcsPojo = new ArrayList<MotconsuPOJO>();
                Locale dLocale = new Locale.Builder().setLanguage("ru").setScript("Cyrl").build();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MMMMM.dd", dLocale);
                for (int i = 0; i < mtcs.size(); i++) {
                    if (((Motconsu) mtcs.get(i)).getData143() != null) {
                        String medecinsNPS = ((Motconsu) mtcs.get(i)).getMedecinsId().getSpecialisation() + " "
                                + ((Motconsu) mtcs.get(i)).getMedecinsId().getNom() + " "
                                + ((Motconsu) mtcs.get(i)).getMedecinsId().getPrenom();
                        mtcsPojo.add(new MotconsuPOJO(
                                ((Motconsu) mtcs.get(i)).getMotconsuId(),
                                ((Motconsu) mtcs.get(i)).getModelsId().getModeleName(),
                                formatter.format(((Motconsu) mtcs.get(i)).getDateConsultation()),
                                medecinsNPS));
                    }
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
    // 1. АНАЛИЗ МАЗКИ ФЛОРЫ
    @RequestMapping("/mazok-flora/{modelid}")
    public String getMF(@PathVariable("modelid") Integer modelId, Map<String, Object> map) {
        
        map.put("modelId", modelId);
        map.put("loadContent", "/WEB-INF/views/clients/tests/mazkiflor/list.jsp");

        return "index";
        
    }
    // 2. АНАЛИЗ МАЗКИ ФЛОРЫ
    @RequestMapping("/mazok-flora/print/{motconsuid}")
    public String getAnalizMF(@PathVariable("motconsuid") Integer motconsuId, Map<String, Object> map) {
        
        Motconsu mtcs = this.motconsuService.getMotconsuById(motconsuId);
        
        map.put("GBA", mtcs.getData144());
        map.put("loadContent", "/WEB-INF/views/clients/tests/mazkiflor/print.jsp");

        return "index";
        
    }
    // АНАЛИЗ МАЗКИ ФЛОРЫ JSON
    // 3. JSON ESB
    @RequestMapping(method={RequestMethod.POST,RequestMethod.GET} , value="/mazok-flora/json/{modelid}")
    public String getAnalizMFJSON(@PathVariable("modelid") Integer modelId, Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();        

        if (CurrentUser != null) {
            List<Motconsu> mtcs = this.motconsuService.getMotconsuListByPatientIdAndModel(CurrentUser.getPatientId(), this.modelsService.getModeleById(modelId));          
            
            String mtcsDataJson = "";
            if (mtcs != null) {
                List<MotconsuPOJO> mtcsPojo = new ArrayList<MotconsuPOJO>();
                Locale dLocale = new Locale.Builder().setLanguage("ru").setScript("Cyrl").build();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MMMMM.dd", dLocale);
                for (int i = 0; i < mtcs.size(); i++) {
                    if (((Motconsu) mtcs.get(i)).getData144() != null) {
                        String medecinsNPS = ((Motconsu) mtcs.get(i)).getMedecinsId().getSpecialisation() + " "
                                + ((Motconsu) mtcs.get(i)).getMedecinsId().getNom() + " "
                                + ((Motconsu) mtcs.get(i)).getMedecinsId().getPrenom();
                        mtcsPojo.add(new MotconsuPOJO(
                                ((Motconsu) mtcs.get(i)).getMotconsuId(),
                                ((Motconsu) mtcs.get(i)).getModelsId().getModeleName(),
                                formatter.format(((Motconsu) mtcs.get(i)).getDateConsultation()),
                                medecinsNPS));
                    }
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
    
    
    
    
    
    
    //Анализ ГормонГормоны
    
    
    
      // 1. АНАЛИЗ ГОРМОН ГОРМОНЫ
    @RequestMapping("/gormon-gormoni/{modelid}")
    public String getGG(@PathVariable("modelid") Integer modelId, Map<String, Object> map) {
        
        map.put("modelId", modelId);
        map.put("loadContent", "/WEB-INF/views/clients/tests/gormoni/gormon/list.jsp");

        return "index";
        
    }
    // 2. АНАЛИЗ ГОРМОН ГОРМОНЫ
    @RequestMapping("/gormon-gormoni/print/{motconsuid}")
    public String getAnalizGG(@PathVariable("motconsuid") Integer motconsuId, Map<String, Object> map) {
        
        Motconsu mtcs = this.motconsuService.getMotconsuById(motconsuId);
        
        map.put("GBA", mtcs.getData146());
        map.put("loadContent", "/WEB-INF/views/clients/tests/gormoni/gormon/print.jsp");

        return "index";
        
    }
    // АНАЛИЗ ГОРМОН ГОРМОНЫ JSON
    // 3. JSON ESB
    @RequestMapping(method={RequestMethod.POST,RequestMethod.GET} , value="/gormon-gormoni/json/{modelid}")
    public String getAnalizGGJSON(@PathVariable("modelid") Integer modelId, Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();        

        if (CurrentUser != null) {
            List<Motconsu> mtcs = this.motconsuService.getMotconsuListByPatientIdAndModel(CurrentUser.getPatientId(), this.modelsService.getModeleById(modelId));          
            
            String mtcsDataJson = "";
            if (mtcs != null) {
                List<MotconsuPOJO> mtcsPojo = new ArrayList<MotconsuPOJO>();
                Locale dLocale = new Locale.Builder().setLanguage("ru").setScript("Cyrl").build();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MMMMM.dd", dLocale);
                for (int i = 0; i < mtcs.size(); i++) {
                    if (((Motconsu) mtcs.get(i)).getData146() != null) {
                        String medecinsNPS = ((Motconsu) mtcs.get(i)).getMedecinsId().getSpecialisation() + " "
                                + ((Motconsu) mtcs.get(i)).getMedecinsId().getNom() + " "
                                + ((Motconsu) mtcs.get(i)).getMedecinsId().getPrenom();
                        mtcsPojo.add(new MotconsuPOJO(
                                ((Motconsu) mtcs.get(i)).getMotconsuId(),
                                ((Motconsu) mtcs.get(i)).getModelsId().getModeleName(),
                                formatter.format(((Motconsu) mtcs.get(i)).getDateConsultation()),
                                medecinsNPS));
                    }
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
    

      // 1. АНАЛИЗ ГОРМОН ХГЧ
    @RequestMapping("/gormon-hg/{modelid}")
    public String getGH(@PathVariable("modelid") Integer modelId, Map<String, Object> map) {
        
        map.put("modelId", modelId);
        map.put("loadContent", "/WEB-INF/views/clients/tests/gormoni/hg/list.jsp");

        return "index";
        
    }
    // 2. АНАЛИЗ ГОРМОН ХГЧ
    @RequestMapping("/gormon-hg/print/{motconsuid}")
    public String getAnalizGH(@PathVariable("motconsuid") Integer motconsuId, Map<String, Object> map) {
        
        Motconsu mtcs = this.motconsuService.getMotconsuById(motconsuId);
        
        map.put("GBA", mtcs.getData262());
        map.put("loadContent", "/WEB-INF/views/clients/tests/gormoni/hg/print.jsp");

        return "index";
        
    }
    // АНАЛИЗ ГОРМОН ХГЧ JSON
    // 3. JSON ESB
    @RequestMapping(method={RequestMethod.POST,RequestMethod.GET} , value="/gormon-hg/json/{modelid}")
    public String getAnalizGHJSON(@PathVariable("modelid") Integer modelId, Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();        

        if (CurrentUser != null) {
            List<Motconsu> mtcs = this.motconsuService.getMotconsuListByPatientIdAndModel(CurrentUser.getPatientId(), this.modelsService.getModeleById(modelId));          
            
            String mtcsDataJson = "";
            if (mtcs != null) {
                List<MotconsuPOJO> mtcsPojo = new ArrayList<MotconsuPOJO>();
                Locale dLocale = new Locale.Builder().setLanguage("ru").setScript("Cyrl").build();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MMMMM.dd", dLocale);
                for (int i = 0; i < mtcs.size(); i++) {
                    if (((Motconsu) mtcs.get(i)).getData262() != null) {
                        String medecinsNPS = ((Motconsu) mtcs.get(i)).getMedecinsId().getSpecialisation() + " "
                                + ((Motconsu) mtcs.get(i)).getMedecinsId().getNom() + " "
                                + ((Motconsu) mtcs.get(i)).getMedecinsId().getPrenom();
                        mtcsPojo.add(new MotconsuPOJO(
                                ((Motconsu) mtcs.get(i)).getMotconsuId(),
                                ((Motconsu) mtcs.get(i)).getModelsId().getModeleName(),
                                formatter.format(((Motconsu) mtcs.get(i)).getDateConsultation()),
                                medecinsNPS));
                    }
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
    
    
    
    
    
    
      // 1. АНАЛИЗ КАРИОТИП
    @RequestMapping("/kariotip/{modelid}")
    public String getKariotip(@PathVariable("modelid") Integer modelId, Map<String, Object> map) {
        
        map.put("modelId", modelId);
        map.put("loadContent", "/WEB-INF/views/clients/tests/kariotip/list.jsp");

        return "index";
        
    }
    // 2. АНАЛИЗ КАРИОТИП
    @RequestMapping("/kariotip/print/{motconsuid}")
    public String getAnalizKariotip(@PathVariable("motconsuid") Integer motconsuId, Map<String, Object> map) {
        
        Motconsu mtcs = this.motconsuService.getMotconsuById(motconsuId);
        
        map.put("GBA", mtcs.getData269());
        map.put("loadContent", "/WEB-INF/views/clients/tests/kariotip/print.jsp");

        return "index";
        
    }
    // АНАЛИЗ КАРИОТИП JSON
    // 3. JSON ESB
    @RequestMapping(method={RequestMethod.POST,RequestMethod.GET} , value="/kariotip/json/{modelid}")
    public String getAnalizKariotipJSON(@PathVariable("modelid") Integer modelId, Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();        

        if (CurrentUser != null) {
            List<Motconsu> mtcs = this.motconsuService.getMotconsuListByPatientIdAndModel(CurrentUser.getPatientId(), this.modelsService.getModeleById(modelId));          
            
            String mtcsDataJson = "";
            if (mtcs != null) {
                List<MotconsuPOJO> mtcsPojo = new ArrayList<MotconsuPOJO>();
                Locale dLocale = new Locale.Builder().setLanguage("ru").setScript("Cyrl").build();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MMMMM.dd", dLocale);
                for (int i = 0; i < mtcs.size(); i++) {
                    if (((Motconsu) mtcs.get(i)).getData269() != null) {
                        String medecinsNPS = ((Motconsu) mtcs.get(i)).getMedecinsId().getSpecialisation() + " "
                                + ((Motconsu) mtcs.get(i)).getMedecinsId().getNom() + " "
                                + ((Motconsu) mtcs.get(i)).getMedecinsId().getPrenom();
                        mtcsPojo.add(new MotconsuPOJO(
                                ((Motconsu) mtcs.get(i)).getMotconsuId(),
                                ((Motconsu) mtcs.get(i)).getModelsId().getModeleName(),
                                formatter.format(((Motconsu) mtcs.get(i)).getDateConsultation()),
                                medecinsNPS));
                    }
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
    
 
      // 1. АНАЛИЗ Мазки проба Шуварского
    @RequestMapping("/mazki-sh/{modelid}")
    public String getFloraSh(@PathVariable("modelid") Integer modelId, Map<String, Object> map) {
        
        map.put("modelId", modelId);
        map.put("loadContent", "/WEB-INF/views/clients/tests/mazki/shuvar/list.jsp");

        return "index";
        
    }
    // 2. АНАЛИЗ Мазки проба Шуварского
    @RequestMapping("/mazki-sh/print/{motconsuid}")
    public String getAnalizFloraSh(@PathVariable("motconsuid") Integer motconsuId, Map<String, Object> map) {
        
        Motconsu mtcs = this.motconsuService.getMotconsuById(motconsuId);
        
        map.put("GBA", mtcs.getData269());
        map.put("loadContent", "/WEB-INF/views/clients/tests/mazki/shuvar/print.jsp");

        return "index";
    
    }
    // АНАЛИЗ Мазки проба Шуварского JSON
    // 3. JSON ESB
    @RequestMapping(method={RequestMethod.POST,RequestMethod.GET} , value="/mazki-sh/json/{modelid}")
    public String getAnalizFloraShJSON(@PathVariable("modelid") Integer modelId, Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();        

        if (CurrentUser != null) {
            List<Motconsu> mtcs = this.motconsuService.getMotconsuListByPatientIdAndModel(CurrentUser.getPatientId(), this.modelsService.getModeleById(modelId));          
            
            String mtcsDataJson = "";
            if (mtcs != null) {
                List<MotconsuPOJO> mtcsPojo = new ArrayList<MotconsuPOJO>();
                Locale dLocale = new Locale.Builder().setLanguage("ru").setScript("Cyrl").build();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MMMMM.dd", dLocale);
                for (int i = 0; i < mtcs.size(); i++) {
                    if (((Motconsu) mtcs.get(i)).getData269() != null) {
                        String medecinsNPS = ((Motconsu) mtcs.get(i)).getMedecinsId().getSpecialisation() + " "
                                + ((Motconsu) mtcs.get(i)).getMedecinsId().getNom() + " "
                                + ((Motconsu) mtcs.get(i)).getMedecinsId().getPrenom();
                        mtcsPojo.add(new MotconsuPOJO(
                                ((Motconsu) mtcs.get(i)).getMotconsuId(),
                                ((Motconsu) mtcs.get(i)).getModelsId().getModeleName(),
                                formatter.format(((Motconsu) mtcs.get(i)).getDateConsultation()),
                                medecinsNPS));
                    }
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
    

    
    // 1. АНАЛИЗ БИОХИМИЯ ОАМ
    @RequestMapping("/biohim-oam/{modelid}")
    public String getBioOak(@PathVariable("modelid") Integer modelId, Map<String, Object> map) {
        
        map.put("modelId", modelId);
        map.put("loadContent", "/WEB-INF/views/clients/tests/biohim/oam/list.jsp");

        return "index";
        
    }
    // 2. АНАЛИЗ БИОХИМИЯ ОАМ
    @RequestMapping("/biohim-oam/print/{motconsuid}")
    public String getAnalizBioOak(@PathVariable("motconsuid") Integer motconsuId, Map<String, Object> map) {
        
        Motconsu mtcs = this.motconsuService.getMotconsuById(motconsuId);
        
        map.put("GBA", mtcs.getData329());
        map.put("loadContent", "/WEB-INF/views/clients/tests/biohim/oam/print.jsp");

        return "index";
    
    }
    // АНАЛИЗ  БИОХИМИЯ ОАМ JSON
    // 3. JSON ESB
    @RequestMapping(method={RequestMethod.POST,RequestMethod.GET} , value="/biohim-oam/json/{modelid}")
    public String getAnalizBioOakJSON(@PathVariable("modelid") Integer modelId, Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();        

        if (CurrentUser != null) {
            List<Motconsu> mtcs = this.motconsuService.getMotconsuListByPatientIdAndModel(CurrentUser.getPatientId(), this.modelsService.getModeleById(modelId));          
            
            String mtcsDataJson = "";
            if (mtcs != null) {
                List<MotconsuPOJO> mtcsPojo = new ArrayList<MotconsuPOJO>();
                Locale dLocale = new Locale.Builder().setLanguage("ru").setScript("Cyrl").build();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MMMMM.dd", dLocale);
                for (int i = 0; i < mtcs.size(); i++) {
                    if (((Motconsu) mtcs.get(i)).getData329() != null) {
                        String medecinsNPS = ((Motconsu) mtcs.get(i)).getMedecinsId().getSpecialisation() + " "
                                + ((Motconsu) mtcs.get(i)).getMedecinsId().getNom() + " "
                                + ((Motconsu) mtcs.get(i)).getMedecinsId().getPrenom();
                        mtcsPojo.add(new MotconsuPOJO(
                                ((Motconsu) mtcs.get(i)).getMotconsuId(),
                                ((Motconsu) mtcs.get(i)).getModelsId().getModeleName(),
                                formatter.format(((Motconsu) mtcs.get(i)).getDateConsultation()),
                                medecinsNPS));
                    }
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

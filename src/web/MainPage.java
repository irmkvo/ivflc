package web;

import static com.google.common.net.HttpHeaders.USER_AGENT;
import domain.postgres.Puser;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.postgres.MenuService;
import service.postgres.PagesService;
import service.postgres.UsersService;

@Controller
public class MainPage {

    @Autowired
    UsersService userService;

    @Autowired
    MenuService menuService;

    @Autowired
    PagesService pagesService;

    @RequestMapping("/index")
    public String getPageOnRole(Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();

        if (CurrentUser != null) {
            if ("ROLE_ADMIN".equals(CurrentUser.getRole().getRoleName())) {
                map.put("loadContent", "/WEB-INF/views/clients/index.jsp");
                return "index";
            } else if ("ROLE_DOCTOR".equals(CurrentUser.getRole().getRoleName())) {
                map.put("loadContent", "/WEB-INF/views/doctor/schedule/schedule.jsp");
                return "index";
            } else {
                return "index";
            }
        } else {
            // ЕСЛИ НЕ АВТОРИЗОВАН ПЕРЕНАПРАВИТЬ НА СТРАНИЦУ АВТОРИЗАЦИИ
            return pagesService.getLoginPages().getPageurl();
        }
    }

    @RequestMapping("/")
    public String home(Map<String, Object> map) {

        map.put("loadContent", "/WEB-INF/views/login.jsp");

        return "login";
    }

    // GET ADMIN MAIN PAGE
    @RequestMapping("/admin/index")
    public String getAdministrativPanel(Map<String, Object> map) {

        map.put("loadContent", "/WEB-INF/views/template/default/content.jsp");

        return "index";
    }
    
    // GET ADMIN MAIN PAGE
    @RequestMapping("/testpost")
    public String testpost(Map<String, Object> map) {

        try {
            sendPost();
        } catch (Exception ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        map.put("loadContent", "/WEB-INF/views/testPOST.jsp");

        return "blank-template";
    }

    // HTTP POST request
    private void sendPost() throws Exception {

        String url = "http://api.seasonvar.ru/";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        String urlParameters = "key=8e2595cd&command=getSerialList";

        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

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

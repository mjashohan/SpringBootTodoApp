package com.shohan.springboot.myfirstwebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
@SessionAttributes("name")
public class WelcomeController {

//    private AuthenticationService authenticationService;
//
//    public LoginController(AuthenticationService authenticationService) {
//        super();
//        this.authenticationService = authenticationService;
//    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String goToWelcomePage(ModelMap modelMap) {
        modelMap.put("name", getLoggedinUsername());
        return "welcome";
    }

    private String getLoggedinUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
//    @RequestMapping(value="login", method = RequestMethod.POST)
//    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap modelMap) {
//        if(authenticationService.authenticate(name, password)) {
//            modelMap.put("name", name);
//            return "welcome";
//        }
//        modelMap.put("errorMessage", "Invalid Credentials! Please try again.");
//        return "login";
//    }

}

package vf.securityService.securityService.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/loginFailure")
    public String loginFailure(HttpServletRequest request) {
        return "loginFailure";
    }

    @RequestMapping(value = "/logout")
    public ModelAndView logout() {
        return new ModelAndView("redirect:" + "http://localhost:8081/");
    }

}

package dualsoft.vf.bookmakerclient.controller;

import dualsoft.vf.bookmakerclient.config.PersistenceContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.util.WebUtils;

@Controller
public class HomeController {

    @Autowired
    PersistenceContext ds;

    @GetMapping("/")
    public String get(HttpServletRequest request, Model model) {
        return "home";
    }
}

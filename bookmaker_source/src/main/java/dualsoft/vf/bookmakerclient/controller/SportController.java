package dualsoft.vf.bookmakerclient.controller;

import dualsoft.vf.bookmakerclient.services.SportService;
import dualsoft.vf.jooq.model.tables.pojos.VfSport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/sport")
public class SportController {

    @Autowired
    SportService service;

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("addedSport", new VfSport());
        model.addAttribute("updatedSport", new VfSport());
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @GetMapping
    public String getAllSports(Model model) {
        model.addAttribute("sports", service.getAllSports());
        return "sport";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @PostMapping("/addSport")
    public String addSport(@ModelAttribute("addedSport") VfSport sport) {
        service.addSport(sport);
        return "redirect:/sport";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @RequestMapping("/deleteSport/{code}")
    public String deleteSport(@PathVariable String code) {
        service.deleteSport(code);
        return "redirect:/sport";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @PostMapping("/updateSport")
    public String update(@ModelAttribute("updatedSport") VfSport sport) {
        service.updateSport(sport);
        return "redirect:/sport";
    }

}

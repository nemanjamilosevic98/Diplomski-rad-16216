package dualsoft.vf.bookmakerclient.controller;

import dualsoft.vf.bookmakerclient.services.LeagueService;
import dualsoft.vf.bookmakerclient.services.SportService;
import dualsoft.vf.jooq.model.tables.pojos.VfLeague;
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
@RequestMapping("/league")
public class LeagueController {

    @Autowired
    LeagueService service;

    @Autowired
    SportService serviceSport;

    private String specifiedSport;

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("addedLeague", new VfLeague());
        model.addAttribute("updatedLeague", new VfLeague());
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @GetMapping
    public String getAllLeagues(Model model) {
        specifiedSport = null;
        model.addAttribute("leagues", service.getAllLeaguesDTO());
        model.addAttribute("sports", serviceSport.getAllSports()); //da bi se upravljalo svim sportovima, ovo je opsta forma!!!
        model.addAttribute("title", "All Leagues");
        return "league";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @PostMapping("/addLeague")
    public String addLeague(@ModelAttribute("addedLeague") VfLeague league) {
        service.addLeague(league);
        if (specifiedSport == null) {
            return "redirect:/league";
        } else {
            return "redirect:/league/sport/" + specifiedSport;
        }
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @RequestMapping("/deleteLeague/{id}")
    public String deleteLeague(@PathVariable int id) {
        service.deleteLeague(id);
        if (specifiedSport == null) {
            return "redirect:/league";
        } else {
            return "redirect:/league/sport/" + specifiedSport;
        }
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @PostMapping("/updateLeague")
    public String update(@ModelAttribute("updatedLeague") VfLeague league) {
        service.updateLeague(league);
        if (specifiedSport == null) {
            return "redirect:/league";
        } else {
            return "redirect:/league/sport/" + specifiedSport;
        }
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @GetMapping("/sport/{code}")
    public String getLeaguesForSport(@PathVariable String code, Model model) {
        specifiedSport = code;
        model.addAttribute("leagues", service.getAllLeaguesDTOForSport(code));
        model.addAttribute("sports", serviceSport.getSportByCode(code)); //da bi se upravljalo samo Ligama za izabrani sport!!!
        model.addAttribute("title", serviceSport.getSportByCode(code).getName() + " Leagues");
        return "league";
    }

}

package dualsoft.vf.bookmakerclient.controller;

import dualsoft.vf.bookmakerclient.services.LeagueService;
import dualsoft.vf.bookmakerclient.services.TeamService;
import dualsoft.vf.jooq.model.tables.pojos.VfTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/team")
public class TeamController {

    @Autowired
    TeamService teamService;

    @Autowired
    LeagueService leagueService;

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("updatedTeam", new VfTeam());
        model.addAttribute("addedTeam", new VfTeam());
        model.addAttribute("leagues", leagueService.getAllLeagues());
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @GetMapping
    public String getAllTeams(Model model) {

        model.addAttribute("teams", teamService.getAllTeams());
        //model.addAttribute("teams", teamService.getAllTeamsForView());
        return "team";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @GetMapping(value = "/{id}")
    public String getTeam(@PathVariable("id") String id) {
        System.out.println(teamService.getTeamById(id).toString());
        return "team";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @PostMapping("/addTeam")
    public String addTeam(@ModelAttribute("addedTeam") VfTeam team) {
        teamService.addTeam(team);
        return "redirect:/team";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @RequestMapping("/deleteTeam/{id}")
    public String deleteSport(@PathVariable String id) {
        teamService.deleteTeam(id);
        return "redirect:/team";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @RequestMapping(value = "/updateTeam")
    public String update(VfTeam team) {
        teamService.updateTeam(team);
        return "redirect:/team";
    }

}

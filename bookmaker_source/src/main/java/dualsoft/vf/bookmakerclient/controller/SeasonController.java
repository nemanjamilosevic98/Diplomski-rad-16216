/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dualsoft.vf.bookmakerclient.controller;

import dualsoft.vf.bookmakerclient.dtos.LeagueDTO;
import dualsoft.vf.bookmakerclient.dtos.SeasonLeagueDTO;
//import dualsoft.vf.bookmakerclient.kafka.SeasonControlTopic.SeasonProducerMessagingService;
import dualsoft.vf.bookmakerclient.repositories.SeasonRepository;
import dualsoft.vf.bookmakerclient.services.LeagueService;
import dualsoft.vf.jooq.model.tables.pojos.VfSeason;
import dualsoft.vf.jooq.model.tables.pojos.VfSport;
import java.time.LocalDateTime;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author marko
 */
@Controller()
@RequestMapping("/seasoncontrol")
public class SeasonController {

    //@Autowired
    // SeasonProducerMessagingService messageService;
    @Autowired
    LeagueService leagueService;

    @Autowired
    SeasonRepository seasonRepository;

    @PreAuthorize("hasRole('BOOKMAKER')")
    @GetMapping
    public String getSeasonControl(Model model) {
        model.addAttribute("notActiveLeagues", leagueService.getAllNonActiveLeagues());
        model.addAttribute("activeLeagues", leagueService.getAllActiveLeagues());
        model.addAttribute("addedSeason", new VfSeason());
        ArrayList<VfSeason> activeSeasonslist = new ArrayList<VfSeason>();
        return "seasoncontrol";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @RequestMapping("/addseason/{leagueId}")
    public String createSeason(@PathVariable int leagueId, @ModelAttribute("addedSeason") VfSeason season) {
        int seasonId = seasonRepository.createSeason(leagueId, season.getName(), LocalDateTime.now()).getId();
        //messageService.sendCreateSeasonMsg(seasonId, leagueId);

        return "redirect:/seasoncontrol";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @RequestMapping("/pauseseason/{id}")
    public String pauseSeason(@PathVariable String id) {
        System.out.println("Pauzira Sezonu : " + id);
        //messageService.sendPauseSeasonMsg(Integer.parseInt(id));
        return "redirect:/seasoncontrol";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @RequestMapping("/resumeseason/{id}")
    public String resumeSeason(@PathVariable String id) {
        System.out.println("Resumuje Sezonu : " + id);
        //messageService.sendResumeSeasonMsg(Integer.parseInt(id));
        return "redirect:/seasoncontrol";
    }

    @PreAuthorize("hasRole('BOOKMAKER')")
    @GetMapping("/pauseallseasons")
    public String pauseAllSeasons() {

        //messageService.sendPauseAllSeasonsMsg();
        System.out.println("Pauzira sve sezone...");
        return "redirect:/seasoncontrol";
    }
}

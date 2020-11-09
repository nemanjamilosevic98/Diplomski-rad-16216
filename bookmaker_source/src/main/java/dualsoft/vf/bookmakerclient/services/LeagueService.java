package dualsoft.vf.bookmakerclient.services;

import dualsoft.vf.bookmakerclient.dtos.LeagueDTO;
import dualsoft.vf.bookmakerclient.dtos.SeasonLeagueDTO;
import dualsoft.vf.bookmakerclient.repositories.LeagueRepository;
import dualsoft.vf.jooq.model.tables.pojos.VfSeason;
import dualsoft.vf.jooq.model.tables.pojos.VfLeague;
import dualsoft.vf.jooq.model.tables.pojos.VfSport;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LeagueService {

    @Autowired
    //@Qualifier("repository")
    LeagueRepository repository;

    public ArrayList<VfLeague> getAllLeagues() {
        return repository.getAllLeagues();
    }

    public ArrayList<LeagueDTO> getAllLeaguesDTO() {
        return repository.getAllLeaguesDTO();
    }

    public ArrayList<LeagueDTO> getAllLeaguesDTOForSport(String sportCode) {
        return repository.getAllLeaguesDTOForSport(sportCode);
    }

    public VfLeague getLeagueById(int id) {
        return repository.getLeague(id);
    }

    public VfLeague addLeague(VfLeague league) {
        return repository.addLeague(league);
    }

    public VfLeague updateLeague(VfLeague league) {
        return repository.updateLeague(league);
    }

    public VfLeague deleteLeague(int id) {
        return repository.deleteLeague(id);
    }

    public VfSport getSportForLeague(int leagueId) {
        return repository.getSportForLeague(leagueId);
    }

    public LeagueDTO getLeagueDTO(int id) {
        return repository.getLeagueDTO(id);
    }
    
    public ArrayList<SeasonLeagueDTO> getAllActiveLeagues(){
        return repository.getAllActiveLeagues();
    }
    
    public ArrayList<SeasonLeagueDTO> getAllNonActiveLeagues(){
        return repository.getAllNotActiveLeagues();
    }
    
    public VfSeason getActiveSeasonForLeague(int leagueId){
        return repository.getActiveSeasonForLeague(leagueId);
    }

}

package dualsoft.vf.bookmakerclient.repositories;

import dualsoft.vf.bookmakerclient.dtos.LeagueDTO;
import dualsoft.vf.bookmakerclient.dtos.SeasonLeagueDTO;
import dualsoft.vf.jooq.model.tables.pojos.VfSeason;
import dualsoft.vf.jooq.model.tables.pojos.VfLeague;
import dualsoft.vf.jooq.model.tables.pojos.VfSport;
import java.util.ArrayList;

public interface ILeagueRepository {

    ArrayList<VfLeague> getAllLeagues();

    ArrayList<LeagueDTO> getAllLeaguesDTO();

    ArrayList<LeagueDTO> getAllLeaguesDTOForSport(String sportCode);

    VfLeague getLeague(int id);

    LeagueDTO getLeagueDTO(int id);

    VfLeague addLeague(VfLeague league);

    VfLeague updateLeague(VfLeague league);

    VfLeague deleteLeague(int id);

    VfSport getSportForLeague(int leagueId);

    ArrayList<SeasonLeagueDTO> getAllActiveLeagues();

    ArrayList<SeasonLeagueDTO> getAllNotActiveLeagues();

    VfSeason getActiveSeasonForLeague(int leagueId);
}

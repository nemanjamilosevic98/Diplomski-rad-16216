package dualsoft.vf.bookmakerclient.services;

import dualsoft.vf.bookmakerclient.dtos.TeamDTO;
import dualsoft.vf.bookmakerclient.repositories.LeagueRepository;
import dualsoft.vf.bookmakerclient.repositories.TeamRepository;
import dualsoft.vf.jooq.model.tables.pojos.VfTeam;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeamService {

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    LeagueRepository leagueRepository;

    public ArrayList<VfTeam> getAllTeams() {
        return teamRepository.getAll();
    }

    public ArrayList<TeamDTO> getAllTeamsForView() {
        ArrayList<VfTeam> data = teamRepository.getAll();
        ArrayList<TeamDTO> teams = new ArrayList<TeamDTO>();
        for (VfTeam record : data) {

            teams.add(new TeamDTO(record.getId(), record.getName(), leagueRepository.getLeague(record.getLeagueId())));

        }

        return teams;
    }

    public VfTeam getTeamById(String id) {

        int intId = Integer.parseInt(id);

        return teamRepository.getTeam(intId);
    }

    public void addTeam(VfTeam team) {
        teamRepository.addTeam(team);
    }

    public void updateTeam(VfTeam team) {
        teamRepository.updateTeam(team);
    }

    public void deleteTeam(String id) {

        int intId = Integer.parseInt(id);
        teamRepository.deleteTeam(intId);
    }

}

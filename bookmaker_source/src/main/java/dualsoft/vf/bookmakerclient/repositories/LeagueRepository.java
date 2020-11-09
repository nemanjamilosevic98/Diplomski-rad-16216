package dualsoft.vf.bookmakerclient.repositories;

import dualsoft.vf.bookmakerclient.config.PersistenceContext;
import dualsoft.vf.bookmakerclient.dtos.LeagueDTO;
import dualsoft.vf.bookmakerclient.dtos.SeasonLeagueDTO;
import dualsoft.vf.jooq.model.Tables;
import dualsoft.vf.jooq.model.tables.pojos.VfSeason;
import dualsoft.vf.jooq.model.tables.pojos.VfLeague;
import dualsoft.vf.jooq.model.tables.pojos.VfSport;
import java.time.LocalDateTime;
import java.util.ArrayList;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class LeagueRepository implements ILeagueRepository {

    @Autowired
    private DSLContext context;

    @Autowired
    SportRepository sportRepository;

    @Override
    public ArrayList<VfLeague> getAllLeagues() {

        ArrayList<VfLeague> leagues = new ArrayList<VfLeague>();

        for (VfLeague leagueRecord : context.selectFrom(Tables.VF_LEAGUE)
                .orderBy(Tables.VF_LEAGUE.ID)
                .fetch()
                .into(VfLeague.class)) {
            leagues.add(leagueRecord);
        }

        return leagues;
    }

    @Override
    public ArrayList<LeagueDTO> getAllLeaguesDTO() {
        ArrayList<LeagueDTO> leagues = new ArrayList<LeagueDTO>();

        for (VfLeague leagueRecord : context.selectFrom(Tables.VF_LEAGUE)
                .orderBy(Tables.VF_LEAGUE.SPORT)
                .fetch()
                .into(VfLeague.class)) {
            leagues.add(new LeagueDTO(leagueRecord.getId(), leagueRecord.getName(), sportRepository.getSport(leagueRecord.getSport())));
        }

        return leagues;
    }

    @Override
    public ArrayList<LeagueDTO> getAllLeaguesDTOForSport(String sportCode) {
        ArrayList<LeagueDTO> leagues = new ArrayList<LeagueDTO>();

        for (VfLeague leagueRecord : context.selectFrom(Tables.VF_LEAGUE)
                .where(Tables.VF_LEAGUE.SPORT.equal(sportCode))
                .orderBy(Tables.VF_LEAGUE.SPORT)
                .fetch()
                .into(VfLeague.class)) {
            leagues.add(new LeagueDTO(leagueRecord.getId(), leagueRecord.getName(), sportRepository.getSport(leagueRecord.getSport())));
        }

        return leagues;
    }

    @Override
    public VfLeague getLeague(int id) {

        VfLeague league = new VfLeague();

        league = context.selectFrom(Tables.VF_LEAGUE)
                .where(Tables.VF_LEAGUE.ID.equal(id))
                .fetchOne()
                .into(VfLeague.class);

        return league;
    }

    @Override
    public LeagueDTO getLeagueDTO(int id) {

        VfLeague league = new VfLeague();

        league = context.selectFrom(Tables.VF_LEAGUE)
                .where(Tables.VF_LEAGUE.ID.equal(id))
                .fetchOne()
                .into(VfLeague.class);

        return new LeagueDTO(league.getId(), league.getName(), sportRepository.getSport(league.getSport()));
    }

    @Override
    public VfLeague addLeague(VfLeague league) {

        VfLeague addedLeague = new VfLeague();

        addedLeague = context.insertInto(Tables.VF_LEAGUE,
                Tables.VF_LEAGUE.NAME, Tables.VF_LEAGUE.SPORT)
                .values(league.getName(), league.getSport())
                .returning()
                .fetchOne()
                .into(VfLeague.class);

        return addedLeague;
    }

    @Override
    public VfLeague updateLeague(VfLeague league) {

        int updatedLeague = context.update(Tables.VF_LEAGUE)
                .set(Tables.VF_LEAGUE.NAME, league.getName())
                .set(Tables.VF_LEAGUE.SPORT, league.getSport())
                .where(Tables.VF_LEAGUE.ID.equal(league.getId()))
                .execute();

        return this.getLeague(league.getId());
    }

    @Override
    public VfLeague deleteLeague(int id) {

        VfLeague deletedLeague = this.getLeague(id);

        int delete = context.delete(Tables.VF_LEAGUE)
                .where(Tables.VF_LEAGUE.ID.equal(id))
                .execute();

        return deletedLeague;
    }

    @Override
    public VfSport getSportForLeague(int leagueId) {
        return sportRepository.getSport(this.getLeague(leagueId).getSport());
    }

    @Override
    public ArrayList<SeasonLeagueDTO> getAllActiveLeagues() {
        ArrayList<SeasonLeagueDTO> leagues = new ArrayList<SeasonLeagueDTO>();
        for (VfSeason seasonRecord : context.selectFrom(Tables.VF_SEASON)
                .where("END_DATE IS NULL")
                .orderBy(Tables.VF_SEASON.ID)
                .fetch()
                .into(VfSeason.class)) {
            VfLeague league = getLeague(seasonRecord.getLeagueId());
            VfSeason season = this.getActiveSeasonForLeague(league.getId());
            leagues.add(new SeasonLeagueDTO(season.getId(), season.getName(), league.getId(), league.getName(),
                    season.getStartDate().toString(), null));
        }

        return leagues;
    }

    @Override
    public ArrayList<SeasonLeagueDTO> getAllNotActiveLeagues() {
        ArrayList<SeasonLeagueDTO> allLeagues = new ArrayList<>();
        for (LeagueDTO league : this.getAllLeaguesDTO()) {
            allLeagues.add(new SeasonLeagueDTO(league.getId(), league.getName()));
        }
        ArrayList<SeasonLeagueDTO> activeLeagues = getAllActiveLeagues();
        ArrayList<SeasonLeagueDTO> pomList = new ArrayList<SeasonLeagueDTO>();
        for (SeasonLeagueDTO league : allLeagues) {
            for (SeasonLeagueDTO league1 : activeLeagues) {
                if (league1.getLeagueId() == league.getLeagueId()) {
                    pomList.add(league);
                }
            }
        }
        for (SeasonLeagueDTO league : pomList) {
            allLeagues.remove(league);
        }
        return allLeagues;
    }

    @Override
    public VfSeason getActiveSeasonForLeague(int leagueId) {
        return context.selectFrom(Tables.VF_SEASON)
                .where("END_DATE IS NULL AND LEAGUE_ID=" + leagueId)
                .orderBy(Tables.VF_SEASON.ID)
                .fetchOne().into(VfSeason.class);
    }

}

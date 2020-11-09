package dualsoft.vf.bookmakerclient.repositories;

import dualsoft.vf.bookmakerclient.config.PersistenceContext;
import dualsoft.vf.jooq.model.Tables;
import dualsoft.vf.jooq.model.tables.pojos.VfTeam;
import dualsoft.vf.jooq.model.tables.records.VfTeamRecord;
import java.util.ArrayList;
import java.util.List;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.exception.DataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeamRepository implements ITeamRepository {

    @Autowired
    private DSLContext context;

    @Override
    public ArrayList<VfTeam> getAll() {

        ArrayList<VfTeam> teams = new ArrayList<VfTeam>();
        List<VfTeam> data = context.selectFrom(Tables.VF_TEAM)
                .fetch()
                .into(VfTeam.class);

        for (VfTeam team : data) {
            teams.add(new VfTeam(team));
        }
        return teams;
    }

    @Override
    public VfTeam getTeam(int id) {
        VfTeam team;

        team = context.selectFrom(Tables.VF_TEAM)
                .where(Tables.VF_TEAM.ID.equal(id))
                .fetchOne()
                .into(VfTeam.class);

        return team;
    }

    @Override
    public void addTeam(VfTeam team) {
        System.out.println("timmmmm" + team.toString());

        context.insertInto(Tables.VF_TEAM,
                Tables.VF_TEAM.NAME,
                Tables.VF_TEAM.LEAGUE_ID,
                Tables.VF_TEAM.ATTACK_HOME,
                Tables.VF_TEAM.ATTACK_AWAY,
                Tables.VF_TEAM.DEFENSE_HOME,
                Tables.VF_TEAM.DEFENSE_AWAY)
                .values(
                        team.getName(),
                        team.getLeagueId(),
                        team.getAttackHome(),
                        team.getAttackAway(),
                        team.getDefenseHome(),
                        team.getDefenseAway()
                )
                .execute();

    }

    @Override
    public void updateTeam(VfTeam team) {

        context.update(Tables.VF_TEAM)
                .set(Tables.VF_TEAM.NAME, team.getName())
                .set(Tables.VF_TEAM.LEAGUE_ID, team.getLeagueId())
                .set(Tables.VF_TEAM.ATTACK_HOME, team.getAttackHome())
                .set(Tables.VF_TEAM.ATTACK_AWAY, team.getAttackAway())
                .set(Tables.VF_TEAM.DEFENSE_HOME, team.getDefenseHome())
                .set(Tables.VF_TEAM.DEFENSE_AWAY, team.getDefenseAway())
                .where(Tables.VF_TEAM.ID.equal(team.getId()))
                .execute();
    }

    @Override
    public void deleteTeam(int id) {

        int delete = context.delete(Tables.VF_TEAM)
                .where(Tables.VF_TEAM.ID.equal(id))
                .execute();

    }

}

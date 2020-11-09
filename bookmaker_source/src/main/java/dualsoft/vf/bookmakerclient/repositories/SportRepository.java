package dualsoft.vf.bookmakerclient.repositories;

import dualsoft.vf.bookmakerclient.config.PersistenceContext;
import dualsoft.vf.jooq.model.Tables;
import dualsoft.vf.jooq.model.tables.pojos.VfSport;
import java.util.ArrayList;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SportRepository implements ISportRepository {

    @Autowired
    private DSLContext context;

    @Override
    public ArrayList<VfSport> getAll() {

        ArrayList<VfSport> sports = new ArrayList<VfSport>();

        for (VfSport sportRecord : context.selectFrom(Tables.VF_SPORT)
                .orderBy(Tables.VF_SPORT.CODE)
                .fetch()
                .into(VfSport.class)) {
            sports.add(sportRecord);
        }

        return sports;
    }

    @Override
    public VfSport getSport(String code) {

        VfSport sport = new VfSport();

        sport = context.selectFrom(Tables.VF_SPORT)
                .where(Tables.VF_SPORT.CODE.equal(code))
                .fetchOne()
                .into(VfSport.class);

        return sport;
    }

    @Override
    public VfSport addSport(VfSport sport) {

        VfSport addedSport = new VfSport();

        addedSport = context.insertInto(Tables.VF_SPORT,
                Tables.VF_SPORT.CODE, Tables.VF_SPORT.NAME,
                Tables.VF_SPORT.HALFTIME_DURATION, Tables.VF_SPORT.PERIOD_DURATION)
                .values(sport.getCode(), sport.getName(), sport.getHalftimeDuration(), sport.getPeriodDuration())
                .returning()
                .fetchOne()
                .into(VfSport.class);

        return addedSport;
    }

    @Override
    public VfSport updateSport(VfSport sport) {

        int updatedSport = context.update(Tables.VF_SPORT)
                .set(Tables.VF_SPORT.NAME, sport.getName())
                .set(Tables.VF_SPORT.HALFTIME_DURATION, sport.getHalftimeDuration())
                .set(Tables.VF_SPORT.PERIOD_DURATION, sport.getPeriodDuration())
                .where(Tables.VF_SPORT.CODE.equal(sport.getCode()))
                .execute();

        return this.getSport(sport.getCode());
    }

    @Override
    public VfSport deleteSport(String code) {

        VfSport deletedSport = this.getSport(code);

        int delete = context.delete(Tables.VF_SPORT)
                .where(Tables.VF_SPORT.CODE.equal(code))
                .execute();

        return deletedSport;
    }

}

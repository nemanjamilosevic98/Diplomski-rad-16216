
package dualsoft.vf.bookmakerclient.repositories;

import dualsoft.vf.jooq.model.Tables;
import dualsoft.vf.jooq.model.tables.pojos.VfSeason;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeasonRepository implements ISeasonRepository{
    
    @Autowired
    private DSLContext context;
    
    @Override
    public VfSeason createSeason(int leagueId, String name, LocalDateTime startDate) {

    return context.insertInto(Tables.VF_SEASON,
            Tables.VF_SEASON.NAME, Tables.VF_SEASON.LEAGUE_ID, Tables.VF_SEASON.START_DATE)
            .values(name, leagueId, startDate) 
            .returning()
            .fetchOne()
            .into(VfSeason.class);
    }
    
}

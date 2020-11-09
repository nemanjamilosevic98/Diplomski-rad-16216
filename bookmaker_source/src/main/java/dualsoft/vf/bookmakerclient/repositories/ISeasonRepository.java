
package dualsoft.vf.bookmakerclient.repositories;

import dualsoft.vf.jooq.model.tables.pojos.VfSeason;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ISeasonRepository {
    VfSeason createSeason(int leagueId, String name, LocalDateTime startDate);
}

package dualsoft.vf.bookmakerclient.repositories;

import dualsoft.vf.jooq.model.tables.pojos.VfSport;
import java.util.ArrayList;
import java.util.List;

public interface ISportRepository {

    ArrayList<VfSport> getAll();

    VfSport getSport(String code);

    VfSport addSport(VfSport sport);

    VfSport updateSport(VfSport sport);

    VfSport deleteSport(String code);

}

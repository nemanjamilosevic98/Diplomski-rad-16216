package vf.securityService.securityService.repositories;

import java.util.ArrayList;

import dualsoft.vf.jooq.model.tables.pojos.VfBookmaker;
import dualsoft.vf.jooq.model.tables.records.VfBookmakerRecord;
import dualsoft.vf.jooq.model.tables.records.VfSportRecord;

public interface IBookmakerRepository {

    ArrayList<VfBookmaker> getAll();

    VfBookmaker getBookmaker(int id);

    VfBookmaker getBookmakerByUsername(String username);

    VfBookmaker addBookmaker(VfBookmaker sport);

    VfBookmaker updateBookmaker(VfBookmaker sport);

    VfBookmaker deleteBookmaker(int id);
}

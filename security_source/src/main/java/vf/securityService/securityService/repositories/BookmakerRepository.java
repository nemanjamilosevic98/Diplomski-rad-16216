package vf.securityService.securityService.repositories;

import java.util.ArrayList;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vf.securityService.securityService.config.PersistenceContext;
import dualsoft.vf.jooq.model.Tables;
import dualsoft.vf.jooq.model.tables.pojos.VfBookmaker;
import dualsoft.vf.jooq.model.tables.records.VfBookmakerRecord;
import dualsoft.vf.jooq.model.tables.records.VfSportRecord;

@Repository
public class BookmakerRepository implements IBookmakerRepository {

    @Autowired
    PersistenceContext ds;

    @Autowired
    private DSLContext context;

    @Override
    public ArrayList<VfBookmaker> getAll() {

        ArrayList<VfBookmaker> bookmakers = new ArrayList<VfBookmaker>();
        for (VfBookmaker bookmakerRecord : context.selectFrom(Tables.VF_BOOKMAKER)
                .orderBy(Tables.VF_BOOKMAKER.ID)
                .fetch()
                .into(VfBookmaker.class)) {
            bookmakers.add(bookmakerRecord);
        }

        return bookmakers;
    }

    @Override
    public VfBookmaker getBookmaker(int id) {
        VfBookmaker bookmaker = new VfBookmaker();
        bookmaker = context.selectFrom(Tables.VF_BOOKMAKER)
                .where(Tables.VF_BOOKMAKER.ID.equal(id))
                .fetchOne()
                .into(VfBookmaker.class);
        return bookmaker;
    }

    @Override
    public VfBookmaker addBookmaker(VfBookmaker bookmaker) {
        VfBookmaker newBookmaker = new VfBookmaker();
        /*newBookmaker =*/ context.insertInto(Tables.VF_BOOKMAKER)
                //.set(bookmaker)
                .set(Tables.VF_BOOKMAKER.USERNAME, bookmaker.getUsername())
                .set(Tables.VF_BOOKMAKER.EMAIL, bookmaker.getEmail())
                .set(Tables.VF_BOOKMAKER.PASSWORD, bookmaker.getPassword())
                .set(Tables.VF_BOOKMAKER.PHONE, bookmaker.getPhone())
                .set(Tables.VF_BOOKMAKER.FIRST_NAME, bookmaker.getFirstName())
                .set(Tables.VF_BOOKMAKER.LAST_NAME, bookmaker.getLastName())
                .returning()
                .fetchOne();
        return bookmaker;
    }

    @Override
    public VfBookmaker updateBookmaker(VfBookmaker bookmaker) {

        int updatedBookmaker = context.update(Tables.VF_BOOKMAKER)
                .set(Tables.VF_BOOKMAKER.USERNAME, bookmaker.getUsername())
                .set(Tables.VF_BOOKMAKER.EMAIL, bookmaker.getEmail())
                .set(Tables.VF_BOOKMAKER.PASSWORD, bookmaker.getPassword())
                .set(Tables.VF_BOOKMAKER.PHONE, bookmaker.getPhone())
                .set(Tables.VF_BOOKMAKER.FIRST_NAME, bookmaker.getFirstName())
                .set(Tables.VF_BOOKMAKER.LAST_NAME, bookmaker.getLastName())
                .where(Tables.VF_BOOKMAKER.ID.equal(bookmaker.getId()))
                .execute();

        return this.getBookmaker(bookmaker.getId());
    }

    @Override
    public VfBookmaker deleteBookmaker(int id) {
        VfBookmaker deletedBookmaker = this.getBookmaker(id);
        int delete = context.delete(Tables.VF_BOOKMAKER)
                .where(Tables.VF_BOOKMAKER.ID.equal(id))
                .execute();

        return deletedBookmaker;
    }

    @Override
    public VfBookmaker getBookmakerByUsername(String username) {
        VfBookmaker bookmaker = new VfBookmaker();
        bookmaker = context.selectFrom(Tables.VF_BOOKMAKER)
                .where(Tables.VF_BOOKMAKER.USERNAME.equal(username))
                .fetchOne()
                .into(VfBookmaker.class);
        return bookmaker;
    }

}

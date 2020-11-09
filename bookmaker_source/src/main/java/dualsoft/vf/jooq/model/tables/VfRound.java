/*
 * This file is generated by jOOQ.
 */
package dualsoft.vf.jooq.model.tables;


import dualsoft.vf.jooq.model.Keys;
import dualsoft.vf.jooq.model.Vf;
import dualsoft.vf.jooq.model.tables.records.VfRoundRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VfRound extends TableImpl<VfRoundRecord> {

    private static final long serialVersionUID = -1743043549;

    /**
     * The reference instance of <code>VF.vf_round</code>
     */
    public static final VfRound VF_ROUND = new VfRound();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VfRoundRecord> getRecordType() {
        return VfRoundRecord.class;
    }

    /**
     * The column <code>VF.vf_round.round_number</code>.
     */
    public final TableField<VfRoundRecord, Integer> ROUND_NUMBER = createField(DSL.name("round_number"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>VF.vf_round.season_id</code>.
     */
    public final TableField<VfRoundRecord, Integer> SEASON_ID = createField(DSL.name("season_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>VF.vf_round</code> table reference
     */
    public VfRound() {
        this(DSL.name("vf_round"), null);
    }

    /**
     * Create an aliased <code>VF.vf_round</code> table reference
     */
    public VfRound(String alias) {
        this(DSL.name(alias), VF_ROUND);
    }

    /**
     * Create an aliased <code>VF.vf_round</code> table reference
     */
    public VfRound(Name alias) {
        this(alias, VF_ROUND);
    }

    private VfRound(Name alias, Table<VfRoundRecord> aliased) {
        this(alias, aliased, null);
    }

    private VfRound(Name alias, Table<VfRoundRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> VfRound(Table<O> child, ForeignKey<O, VfRoundRecord> key) {
        super(child, key, VF_ROUND);
    }

    @Override
    public Schema getSchema() {
        return Vf.VF;
    }

    @Override
    public UniqueKey<VfRoundRecord> getPrimaryKey() {
        return Keys.ROUND_PK;
    }

    @Override
    public List<UniqueKey<VfRoundRecord>> getKeys() {
        return Arrays.<UniqueKey<VfRoundRecord>>asList(Keys.ROUND_PK);
    }

    @Override
    public List<ForeignKey<VfRoundRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VfRoundRecord, ?>>asList(Keys.VF_ROUND__ROUND_SEASON_FK);
    }

    public VfSeason vfSeason() {
        return new VfSeason(this, Keys.VF_ROUND__ROUND_SEASON_FK);
    }

    @Override
    public VfRound as(String alias) {
        return new VfRound(DSL.name(alias), this);
    }

    @Override
    public VfRound as(Name alias) {
        return new VfRound(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VfRound rename(String name) {
        return new VfRound(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VfRound rename(Name name) {
        return new VfRound(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}

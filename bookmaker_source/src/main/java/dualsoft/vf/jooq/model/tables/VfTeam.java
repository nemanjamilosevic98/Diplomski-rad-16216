/*
 * This file is generated by jOOQ.
 */
package dualsoft.vf.jooq.model.tables;


import dualsoft.vf.jooq.model.Keys;
import dualsoft.vf.jooq.model.Vf;
import dualsoft.vf.jooq.model.tables.records.VfTeamRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class VfTeam extends TableImpl<VfTeamRecord> {

    private static final long serialVersionUID = 520962000;

    /**
     * The reference instance of <code>VF.vf_team</code>
     */
    public static final VfTeam VF_TEAM = new VfTeam();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VfTeamRecord> getRecordType() {
        return VfTeamRecord.class;
    }

    /**
     * The column <code>VF.vf_team.id</code>.
     */
    public final TableField<VfTeamRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('vf_team_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>VF.vf_team.name</code>.
     */
    public final TableField<VfTeamRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>VF.vf_team.league_id</code>.
     */
    public final TableField<VfTeamRecord, Integer> LEAGUE_ID = createField(DSL.name("league_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>VF.vf_team.attack_home</code>.
     */
    public final TableField<VfTeamRecord, BigDecimal> ATTACK_HOME = createField(DSL.name("attack_home"), org.jooq.impl.SQLDataType.NUMERIC(5, 2), this, "");

    /**
     * The column <code>VF.vf_team.attack_away</code>.
     */
    public final TableField<VfTeamRecord, BigDecimal> ATTACK_AWAY = createField(DSL.name("attack_away"), org.jooq.impl.SQLDataType.NUMERIC(5, 2), this, "");

    /**
     * The column <code>VF.vf_team.defense_home</code>.
     */
    public final TableField<VfTeamRecord, BigDecimal> DEFENSE_HOME = createField(DSL.name("defense_home"), org.jooq.impl.SQLDataType.NUMERIC(5, 2), this, "");

    /**
     * The column <code>VF.vf_team.defense_away</code>.
     */
    public final TableField<VfTeamRecord, BigDecimal> DEFENSE_AWAY = createField(DSL.name("defense_away"), org.jooq.impl.SQLDataType.NUMERIC(5, 2), this, "");

    /**
     * Create a <code>VF.vf_team</code> table reference
     */
    public VfTeam() {
        this(DSL.name("vf_team"), null);
    }

    /**
     * Create an aliased <code>VF.vf_team</code> table reference
     */
    public VfTeam(String alias) {
        this(DSL.name(alias), VF_TEAM);
    }

    /**
     * Create an aliased <code>VF.vf_team</code> table reference
     */
    public VfTeam(Name alias) {
        this(alias, VF_TEAM);
    }

    private VfTeam(Name alias, Table<VfTeamRecord> aliased) {
        this(alias, aliased, null);
    }

    private VfTeam(Name alias, Table<VfTeamRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> VfTeam(Table<O> child, ForeignKey<O, VfTeamRecord> key) {
        super(child, key, VF_TEAM);
    }

    @Override
    public Schema getSchema() {
        return Vf.VF;
    }

    @Override
    public Identity<VfTeamRecord, Integer> getIdentity() {
        return Keys.IDENTITY_VF_TEAM;
    }

    @Override
    public UniqueKey<VfTeamRecord> getPrimaryKey() {
        return Keys.TEAM_PK;
    }

    @Override
    public List<UniqueKey<VfTeamRecord>> getKeys() {
        return Arrays.<UniqueKey<VfTeamRecord>>asList(Keys.TEAM_PK);
    }

    @Override
    public List<ForeignKey<VfTeamRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VfTeamRecord, ?>>asList(Keys.VF_TEAM__TEAM_LEAGUE_FK);
    }

    public VfLeague vfLeague() {
        return new VfLeague(this, Keys.VF_TEAM__TEAM_LEAGUE_FK);
    }

    @Override
    public VfTeam as(String alias) {
        return new VfTeam(DSL.name(alias), this);
    }

    @Override
    public VfTeam as(Name alias) {
        return new VfTeam(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VfTeam rename(String name) {
        return new VfTeam(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VfTeam rename(Name name) {
        return new VfTeam(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}

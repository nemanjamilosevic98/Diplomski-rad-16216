/*
 * This file is generated by jOOQ.
 */
package dualsoft.vf.jooq.model.tables.records;


import dualsoft.vf.jooq.model.tables.VfSeason;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VfSeasonRecord extends UpdatableRecordImpl<VfSeasonRecord> implements Record5<Integer, String, Integer, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -828917383;

    /**
     * Setter for <code>VF.vf_season.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>VF.vf_season.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>VF.vf_season.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>VF.vf_season.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>VF.vf_season.league_id</code>.
     */
    public void setLeagueId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>VF.vf_season.league_id</code>.
     */
    public Integer getLeagueId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>VF.vf_season.start_date</code>.
     */
    public void setStartDate(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>VF.vf_season.start_date</code>.
     */
    public LocalDateTime getStartDate() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>VF.vf_season.end_date</code>.
     */
    public void setEndDate(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>VF.vf_season.end_date</code>.
     */
    public LocalDateTime getEndDate() {
        return (LocalDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, Integer, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return VfSeason.VF_SEASON.ID;
    }

    @Override
    public Field<String> field2() {
        return VfSeason.VF_SEASON.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return VfSeason.VF_SEASON.LEAGUE_ID;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return VfSeason.VF_SEASON.START_DATE;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return VfSeason.VF_SEASON.END_DATE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer component3() {
        return getLeagueId();
    }

    @Override
    public LocalDateTime component4() {
        return getStartDate();
    }

    @Override
    public LocalDateTime component5() {
        return getEndDate();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Integer value3() {
        return getLeagueId();
    }

    @Override
    public LocalDateTime value4() {
        return getStartDate();
    }

    @Override
    public LocalDateTime value5() {
        return getEndDate();
    }

    @Override
    public VfSeasonRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public VfSeasonRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public VfSeasonRecord value3(Integer value) {
        setLeagueId(value);
        return this;
    }

    @Override
    public VfSeasonRecord value4(LocalDateTime value) {
        setStartDate(value);
        return this;
    }

    @Override
    public VfSeasonRecord value5(LocalDateTime value) {
        setEndDate(value);
        return this;
    }

    @Override
    public VfSeasonRecord values(Integer value1, String value2, Integer value3, LocalDateTime value4, LocalDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VfSeasonRecord
     */
    public VfSeasonRecord() {
        super(VfSeason.VF_SEASON);
    }

    /**
     * Create a detached, initialised VfSeasonRecord
     */
    public VfSeasonRecord(Integer id, String name, Integer leagueId, LocalDateTime startDate, LocalDateTime endDate) {
        super(VfSeason.VF_SEASON);

        set(0, id);
        set(1, name);
        set(2, leagueId);
        set(3, startDate);
        set(4, endDate);
    }
}
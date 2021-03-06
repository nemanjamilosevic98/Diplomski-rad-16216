/*
 * This file is generated by jOOQ.
 */
package dualsoft.vf.jooq.model.tables.records;


import dualsoft.vf.jooq.model.tables.VfRound;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VfRoundRecord extends UpdatableRecordImpl<VfRoundRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1473595981;

    /**
     * Setter for <code>VF.vf_round.round_number</code>.
     */
    public void setRoundNumber(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>VF.vf_round.round_number</code>.
     */
    public Integer getRoundNumber() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>VF.vf_round.season_id</code>.
     */
    public void setSeasonId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>VF.vf_round.season_id</code>.
     */
    public Integer getSeasonId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return VfRound.VF_ROUND.ROUND_NUMBER;
    }

    @Override
    public Field<Integer> field2() {
        return VfRound.VF_ROUND.SEASON_ID;
    }

    @Override
    public Integer component1() {
        return getRoundNumber();
    }

    @Override
    public Integer component2() {
        return getSeasonId();
    }

    @Override
    public Integer value1() {
        return getRoundNumber();
    }

    @Override
    public Integer value2() {
        return getSeasonId();
    }

    @Override
    public VfRoundRecord value1(Integer value) {
        setRoundNumber(value);
        return this;
    }

    @Override
    public VfRoundRecord value2(Integer value) {
        setSeasonId(value);
        return this;
    }

    @Override
    public VfRoundRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VfRoundRecord
     */
    public VfRoundRecord() {
        super(VfRound.VF_ROUND);
    }

    /**
     * Create a detached, initialised VfRoundRecord
     */
    public VfRoundRecord(Integer roundNumber, Integer seasonId) {
        super(VfRound.VF_ROUND);

        set(0, roundNumber);
        set(1, seasonId);
    }
}

/*
 * This file is generated by jOOQ.
 */
package dualsoft.vf.jooq.model.tables;


import dualsoft.vf.jooq.model.Keys;
import dualsoft.vf.jooq.model.Vf;
import dualsoft.vf.jooq.model.tables.records.VfOperatorRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class VfOperator extends TableImpl<VfOperatorRecord> {

    private static final long serialVersionUID = 302164128;

    /**
     * The reference instance of <code>VF.vf_operator</code>
     */
    public static final VfOperator VF_OPERATOR = new VfOperator();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VfOperatorRecord> getRecordType() {
        return VfOperatorRecord.class;
    }

    /**
     * The column <code>VF.vf_operator.code</code>.
     */
    public final TableField<VfOperatorRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false), this, "");

    /**
     * The column <code>VF.vf_operator.name</code>.
     */
    public final TableField<VfOperatorRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>VF.vf_operator.username</code>.
     */
    public final TableField<VfOperatorRecord, String> USERNAME = createField(DSL.name("username"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>VF.vf_operator.password</code>.
     */
    public final TableField<VfOperatorRecord, String> PASSWORD = createField(DSL.name("password"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>VF.vf_operator.email</code>.
     */
    public final TableField<VfOperatorRecord, String> EMAIL = createField(DSL.name("email"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>VF.vf_operator.phone</code>.
     */
    public final TableField<VfOperatorRecord, String> PHONE = createField(DSL.name("phone"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>VF.vf_operator</code> table reference
     */
    public VfOperator() {
        this(DSL.name("vf_operator"), null);
    }

    /**
     * Create an aliased <code>VF.vf_operator</code> table reference
     */
    public VfOperator(String alias) {
        this(DSL.name(alias), VF_OPERATOR);
    }

    /**
     * Create an aliased <code>VF.vf_operator</code> table reference
     */
    public VfOperator(Name alias) {
        this(alias, VF_OPERATOR);
    }

    private VfOperator(Name alias, Table<VfOperatorRecord> aliased) {
        this(alias, aliased, null);
    }

    private VfOperator(Name alias, Table<VfOperatorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> VfOperator(Table<O> child, ForeignKey<O, VfOperatorRecord> key) {
        super(child, key, VF_OPERATOR);
    }

    @Override
    public Schema getSchema() {
        return Vf.VF;
    }

    @Override
    public UniqueKey<VfOperatorRecord> getPrimaryKey() {
        return Keys.OPERATOR_PK;
    }

    @Override
    public List<UniqueKey<VfOperatorRecord>> getKeys() {
        return Arrays.<UniqueKey<VfOperatorRecord>>asList(Keys.OPERATOR_PK, Keys.OPERATOR_UK, Keys.OPERATOR_EMAIL_UK);
    }

    @Override
    public VfOperator as(String alias) {
        return new VfOperator(DSL.name(alias), this);
    }

    @Override
    public VfOperator as(Name alias) {
        return new VfOperator(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VfOperator rename(String name) {
        return new VfOperator(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VfOperator rename(Name name) {
        return new VfOperator(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}

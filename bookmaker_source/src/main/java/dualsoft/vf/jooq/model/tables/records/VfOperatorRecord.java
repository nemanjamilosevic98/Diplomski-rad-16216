/*
 * This file is generated by jOOQ.
 */
package dualsoft.vf.jooq.model.tables.records;


import dualsoft.vf.jooq.model.tables.VfOperator;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VfOperatorRecord extends UpdatableRecordImpl<VfOperatorRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 1224008427;

    /**
     * Setter for <code>VF.vf_operator.code</code>.
     */
    public void setCode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>VF.vf_operator.code</code>.
     */
    public String getCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>VF.vf_operator.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>VF.vf_operator.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>VF.vf_operator.username</code>.
     */
    public void setUsername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>VF.vf_operator.username</code>.
     */
    public String getUsername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>VF.vf_operator.password</code>.
     */
    public void setPassword(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>VF.vf_operator.password</code>.
     */
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>VF.vf_operator.email</code>.
     */
    public void setEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>VF.vf_operator.email</code>.
     */
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>VF.vf_operator.phone</code>.
     */
    public void setPhone(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>VF.vf_operator.phone</code>.
     */
    public String getPhone() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return VfOperator.VF_OPERATOR.CODE;
    }

    @Override
    public Field<String> field2() {
        return VfOperator.VF_OPERATOR.NAME;
    }

    @Override
    public Field<String> field3() {
        return VfOperator.VF_OPERATOR.USERNAME;
    }

    @Override
    public Field<String> field4() {
        return VfOperator.VF_OPERATOR.PASSWORD;
    }

    @Override
    public Field<String> field5() {
        return VfOperator.VF_OPERATOR.EMAIL;
    }

    @Override
    public Field<String> field6() {
        return VfOperator.VF_OPERATOR.PHONE;
    }

    @Override
    public String component1() {
        return getCode();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getUsername();
    }

    @Override
    public String component4() {
        return getPassword();
    }

    @Override
    public String component5() {
        return getEmail();
    }

    @Override
    public String component6() {
        return getPhone();
    }

    @Override
    public String value1() {
        return getCode();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getUsername();
    }

    @Override
    public String value4() {
        return getPassword();
    }

    @Override
    public String value5() {
        return getEmail();
    }

    @Override
    public String value6() {
        return getPhone();
    }

    @Override
    public VfOperatorRecord value1(String value) {
        setCode(value);
        return this;
    }

    @Override
    public VfOperatorRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public VfOperatorRecord value3(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public VfOperatorRecord value4(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public VfOperatorRecord value5(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public VfOperatorRecord value6(String value) {
        setPhone(value);
        return this;
    }

    @Override
    public VfOperatorRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VfOperatorRecord
     */
    public VfOperatorRecord() {
        super(VfOperator.VF_OPERATOR);
    }

    /**
     * Create a detached, initialised VfOperatorRecord
     */
    public VfOperatorRecord(String code, String name, String username, String password, String email, String phone) {
        super(VfOperator.VF_OPERATOR);

        set(0, code);
        set(1, name);
        set(2, username);
        set(3, password);
        set(4, email);
        set(5, phone);
    }
}

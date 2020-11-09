/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dualsoft.vf.bookmakerclient.repositories;

import dualsoft.vf.bookmakerclient.config.PersistenceContext;
import dualsoft.vf.jooq.model.Tables;
import dualsoft.vf.jooq.model.tables.records.VfOperatorRecord;
import java.util.ArrayList;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import dualsoft.vf.jooq.model.tables.pojos.VfOperator;

/**
 *
 * @author Dusan
 */
@Repository
public class OperatorRepository implements IOperatorRepository {

    @Autowired
    private DSLContext context;

//    public ArrayList<VfOperatorRecord> getAllOperators() {
//        ArrayList<VfOperatorRecord> operatorList = new ArrayList<VfOperatorRecord>();
//        try {
//
//            for (VfOperatorRecord opRec : context.selectFrom(Tables.VF_OPERATOR).fetch()) {
//                operatorList.add(opRec);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return operatorList;
//    }
//
//    public void addOperator(VfOperatorRecord operator) {
//        try {
//
//            context.insertInto(Tables.VF_OPERATOR,
//                    VfOperator.VF_OPERATOR.CODE,
//                    VfOperator.VF_OPERATOR.NAME,
//                    VfOperator.VF_OPERATOR.USERNAME,
//                    VfOperator.VF_OPERATOR.PASSWORD,
//                    VfOperator.VF_OPERATOR.EMAIL,
//                    VfOperator.VF_OPERATOR.PHONE)
//                    .values(operator.getCode(), operator.getName(), operator.getUsername(), operator.getPassword(), operator.getEmail(), operator.getPhone()).execute();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public VfOperatorRecord getOperator(String code) {
//        VfOperatorRecord operator = new VfOperatorRecord();
//        try {
//
//            operator = context.selectFrom(Tables.VF_OPERATOR).where(Tables.VF_OPERATOR.CODE.equal(code)).fetchAny();
//            if (operator == null) {
//                throw new Exception("Operator with given code does not exist");
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return operator;
//    }
//
//    public void updateOperator(VfOperatorRecord operator) {
//
//        try {
//
//            if (context.selectFrom(Tables.VF_OPERATOR).where(Tables.VF_OPERATOR.CODE.equal(operator.getCode())) == null) {
//                throw new Exception("Operator with given code does not exist");
//            }
//            context.update(Tables.VF_OPERATOR)
//                    .set(Tables.VF_OPERATOR.NAME, operator.getName())
//                    .set(Tables.VF_OPERATOR.USERNAME, operator.getUsername())
//                    .set(Tables.VF_OPERATOR.PASSWORD, operator.getPassword())
//                    .set(Tables.VF_OPERATOR.EMAIL, operator.getEmail())
//                    .set(Tables.VF_OPERATOR.PHONE, operator.getPhone())
//                    .where(Tables.VF_OPERATOR.CODE.equal(operator.getCode()))
//                    .execute();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void deleteOperator(String code) {
//        try {
//
//            if (context.selectFrom(Tables.VF_OPERATOR).where(Tables.VF_OPERATOR.CODE.equal(code)) == null) {
//                throw new Exception("Operator with given id does not exist");
//            }
//            context.delete(Tables.VF_OPERATOR).where(Tables.VF_OPERATOR.CODE.equal(code)).execute();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    /**
     *
     * @return
     */
    @Override
    public ArrayList<VfOperator> getAllOperators() {
        ArrayList<VfOperator> operatorList = new ArrayList<VfOperator>();
        try {

            for (VfOperator opRec : context.selectFrom(Tables.VF_OPERATOR).fetch().into(VfOperator.class)) {
                operatorList.add(opRec);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return operatorList;
    }

    @Override
    public VfOperator getOperator(String code) {
        VfOperator operator = new VfOperator();
        try {

            operator = context.selectFrom(Tables.VF_OPERATOR).where(Tables.VF_OPERATOR.CODE.equal(code)).fetchAny().into(VfOperator.class);
            if (operator == null) {
                throw new Exception("Operator with given code does not exist");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return operator;
    }

    @Override
    public void addOperator(VfOperator operator) {
        try {

            context.insertInto(Tables.VF_OPERATOR,
                    Tables.VF_OPERATOR.CODE,
                    Tables.VF_OPERATOR.NAME,
                    Tables.VF_OPERATOR.USERNAME,
                    Tables.VF_OPERATOR.PASSWORD,
                    Tables.VF_OPERATOR.EMAIL,
                    Tables.VF_OPERATOR.PHONE)
                    .values(operator.getCode(), operator.getName(), operator.getUsername(), operator.getPassword(), operator.getEmail(), operator.getPhone()).execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateOperator(VfOperator operator) {
        try {

            if (context.selectFrom(Tables.VF_OPERATOR).where(Tables.VF_OPERATOR.CODE.equal(operator.getCode())) == null) {
                throw new Exception("Operator with given code does not exist");
            }
            context.update(Tables.VF_OPERATOR)
                    .set(Tables.VF_OPERATOR.NAME, operator.getName())
                    .set(Tables.VF_OPERATOR.USERNAME, operator.getUsername())
                    .set(Tables.VF_OPERATOR.PASSWORD, operator.getPassword())
                    .set(Tables.VF_OPERATOR.EMAIL, operator.getEmail())
                    .set(Tables.VF_OPERATOR.PHONE, operator.getPhone())
                    .where(Tables.VF_OPERATOR.CODE.equal(operator.getCode()))
                    .execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteOperator(String code) {
        try {

            if (context.selectFrom(Tables.VF_OPERATOR).where(Tables.VF_OPERATOR.CODE.equal(code)) == null) {
                throw new Exception("Operator with given id does not exist");
            }
            context.delete(Tables.VF_OPERATOR).where(Tables.VF_OPERATOR.CODE.equal(code)).execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

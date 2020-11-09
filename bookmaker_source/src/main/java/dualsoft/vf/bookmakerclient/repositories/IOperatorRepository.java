/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dualsoft.vf.bookmakerclient.repositories;

import dualsoft.vf.jooq.model.tables.pojos.VfOperator;
import dualsoft.vf.jooq.model.tables.records.VfOperatorRecord;
import java.util.ArrayList;

/**
 *
 * @author Dusan
 */
public interface IOperatorRepository {

    ArrayList<VfOperator> getAllOperators();

    VfOperator getOperator(String code);

    void addOperator(VfOperator operator);

    void updateOperator(VfOperator operator);

    void deleteOperator(String code);

}

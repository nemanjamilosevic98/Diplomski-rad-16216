package dualsoft.vf.bookmakerclient.services;

import dualsoft.vf.bookmakerclient.repositories.IOperatorRepository;
import dualsoft.vf.jooq.model.tables.pojos.VfOperator;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OperatorService {

    @Autowired
    IOperatorRepository repository;

    public ArrayList<VfOperator> getAllOperators() {

        return repository.getAllOperators();
    }

    public VfOperator getOperator(String code) {
        return repository.getOperator(code);
    }

    public void addOperator(VfOperator operator) {
        System.out.println("Poziva se addService");
        repository.addOperator(operator);
    }

    public void updateOperator(VfOperator operator) {
        repository.updateOperator(operator);
    }

    public void deleteOperator(String code) {
        repository.deleteOperator(code);
    }

}

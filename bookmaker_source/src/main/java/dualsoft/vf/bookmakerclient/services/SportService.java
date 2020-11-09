package dualsoft.vf.bookmakerclient.services;

import dualsoft.vf.bookmakerclient.repositories.SportRepository;
import dualsoft.vf.jooq.model.tables.pojos.VfSport;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SportService {

    @Autowired
    SportRepository repository;

    public ArrayList<VfSport> getAllSports() {
        return repository.getAll();
    }

    public VfSport getSportByCode(String code) {
        return repository.getSport(code);
    }

    public VfSport addSport(VfSport sport) {
        return repository.addSport(sport);
    }

    public VfSport updateSport(VfSport sport) {
        return repository.updateSport(sport);
    }

    public VfSport deleteSport(String code) {
        return repository.deleteSport(code);
    }

}

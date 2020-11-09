package dualsoft.vf.bookmakerclient.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dualsoft.vf.bookmakerclient.repositories.BookmakerRepository;
import dualsoft.vf.jooq.model.tables.pojos.VfBookmaker;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookmakerService {

    @Autowired
    BookmakerRepository repository;

    //@Autowired
    //private BCryptPasswordEncoder passwordEncoder;
    public ArrayList<VfBookmaker> getAllBookmakers() {

        return repository.getAll();
    }

    public VfBookmaker getBookmakerById(int id) {

        return repository.getBookmaker(id);
    }

    public VfBookmaker getBookmakerByUsername(String username) {

        return repository.getBookmakerByUsername(username);
    }

    public VfBookmaker addBookmaker(VfBookmaker bookmaker) {

        bookmaker.setPassword(bookmaker.getPassword());

        System.out.println(bookmaker);
        System.out.println(bookmaker.getPassword());

        return repository.addBookmaker(bookmaker);
    }

    public VfBookmaker updateBookmaker(VfBookmaker bookmaker) {
        return repository.updateBookmaker(bookmaker);
    }

    public VfBookmaker deleteBookmaker(int id) {
        return repository.deleteBookmaker(id);
    }
}

package vf.securityService.securityService.services;

import dualsoft.vf.jooq.model.tables.pojos.VfBookmaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import vf.securityService.securityService.model.BookmakerUser;
import vf.securityService.securityService.repositories.BookmakerRepository;

@Service
public class BookmakerUserDetailsService implements UserDetailsService {

    @Autowired
    BookmakerRepository repository;

    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        System.out.println(string);

        VfBookmaker bookmaker;

        try {
            bookmaker = repository.getBookmakerByUsername(string);

            if (bookmaker != null && bookmaker.getId() != null) {
                BookmakerUser user = new BookmakerUser(bookmaker);
                return user;
            } else {
                throw new UsernameNotFoundException("User " + string + " was not found in the database");
            }
        } catch (Exception e) {
            throw new UsernameNotFoundException("User " + string + " was not found in the database");
        }

    }

}

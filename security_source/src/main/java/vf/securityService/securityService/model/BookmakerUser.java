package vf.securityService.securityService.model;

import dualsoft.vf.jooq.model.tables.pojos.VfBookmaker;
import java.util.Arrays;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class BookmakerUser extends User {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public BookmakerUser(VfBookmaker bookmaker) {
        super(bookmaker.getUsername(), bookmaker.getPassword(), Arrays.asList(new SimpleGrantedAuthority("ROLE_BOOKMAKER")));
        this.id = bookmaker.getId();
        this.firstName = bookmaker.getFirstName();
        this.lastName = bookmaker.getLastName();
        this.email = bookmaker.getEmail();
        this.phone = bookmaker.getPhone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}

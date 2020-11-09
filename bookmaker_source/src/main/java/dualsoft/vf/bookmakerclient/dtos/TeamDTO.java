package dualsoft.vf.bookmakerclient.dtos;

import dualsoft.vf.jooq.model.tables.pojos.VfLeague;

public class TeamDTO {

    private int id;
    private String name;
    private VfLeague league;

    public TeamDTO(int id, String name, VfLeague league) {
        this.id = id;
        this.name = name;
        this.league = league;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public VfLeague getLeague() {
        return league;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeague(VfLeague league) {
        this.league = league;
    }

}

package dualsoft.vf.bookmakerclient.dtos;

import dualsoft.vf.jooq.model.tables.pojos.VfSport;

public class LeagueDTO {

    private int id;
    private String name;
    private VfSport sport;

    public LeagueDTO(int id, String name, VfSport sport) {
        this.id = id;
        this.name = name;
        this.sport = sport;
    }

    public LeagueDTO() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public VfSport getSport() {
        return sport;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSport(VfSport sport) {
        this.sport = sport;
    }

}

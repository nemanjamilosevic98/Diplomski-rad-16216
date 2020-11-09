/*
 * This file is generated by jOOQ.
 */
package dualsoft.vf.jooq.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VfSeason implements Serializable {

    private static final long serialVersionUID = 797734858;

    private Integer       id;
    private String        name;
    private Integer       leagueId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public VfSeason() {}

    public VfSeason(VfSeason value) {
        this.id = value.id;
        this.name = value.name;
        this.leagueId = value.leagueId;
        this.startDate = value.startDate;
        this.endDate = value.endDate;
    }

    public VfSeason(
        Integer       id,
        String        name,
        Integer       leagueId,
        LocalDateTime startDate,
        LocalDateTime endDate
    ) {
        this.id = id;
        this.name = name;
        this.leagueId = leagueId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLeagueId() {
        return this.leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public LocalDateTime getStartDate() {
        return this.startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return this.endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VfSeason (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(leagueId);
        sb.append(", ").append(startDate);
        sb.append(", ").append(endDate);

        sb.append(")");
        return sb.toString();
    }
}
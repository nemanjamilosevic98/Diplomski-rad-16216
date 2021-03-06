/*
 * This file is generated by jOOQ.
 */
package dualsoft.vf.jooq.model.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VfOdds implements Serializable {

    private static final long serialVersionUID = 247280395;

    private Integer    id;
    private Integer    matchId;
    private String     oddType;
    private BigDecimal oddValue;

    public VfOdds() {}

    public VfOdds(VfOdds value) {
        this.id = value.id;
        this.matchId = value.matchId;
        this.oddType = value.oddType;
        this.oddValue = value.oddValue;
    }

    public VfOdds(
        Integer    id,
        Integer    matchId,
        String     oddType,
        BigDecimal oddValue
    ) {
        this.id = id;
        this.matchId = matchId;
        this.oddType = oddType;
        this.oddValue = oddValue;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMatchId() {
        return this.matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public String getOddType() {
        return this.oddType;
    }

    public void setOddType(String oddType) {
        this.oddType = oddType;
    }

    public BigDecimal getOddValue() {
        return this.oddValue;
    }

    public void setOddValue(BigDecimal oddValue) {
        this.oddValue = oddValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VfOdds (");

        sb.append(id);
        sb.append(", ").append(matchId);
        sb.append(", ").append(oddType);
        sb.append(", ").append(oddValue);

        sb.append(")");
        return sb.toString();
    }
}

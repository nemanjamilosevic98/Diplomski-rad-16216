/*
 * This file is generated by jOOQ.
 */
package dualsoft.vf.jooq.model;


import org.jooq.Sequence;
import org.jooq.impl.Internal;


/**
 * Convenience access to all sequences in VF
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>VF.vf_bookmaker_id_seq</code>
     */
    public static final Sequence<Integer> VF_BOOKMAKER_ID_SEQ = Internal.createSequence("vf_bookmaker_id_seq", Vf.VF, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>VF.vf_league_id_seq</code>
     */
    public static final Sequence<Integer> VF_LEAGUE_ID_SEQ = Internal.createSequence("vf_league_id_seq", Vf.VF, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>VF.vf_match_id_seq</code>
     */
    public static final Sequence<Integer> VF_MATCH_ID_SEQ = Internal.createSequence("vf_match_id_seq", Vf.VF, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>VF.vf_odds_id_seq</code>
     */
    public static final Sequence<Integer> VF_ODDS_ID_SEQ = Internal.createSequence("vf_odds_id_seq", Vf.VF, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>VF.vf_season_id_seq</code>
     */
    public static final Sequence<Integer> VF_SEASON_ID_SEQ = Internal.createSequence("vf_season_id_seq", Vf.VF, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>VF.vf_team_id_seq</code>
     */
    public static final Sequence<Integer> VF_TEAM_ID_SEQ = Internal.createSequence("vf_team_id_seq", Vf.VF, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dualsoft.vf.bookmakerclient.kafka.SeasonControlTopic;

/**
 *
 * @author dusan
 */
public class SeasonMessage {

    private int seasonid;
    private int leagueid;
    private SeasonActionEnum action;

    public SeasonMessage() {
    }

    public SeasonMessage(int sid, SeasonActionEnum en) {
        this.seasonid = sid;
        this.action = en;

    }
    
    public SeasonMessage(int sid, int lid,SeasonActionEnum en) {
        this.seasonid = sid;
        this.action = en;
        this.leagueid = lid;
    }

    public int getseasonid() {
        return seasonid;
    }
    
    public int getleagueid() {
        return leagueid;
    }

    public SeasonActionEnum getaction() {
        return action;
    }

    @Override
    public String toString() {
        return "User: " + seasonid + " " + action;
    }
}

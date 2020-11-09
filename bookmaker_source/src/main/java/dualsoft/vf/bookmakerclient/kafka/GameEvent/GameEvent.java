/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dualsoft.vf.bookmakerclient.kafka.GameEvent;

public class GameEvent {

    private String gameId;
    private EventsEnum event;

    public String getSeasonId() {
        return gameId;
    }

    public void setSeasonId(String seasonId) {
        this.gameId = seasonId;
    }

    public EventsEnum getEvent() {
        return event;
    }

    public void setEvent(EventsEnum event) {
        this.event = event;
    }

    public GameEvent(String seasonId, EventsEnum event) {
        this.gameId = seasonId;
        this.event = event;
    }

    public GameEvent() {
    }

    @Override
    public String toString() {
        return "User(" + this.gameId + ", " + this.event + ")";
    }
}

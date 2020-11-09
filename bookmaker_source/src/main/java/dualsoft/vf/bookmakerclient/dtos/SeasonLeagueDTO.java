
package dualsoft.vf.bookmakerclient.dtos;


public class SeasonLeagueDTO {
    
    private int seasonId;
    private String seasonName;
    private int leagueId;
    private String leagueName;
    private String seasonStartDate;
    private String seasonEndDate;

    public SeasonLeagueDTO(int seasonId, String seasonName, int leagueId, String leagueName, String seasonStartDate, String seasonEndDate) {
        this.seasonId = seasonId;
        this.leagueName = leagueName;
        this.seasonName = seasonName;
        this.seasonStartDate = seasonStartDate;
        this.seasonEndDate = seasonEndDate;
        this.leagueId=leagueId;
    }
    
      public SeasonLeagueDTO(int leagueId, String leagueName) {
        this.leagueName = leagueName;
        this.leagueId=leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonStartDate() {
        return seasonStartDate;
    }

    public String getSeasonEndDate() {
        return seasonEndDate;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public void setSeasonStartDate(String seasonStartDate) {
        this.seasonStartDate = seasonStartDate;
    }

    public void setSeasonEndDate(String seasonEndDate) {
        this.seasonEndDate = seasonEndDate;
    }
    
    
}

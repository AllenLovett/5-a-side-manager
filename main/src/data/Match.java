package data;

import java.util.Date;

/**
 * Created by allen on 05/12/2016.
 */
public class Match {

    private String matchID;
    private String team1ID;
    private String team2ID;
    private Date matchDate;
    private String score;

    public Match(String matchID, String team1ID, String team2ID, Date matchDate) {
        this.matchID = matchID;
        this.team1ID = team1ID;
        this.team2ID = team2ID;
        this.matchDate = matchDate;
    }

    public String getMatchID() {
        return matchID;
    }

    public void setMatchID(String matchID) {
        this.matchID = matchID;
    }

    public String getTeam1ID() {
        return team1ID;
    }

    public void setTeam1ID(String team1ID) {
        this.team1ID = team1ID;
    }

    public String getTeam2ID() {
        return team2ID;
    }

    public void setTeam2ID(String team2ID) {
        this.team2ID = team2ID;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

}

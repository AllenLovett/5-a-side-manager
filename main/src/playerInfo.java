import data.Player;

/**
 * Created by allen on 09/12/2016.
 */
public class playerInfo {

    public Player getPlayer(String playerDetails) {
        String[] playerInfo = playerDetails.split("\\,");

        String playerID = playerInfo[0];
        String playerName = playerInfo[1];
        String sPlayerBalance = playerInfo[2];
        double playerBalance = Double.parseDouble(sPlayerBalance);
        Player player = new Player(playerID,playerName,playerBalance);

        return player;
    }
}

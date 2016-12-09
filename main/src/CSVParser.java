import data.Player;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Created by allen on 09/12/2016.
 */
public class CSVParser {

    public List<Player> players;

    public static void parsePlayers(){

        String csvFilePath = "/Users/allen/IdeaProjects/5-a-side-manager/main/src/csv/players.csv";
        BufferedReader bufferedReader = null;
        String csvToken = "\\,";
        String line = "";

        try{
            bufferedReader = new BufferedReader(new FileReader(csvFilePath));
            while ((line = bufferedReader.readLine()) != null) {
                String[] players = line.split(csvToken);
                System .out.println("ID: "+players[0]+"\nName: "+players[1]+"\nBalance: "+players[2]);
            }

        }catch (FileNotFoundException e){
            System.out.println("Error: "+e);
        }
        catch (IOException e){
            System.out.println("Error: "+e);
        }
    }

    public void getPlayerList() {

        // Read the Player CSV file and generate a list of Player names
        // This will return the name of the Player along with their ID


    }

    public static void main(String[] args) {
        parsePlayers();
    }
}

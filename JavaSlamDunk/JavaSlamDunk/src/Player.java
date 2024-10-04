// Player -> Tournament
// Player -> Team -> Tournament
import java.util.List;
import java.util.ArrayList;

public class Player {
    private String name;
    private int number;
    public Player(){

    }

    public Player(String name, int number){
        this.name = name;
        this.number = number;
    }
    
    public String getName(){
        return this.name;
    }
    public int getNumber(){
        return this.number;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public static List<Player> populatePlayer(String[][] players){
        List<Player> retPlayers = new ArrayList<>();
        for (String[] data : players){
            Player player = new Player(data[0], Integer.valueOf(data[1]));
            retPlayers.add(player);
        }
        return retPlayers;
    }

    public void printPlayer(){
        System.out.println("Player Name: " + this.getName() + ", " 
        + "Player Number: " + this.getNumber());
    }

    public static void printPlayers(List<Player> players){
        for(Player player: players){
            player.printPlayer();
        }
    }
    
}

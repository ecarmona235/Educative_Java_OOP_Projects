import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String[][] playerDataTeam1 = {
                { "Allen Iverson", "1" },
                { "Aaron McKie", "2" },
                { "Dikembe Mutombo", "3" },
                { "Tyrone Hill", "4" },
                { "Jumaine Jones", "5" },
                { "Kobe Bryant", "6" },
                { "Shaquille O'Neal", "7" },
                { "Rick Fox", "8" },
                { "Horace Grant", "9" },
                { "Derek Fisher", "10" }
        };
        List<Player> team1 = Player.populatePlayer(playerDataTeam1);
        team1.getFirst().printPlayer();
        Player.printPlayers(team1);
        
        
    }
}

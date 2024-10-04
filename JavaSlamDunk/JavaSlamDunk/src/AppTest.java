import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

public class AppTest {
    // set up for class here
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



    @Test
    public void test1PopulatePlayer(){
        assertEquals(10, Player.populatePlayer(playerDataTeam1).size());
    }

    @Test
    public void test2getPlayer(){
        assertEquals("Allen Iverson", team1.getFirst().getName());
    }

    @Test
    public void test2getNumber() {
        assertEquals(1, team1.getFirst().getNumber());
    }
}

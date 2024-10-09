import java.util.List;


public class Team {
    private String name, conference;
    private static List<Player> teamList;

    public Team(String name, String conference){
        this.name = name;
        this.conference = conference;
    }
    

    public String getName(){
        return this.name;
    }
    public String getConference(){
        return this.conference;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setConference(String conference){
        this.conference = conference;
    }
    public static List<Player> populateTeams(String[][] playerList){
        teamList = Player.populatePlayer(playerList);
        return teamList;
    }


    

}

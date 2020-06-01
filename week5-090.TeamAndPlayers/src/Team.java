
import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize;

    public Team(String teamName) {
        this.teamName = teamName;
        this.setMaxSize(16);
    }

    public String getName() {
        return this.teamName;
    }

    public void addPlayer(Player player) {
        if(this.size() < this.maxSize) {
            players.add(player);
        }
    }

    public void printPlayers() {
        for (Player i : this.players){
            System.out.println(i);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return players.size();
    }

    public int goals(){
        int totalGoals = 0;
        for (Player player : players) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }

}


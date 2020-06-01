public class Player {
    private String playerName;
    private int goals;

    public Player(String playerName, int goals) {
        this.playerName = playerName;
        this.goals = goals;

    }
    public Player(String playerName) {
        this(playerName, 0);


    }

    public String getName() {
        return this.playerName;
    }

    public int goals() {
        return this.goals;
    }


    @Override
    public String toString() {
        return "Player: " + this.playerName + ", goals: " + this.goals;
    }
}
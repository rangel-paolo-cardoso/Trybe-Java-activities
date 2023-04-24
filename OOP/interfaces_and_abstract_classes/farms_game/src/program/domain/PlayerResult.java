package program.domain;

import program.interfaces.Farm;

public class PlayerResult {
    private String playerName;

    private Farm[] farms;

    public PlayerResult(String playerName, Farm[] farms) {
        this.playerName = playerName;
        this.farms = farms;
    }

    public double score() {
        return 0.0;
    }

    public String toString() {
        return "";
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}

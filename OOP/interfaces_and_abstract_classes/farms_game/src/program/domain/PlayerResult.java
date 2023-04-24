package program.domain;

import program.interfaces.Farm;

public class PlayerResult {
    private String playerName;

    private Farm[] farms;

    public PlayerResult(String playerName, Farm[] farms) {
        this.playerName = playerName;
        this.farms = farms;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Farm[] getFarms() {
        return farms;
    }

    public double score() {
        double sum = 0.0;
        for (Farm farm : farms) {
            sum += farm.area();
        }
        return sum;
    }

    public String toString() {
        return "Player name: " + playerName
                + "\nScore: " + score();
    }
}

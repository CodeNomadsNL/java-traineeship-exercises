package nl.yoink.traineeship.kata;

public class Tennis {

    private static final int PLAYER_ONE = 0;
    private static final int PLAYER_TWO = 1;

    private String[] points = new String[] { "Love", "Love" };
    private boolean isDeuce = false;

    public String getScore() {
        if (points[PLAYER_ONE].equals("Win")) {
            return "Win player one";
        }
        if (points[PLAYER_TWO].equals("Win")) {
            return "Win player two";
        }
        if (points[PLAYER_ONE].equals("40") && points[PLAYER_TWO].equals("40")) {
            return "Deuce";
        }
        return points[PLAYER_ONE] + "-" + points[PLAYER_TWO];
    }

    public void givePointToPlayerOne() {
        givePointToPlayer(PLAYER_ONE);
    }

    public void givePointToPlayerTwo() {
        givePointToPlayer(PLAYER_TWO);
    }

    private void givePointToPlayer(int p) {
        int otherPlayer = 1 - p;
        if (points[otherPlayer].equals("Adv")) {
            points[otherPlayer] = "40";
        } else {
            points[p] = next(points[p]);
        }
        checkForDeuce();
    }

    private String next(String points) {
        if (isDeuce) {
            return "Adv";
        }
        switch (points) {
            case "Love":
                return "15";
            case "15":
                return "30";
            case "30":
                return "40";
            case "40":
                return "Win";
            case "Adv":
                return "Win";
            default:
                throw new IllegalStateException("Should never happen (famous last words)");
        }
    }

    private void checkForDeuce() {
        isDeuce = points[PLAYER_ONE].equals("40") && points[PLAYER_TWO].equals("40");
    }
}

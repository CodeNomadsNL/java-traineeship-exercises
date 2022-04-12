package nl.yoink.traineeship.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TennisTest {

    private Tennis t = new Tennis();

    @Test
    void getInitialScore() {
        assertEquals("Love-Love", t.getScore());
    }

    @Test
    void scoreOnePointForPlayerOne() {
        t.givePointToPlayerOne();
        assertEquals("15-Love", t.getScore());
    }

    @Test
    void scoreTwoPointsForPlayerOne() {
        t.givePointToPlayerOne();
        t.givePointToPlayerOne();
        assertEquals("30-Love", t.getScore());
    }

    @Test
    void scoreThreePointsForPlayerOne() {
        t.givePointToPlayerOne();
        t.givePointToPlayerOne();
        t.givePointToPlayerOne();
        assertEquals("40-Love", t.getScore());
    }

    @Test
    void scoreFourPointsForPlayerOne() {
        t.givePointToPlayerOne();
        t.givePointToPlayerOne();
        t.givePointToPlayerOne();
        t.givePointToPlayerOne();
        assertEquals("Win player one", t.getScore());
    }

    @Test
    void scoreOnePointForPlayerTwo() {
        t.givePointToPlayerTwo();
        assertEquals("Love-15", t.getScore());
    }

    @Test
    void scoreFourPointsForPlayerTwo() {
        t.givePointToPlayerTwo();
        t.givePointToPlayerTwo();
        t.givePointToPlayerTwo();
        t.givePointToPlayerTwo();
        assertEquals("Win player two", t.getScore());
    }

    @Test
    void score30_40() {
        t.givePointToPlayerTwo();
        t.givePointToPlayerTwo();
        t.givePointToPlayerOne();
        t.givePointToPlayerOne();
        t.givePointToPlayerTwo();
        assertEquals("30-40", t.getScore(), "Wat een stom spel");
    }

    @Test
    void deuce() {
        t.givePointToPlayerTwo();
        t.givePointToPlayerTwo();
        t.givePointToPlayerOne();
        t.givePointToPlayerOne();
        t.givePointToPlayerTwo();
        t.givePointToPlayerOne();
        assertEquals("Deuce", t.getScore());
    }

    @Test
    void advantagePlayerTwo() {
        t.givePointToPlayerTwo();
        t.givePointToPlayerTwo();
        t.givePointToPlayerOne();
        t.givePointToPlayerOne();
        t.givePointToPlayerTwo();
        t.givePointToPlayerOne();
        t.givePointToPlayerTwo();
        assertEquals("40-Adv", t.getScore());
    }

    @Test
    void advantagePlayerOne() {
        t.givePointToPlayerTwo();
        t.givePointToPlayerTwo();
        t.givePointToPlayerOne();
        t.givePointToPlayerOne();
        t.givePointToPlayerTwo();
        t.givePointToPlayerOne();
        t.givePointToPlayerOne();
        assertEquals("Adv-40", t.getScore());
    }

    @Test
    void backToDeuce() {
        t.givePointToPlayerTwo();
        t.givePointToPlayerTwo();
        t.givePointToPlayerOne();
        t.givePointToPlayerOne();
        t.givePointToPlayerTwo();
        t.givePointToPlayerOne();
        t.givePointToPlayerOne();
        t.givePointToPlayerTwo();
        assertEquals("Deuce", t.getScore());
    }

    @Test
    void playerTwoWinsAfterAdvantage() {
        t.givePointToPlayerTwo();
        t.givePointToPlayerTwo();
        t.givePointToPlayerOne();
        t.givePointToPlayerOne();
        t.givePointToPlayerTwo();
        t.givePointToPlayerOne();
        t.givePointToPlayerTwo();
        t.givePointToPlayerTwo();
        assertEquals("Win player two", t.getScore());
    }

    @Test
    void playerOneWinsAfterAdvantage() {
        t.givePointToPlayerTwo();
        t.givePointToPlayerTwo();
        t.givePointToPlayerOne();
        t.givePointToPlayerOne();
        t.givePointToPlayerTwo();
        t.givePointToPlayerOne();
        t.givePointToPlayerOne();
        t.givePointToPlayerOne();
        assertEquals("Win player one", t.getScore());
    }
}

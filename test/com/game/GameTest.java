package com.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {
    @Test
    void shouldReturnTheScoreBetweenCheatAndCoolPlayer() {
        CheatPlayer cheatPlayer = new CheatPlayer();
        CoolPlayer coolPlayer = new CoolPlayer();
        Game game = new Game(5);
        game.addPlayer(coolPlayer);
        game.addPlayer(cheatPlayer);

        assertEquals("Round|Player 1|Player 2\n" +
                "1   :   -1   :   3\n" +
                "2   :   -2   :   6\n" +
                "3   :   -3   :   9\n" +
                "4   :   -4   :   12\n" +
                "5   :   -5   :   15\n",game.play());
    }
}
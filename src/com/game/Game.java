package com.game;

import java.util.ArrayList;
import java.util.List;

class Game {
    private final Score score;
    private List<Player> players;
    private Machine machine;
    private Integer rounds;

    Game(Integer rounds) {
        this.rounds = rounds;

        this.players = new ArrayList<>(2);
        this.machine = new Machine();
        this.score = new Score();
    }

    void addPlayer(Player player) {
        this.players.add(player);
    }

    String play() {

        for (int i = 0; i < this.rounds; i++) {
            Player firstPlayer = this.players.get(0);
            Player secondPlayer = this.players.get(1);

            List<Move> firstPlayerMoves = firstPlayer.getMoves();
            List<Move> secondPlayerMoves = secondPlayer.getMoves();

            Move secondPlayerMove = secondPlayer.getMove(firstPlayerMoves);
            Move firstPlayerMove = firstPlayer.getMove(secondPlayerMoves);


            //TODO:think on this
            Result result = this.machine.generateResult(firstPlayerMove, secondPlayerMove);
            this.score.addResult(result);
        }
        return this.score.getScoreBoard("Player 1", "Player 2");
    }
}

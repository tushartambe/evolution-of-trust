package com.game;

import java.util.List;

public class CheatPlayer extends Player {

  CheatPlayer () {
    this.moves.add(Move.CHEAT);
  }

  @Override
  public Move getMove(List<Move> otherPlayerMoves) {
    this.moves.add(Move.CHEAT);
    return Move.CHEAT;
  }
}


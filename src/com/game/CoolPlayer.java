package com.game;

import java.util.List;

public class CoolPlayer extends Player {
  CoolPlayer() {
    this.moves.add(Move.CO_OPERATE);
  }

  @Override
  public Move getMove(List<Move> otherPlayerMoves) {
    this.moves.add(Move.CO_OPERATE);
    return Move.CO_OPERATE;
  }
}

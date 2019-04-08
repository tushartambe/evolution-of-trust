package com.game;

public class Main {
  public static void main(String[] args) {
    Machine machine = new Machine();
    Game game = new Game( 5);
    Player cheaterPlayer = new CopyCatPlayer();
    Player coolPlayer = new DetectivePlayer();
    game.addPlayer(coolPlayer);
    game.addPlayer(cheaterPlayer);
    game.play();
  }
}

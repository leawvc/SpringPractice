package com.udamy.springpractice;

public class GameRunner {
    private SuperContraGame game;
//    MarioGame game;
    public GameRunner(SuperContraGame game){
        this.game = game;
    }

//    public GameRunner(MarioGame game){
//        this.game = game;
//    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}

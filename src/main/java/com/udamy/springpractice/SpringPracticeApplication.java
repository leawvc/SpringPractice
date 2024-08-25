package com.udamy.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPracticeApplication.class, args);


//        var game = new MarioGame();
        var game = new PacmanGame();
//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }

}
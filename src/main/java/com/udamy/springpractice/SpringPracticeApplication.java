package com.udamy.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPracticeApplication.class, args);

//        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
//        var gameRunner = new GameRunner(marioGame);
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }

}
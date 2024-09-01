package com.udamy.springpractice;

import com.udamy.springpractice.game.GameRunner;
import com.udamy.springpractice.game.GamingConsole;
import com.udamy.springpractice.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    //Spring Context 생성
    @Bean
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}

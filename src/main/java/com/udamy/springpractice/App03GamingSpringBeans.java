package com.udamy.springpractice;

import com.udamy.springpractice.game.GameRunner;
import com.udamy.springpractice.game.GamingConsole;
import com.udamy.springpractice.game.PacmanGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App03GamingSpringBeans {
    public static void main(String[] args) {
        SpringApplication.run(SpringPracticeApplication.class, args);

        try(var context =
                    new AnnotationConfigApplicationContext
                            (GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
    }
}


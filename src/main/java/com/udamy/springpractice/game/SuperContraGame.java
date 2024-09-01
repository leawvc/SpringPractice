package com.udamy.springpractice.game;

public class SuperContraGame implements GamingConsole{
    public void up(){
        System.out.println("up");
    }
    public void down(){
        System.out.println("Sit down");
    }
    public void right(){
        System.out.println("Go back");
    }
    public void left(){
        System.out.println("Shoot a bullet");
    }
}

package com.udamy.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //Spring Context 실행하는 단계 - AnnotationConfig
        //Spring Framework가 관리할 것을 지 - @Bean객체 생성
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //Spring이 관리하는 객체의 이름을 알기 위해서 선언
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
    }
}

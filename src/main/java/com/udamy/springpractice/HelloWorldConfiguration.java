package com.udamy.springpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * record : JDK16이상에서부터 지원하며 Setter, Getter, 생성자를 생략시켜준다.
 * @param name : 이름
 * @param age : 나이
 */
record Person(String name, int age){
}

record Address(String firstLine, String city){
}

/**
 * Spring에서 관리하는 것들을 Spring Bean 객체라고 한다
 * @Configuration 어노테이션을 선언한 경우 Bean 객체 메서드를 생성 선언할 수 있다.
 */
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Ranga";
    }
    @Bean
    public int age(){
        return 15;
    }
    @Bean
    public Person person(){
        return new Person("Ravi", 20);
    }
    @Bean
    public Address address(){
        return new Address("Baker Street", "London");
    }
}

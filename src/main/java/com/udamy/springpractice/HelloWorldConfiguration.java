package com.udamy.springpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * record : JDK16이상에서부터 지원하며 Setter, Getter, 생성자를 생략시켜준다.
 * @param name : 이름
 * @param age : 나이
 */
record Person(String name, int age, Address address ){
}
record Address(String firstLine, String city){
}

/**
 * Spring에서 관리하는 것들을 Spring Bean 객체라고 한다
 * @Configuration 어노테이션을 선언한 경우 Bean 객체 메서드를 생성 선언할 수 있다.
 */
@Configuration
public class HelloWorldConfiguration {
    //Bean의 메서드  이름을 바꾸려면 Bean에 속성을 추가해주면 된다
    @Bean
    public String name(){
        return "Ranga";
    }
    @Bean
    public int age(){
        return 15;
    }

    /**
     * @Bean 을 활용하는 3가지 방법
     * 1. 주소를 추가한다.
     * 2. 메서드를 호출한다.
     * 3. 매개변수를 활용한다.
     */
    @Bean
    public Person person(){
        return new Person("Ravi", 20, new Address("Main street", "Utrecht"));
    }
    @Bean
    public Person person2MethodCall(){
        return new Person(name() , age(), address());
    }
    @Bean
    public Person person3Parameters(String name, int age, Address address3){
        return new Person(name, age, address3);
    }
    @Bean(name = "address2")
    public Address address(){
        return new Address("Baker Street", "London");
    }
    @Bean(name = "address3")
    public Address address3(){
        return new Address("Motinagar", "Hyderabad");
    }
}

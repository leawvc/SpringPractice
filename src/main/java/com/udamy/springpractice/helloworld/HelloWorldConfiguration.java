package com.udamy.springpractice.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address){
        return new Person(name, age, address);
    }
    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address){
        return new Person(name, age, address);
    }
    @Bean(name = "address2")
    @Primary
    public Address address(){
        return new Address("Baker Street", "London");
    }

    /**
     * @Primary : 한 개의 생성자에서 여러 개의 빈이 나열 될 경우 기본 빈을 설정해준다. 사용할 메서드에도 명시하여 기본 빈을 주입시켜줘야 한다.
     * @Qualifier : 기본 빈을 사용하지 않고 다른 빈을 사용시에 사용
     */
    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3(){
        return new Address("Motinagar", "Hyderabad");
    }
}

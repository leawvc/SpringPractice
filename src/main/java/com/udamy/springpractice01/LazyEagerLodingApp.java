package com.udamy.springpractice01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA{

}
@Component
@Lazy
class ClassB{
    private ClassA classA;

    public ClassB(ClassA classA){
        System.out.println("Some Initialization logic");
        this.classA = classA;
    }
    public void doSomething(){
        System.out.println("doSomething");
    }
}


@Configuration
@ComponentScan
public class LazyEagerLodingApp {

    public static void main(String[] args){
        try(var context =
                    new AnnotationConfigApplicationContext
                            (LazyEagerLodingApp.class)){

            System.out.println("Initialiaztion of context is completed");

             context.getBean(ClassB.class).doSomething();

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}

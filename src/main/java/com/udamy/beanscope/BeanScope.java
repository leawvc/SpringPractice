package com.udamy.beanscope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;


/**
 * 기본적으로 Spring에서 선언되는 기본 클래스는 싱글톤 클래스로 Bean을 요청할때마다 같은 인스턴스가 반환된다.
 * 싱글톤은 Spring ioc 컨테이너당 객체 인스턴스가 딱 하나만 존재한다. 그렇기에 같은 인스턴스를 활용하고 싶다면 싱글톤 인스턴스를 활용해야 한다.
 * Java 싱글톤의 경우 JVM 하나당 객체가 하나인 것이다.
 */
@Component
class NormalClass{

}

/**
 * 프로토타입의 경우에는 Spring ioc 컨테이너당 객체 인스턴스가 여러 개 존재할 수 있다.
 */
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{
}


@Configuration
@ComponentScan
public class BeanScope {

    public static void main(String[] args){
        try(var context =
                    new AnnotationConfigApplicationContext
                            (BeanScope.class)){
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
    }
}

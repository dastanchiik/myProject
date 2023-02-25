package org.example;

import org.example.models.Svet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {


        AnnotationConfigApplicationContext args1 = new AnnotationConfigApplicationContext(MyConfig.class);
        Svet svet = (Svet) args1.getBean("svet");
        System.out.println(svet.result());




    }
}

package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {


        AnnotationConfigApplicationContext args1 = new AnnotationConfigApplicationContext(MyConfig.class);

        Person p = (Person) args1.getBean( "person" );
        System.out.println(p.getName()+" "+p.getAge());



    }
}

package Springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        // load spring config file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container

        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);


        // check if they are the same and print out the results

        System.out.println("\nPointing to the same object : "+(alphaCoach == theCoach));

        System.out.println("\nMemory location for theCoach : "+ theCoach);
        System.out.println("\nMemory location for alphaCoach : "+ alphaCoach);

        context.close();

    }
}

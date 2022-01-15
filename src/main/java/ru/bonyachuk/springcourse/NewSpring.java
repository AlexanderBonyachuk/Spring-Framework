package ru.bonyachuk.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getsong());
        context.close();
    }
}
package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        System.out.println(person.getName() + " likes " + person.getAnimal());
        person.personLikeAnimal();
        Person person1 = context.getBean("FriendPerson", Person.class);
        System.out.println(person1.getName() + " likes " + person.getAnimal());
        person1.personLikeAnimal();
        context.close();
    }
}

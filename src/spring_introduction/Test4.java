package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        /*Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("biggy");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("bobby");

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());*/

        //System.out.println("the same object? " + (myDog == yourDog));
        //System.out.println("myDog address: " + myDog);
        //System.out.println("yourDog address: " + yourDog);

        context.close();
    }
}

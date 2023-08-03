package spring_introduction;

//@Component("catBean")
public class Cat implements Pet {
    public Cat() {
        System.out.println("cat bean created");
    }

    @Override
    public void say() {
        System.out.println("-meow");
    }
}

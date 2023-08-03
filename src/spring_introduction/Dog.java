package spring_introduction;

//@Component
//@Scope("prototype")
public class Dog implements Pet {
    //private String name;
    public Dog() {
        System.out.println("dog bean created");
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    /*@PostConstruct
    protected void init() {
        System.out.println("class dog: init method");
    }

    @PreDestroy
    protected void destroy() {
        System.out.println("class dog: destroy method");
    }*/

    @Override
    public void say() {
        System.out.println("-bark");
    }
}

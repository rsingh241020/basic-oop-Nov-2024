package abstrationexample;

public class MainClass {
    public static void main(String[] args) {
       // AbstractClass abstractClass = new AbstractClass(); can not create object for the abstraction class


        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.demo1();
        concreteClass.demo2();
    }
}

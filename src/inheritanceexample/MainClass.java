package inheritanceexample;

public class MainClass {
    public static void main(String[] args) {


        Animal animal = new Animal();
        animal.see();
        animal.breathe();
        animal.eat();
        System.out.println("----------------------Human Class------------------");
        Human human = new Human();
        human.talk();
        human.breathe();
        human.eat();
        human.see();
        human.think();

        System.out.println("----------------------Bird Class------------------");
        Bird bird = new Bird();
        bird.fly();
        bird.breathe();
        bird.eat();
        bird.see();
        System.out.println("----------------------Dog Class------------------");
        Dog dog = new Dog();
        dog.bark();
        dog.breathe();
        dog.eat();
        dog.see();

        System.out.println("----------------------Fish Class------------------");
        Fish fish = new Fish();
        fish.swim();
        fish.breathe();
        fish.eat();
        fish.see();
    }
}

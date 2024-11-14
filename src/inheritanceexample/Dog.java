package inheritanceexample;

public class Dog extends Animal{
    public void bark(){
        System.out.println("Dog Can Bark");
    }

    @Override
    public void see() {
        System.out.println("Dog can see");
    }
}

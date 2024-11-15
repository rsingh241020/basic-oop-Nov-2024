package InterfaceExample;

public class SampleClass implements SampleInterface, SampleInterface2 {
    @Override
    public void demo1() {
        System.out.println("The Value of a"+SampleInterface.a);
        System.out.println("Demo1 Implements inside SampleClass");

    }
    public void demo2(){
        System.out.println("The Value of a"+SampleInterface.b);

        System.out.println("Demo2 Implements inside the SampleClass");
    }
    public void demo3(){
        System.out.println("Demo3 is Implements inside the SampleClass");
    }
}

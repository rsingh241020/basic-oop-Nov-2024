package firstmain;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hii EveryOne THis is My First Spring .");
        Student student1 = new Student();
        System.out.println("Student is :"+student1);
        student1.id=1;
        student1.name ="Rohit";
        student1.age=24;
        student1.email="rsingh241020@gmail.com";
        student1.gender="Male";
        System.out.println("Student is :"+student1);

        Student student2 = new Student(1,"Ravi",23,"ravi123@gmail.com","Male");
        // Parametrized Constructor
        System.out.println("With the Parametrized Constructor"+student2);

        int abc = 1000;
        System.out.println("abc is"+abc);
        final int pqr = 2000;
        System.out.println("pqr is"+pqr);
        // Can not Change the Value of the final Keyword .
        Student st1= new Student();
        st1.demo();
        Student.demo1();
        System.out.println("This is a static value of abc : "+Student.abc);
    }
}

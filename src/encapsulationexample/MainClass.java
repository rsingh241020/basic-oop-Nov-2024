package encapsulationexample;

public class MainClass{
    public static void main(String args[]){
        Student stu1 = new Student();
        stu1.setId(1);
        stu1.setAge(23);
        stu1.setName("Prachi Kumari");
        stu1.setGender("Female");
        stu1.setEmail("prachikr585@gmail.com");
        System.out.println("Studnet1 Details of: "+stu1);
        System.out.println(stu1.getId());
    }
}

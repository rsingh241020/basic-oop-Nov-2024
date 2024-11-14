package firstmain;

public class Student {
    int id;
    String name;
    int age;
    String email;
    String gender;
    static int abc = 1000;
    public void demo(){
        System.out.println("THis is a Non Static Method.");
    }
    public static void demo1(){
        System.out.println("This is a static Method");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Student(int id, String name, int age, String email, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }
    public Student(){

    }
}

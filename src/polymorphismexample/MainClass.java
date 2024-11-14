package polymorphismexample;

public class MainClass {
    public static void main(String args[]){
        SimpleClass sc = new SimpleClass();

        sc.sum(1,2);
        sc.sum(4.3f,3.4f);
        System.out.println(sc.sum(4.2,3.3,3.2));
        sc.sum(3,2);
    }
}

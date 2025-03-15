package _1Introduction;

public class Main {
    public static void main(String[] args){
        Student Prasad = new Student();
//        System.out.println(Prasad.name);
        Prasad.changeName("Mahesh");
        System.out.println(Prasad.name);

        A a1;
        for (int i = 0; i < 1000000000; i++) {
            a1 = new A();
        }
    }
    public static void useThis(){
        System.out.println("imported");
    }
}

class Student {
    String name;
    int roll;
    float marks;

    void changeName(String naam){
        name = naam;
    }
    Student(){
        roll = 90;
        name = "PrasadB";
        marks = 90.00f;
    }
}

class A {
    A(){
        System.out.println("Object is created");
    }

    @Override

    protected void finalize(){
        System.out.println("Object is destroyed");
    }


}

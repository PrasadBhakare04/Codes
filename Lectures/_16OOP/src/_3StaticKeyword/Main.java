package _3StaticKeyword;

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        System.out.println(A.population);
        A obj2 = new A();
        System.out.println(A.population);

        //The value of population for both the objects is same that is 2 in this case
        //The convention is to use the static members directly referencing by the Class name
        //however you can do it using the object it is not recommended
        System.out.println(obj1.population);
        System.out.println(obj2.population);

    }
}

class A{
    static int population = 0;

    void greetings(){
        System.out.println("Hello world");
    }
    //You cannot use non-static methods inside static members directly
//    static void fun(){
//        greetings();
//    }

    //However you can by creating an object of the class in which the method
    //declared and call it using the object
    static void fun(){
        A o1 = new A();
        o1.greetings();
    }
    A(){
        //Whenever a new object of the class A is created population is incremented by one
        population += 1;
    }
}

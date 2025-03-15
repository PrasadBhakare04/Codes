package _7OOPPrinciples.Inheritance;

public class Main {
    public static void main(String[] args) {
        Parent o1 = new Parent();
        Child o2 = new Child();
        System.out.println(o2.value);
        o2.function();
    }
}
class Parent{
    static final int value = 10;
    static final void function(){
        System.out.println("Hello from parent");
    }
}
class Child extends Parent{
//    void function(){
//        System.out.println("Hello from child");
//    }
}

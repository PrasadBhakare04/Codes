package _4StaticBlock;

public class Main {
    public static void main(String[] args) {
        A o1 = new A();
        A o2 = new A();
    }
}
class A{
    //This will run only once
    //When the first object of the class is created
    static {
        System.out.println("Hello");
    }
}

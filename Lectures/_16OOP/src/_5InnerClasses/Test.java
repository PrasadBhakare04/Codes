package _5InnerClasses;

public class Test {
    static class demo{
        demo(){
            String name = "Prasad";
        }
    }

    public static void main(String[] args) {
        //The inner class should be declared static in order to create object and to use members of that class
        //There is no need to make the members also static
        demo d1 = new demo();
    }
}

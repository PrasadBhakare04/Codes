package _5InnerClasses;

public class Main {
    static class A{
        String name = "Prasad";
        A(){
            name = "Bhakare";
        }
    }

    public static void main(String[] args) {
        A o2 = new A();
        System.out.println(o2.name);
    }
}


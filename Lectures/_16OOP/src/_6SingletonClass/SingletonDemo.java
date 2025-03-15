package _6SingletonClass;

public class SingletonDemo {
    public static void main(String[] args) {
        //Both the obj1 and obj2 will point to the same object though the reference name are different
        Singleton obj1 = Singleton.getInstance("Prasad");
        Singleton obj2 = Singleton.getInstance("Pratik");
        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
class Singleton{
    String name;
    private Singleton(String name){
        this.name = name;
    }
    private static Singleton instance;
    public static Singleton getInstance(String name){
        if(instance == null){
            instance = new Singleton(name);
        }
        return instance;
    }
}

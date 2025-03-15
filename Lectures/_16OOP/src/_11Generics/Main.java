package _11Generics;

public class Main {
    public static void main(String[] args) {
//        _1CustomIntArrayList list = new _1CustomIntArrayList();
//        for (int i = 1; i <= 14; i++) {
//            list.add(i);
//        }
//        System.out.println(list);
//        list.size();
//        list.remove();
//        System.out.println(list);
//        list.size();

        _2CustomGenArrayList<String> list= new _2CustomGenArrayList<>();
        list.add("ABjb");
        list.add("Prasad");
        list.add("Kapirath");

        System.out.println(list);

    }
}

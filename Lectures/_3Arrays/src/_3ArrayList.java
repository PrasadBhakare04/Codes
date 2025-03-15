import java.util.*;
public class _3ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(80);
        list.add(90);
        list.add(20);
        list.add(10);
        list.add(50);
        list.add(30);

        System.out.println(list);
        System.out.println(list.get(0));

        list.set(2, 77);
        System.out.println(list);

        list.add(22);
        System.out.println(list);

        list.remove(6);
        System.out.println(list);

        System.out.println(list.contains(77));


    }
}

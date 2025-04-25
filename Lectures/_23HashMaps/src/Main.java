import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        System.out.println("Declaration");
        HashMap<String, Integer> map = new HashMap<>();

        System.out.println("Insertion and Updation");
        map.put("Prasad", 90);
        map.put("ABC", 91);
        map.put("FGG", 60);
        map.put("www", 66);

        map.putIfAbsent("www", 55);
        System.out.println();

        System.out.println("Retrieval");
        System.out.println(map.get("www"));
        System.out.println(map.getOrDefault("www", 22222));
        System.out.println();

        System.out.println("Removal");
        System.out.println(map.remove("www"));
        System.out.println(map.remove("ABC", 91));
        System.out.println();

        System.out.println("Size and Emptiness");
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println();

        System.out.println("Iteration");
        for (String k : map.keySet()){
            System.out.print(k + " ");
        }
        System.out.println();
        for (Integer v : map.values()){
            System.out.print(v + " ");
        }
        System.out.println();
        for (Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e);
        }
        System.out.println();

        System.out.println("Clearing");
        map.clear();
    }
}
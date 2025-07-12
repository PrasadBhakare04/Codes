package _24Graphs;
import java.util.*;
public class Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices");
        int v = sc.nextInt();
        create(v, sc);
    }

    public static void create(int v, Scanner sc){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<Integer>());
        }
        System.out.println("Enter the number of edges");
        int edges = sc.nextInt();
        for (int i = 0; i < edges; i++) {
            System.out.println("enter the edge");
            int u = sc.nextInt();
            int w = sc.nextInt();
            graph.get(u).add(w);
            graph.get(w).add(u);
        }
        print(graph);
    }

    static void print(ArrayList<ArrayList<Integer>> graph){
        for (ArrayList<Integer> arrayList : graph) {
            System.out.println(arrayList);
        }
    }
}
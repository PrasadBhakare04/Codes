package _26DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class Traversal {
    public static void main(String[] args) {
        System.out.println("Enter number of vertices");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        System.out.println(dfs(0, create(v, sc), new ArrayList<Integer>(), new boolean[v]));
    }

    public static ArrayList<Integer> dfs(int node, ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> traversal, boolean[] vis){
        traversal.add(node);
        vis[node] = true;
        for (int cur : graph.get(node)) {
            if(!vis[cur]){
                dfs(cur, graph, traversal, vis);
            }
        }
        return traversal;
    }

    public static ArrayList<ArrayList<Integer>> create(int v, Scanner sc){
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
        return graph;
    }
}

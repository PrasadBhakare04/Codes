package _25BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Traversal {
    public static void main(String[] args) {
        System.out.println("Enter number of vertices");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        System.out.println(bfs(create(v, sc), 0));
    }

    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> graph, int start){
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.size()];
        q.add(start);
        vis[start] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            bfs.add(node);

            for(int cur : graph.get(node)){
                if(!vis[cur]){
                    q.add(cur);
                    vis[cur] = true;
                }
            }
        }
        return bfs;
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

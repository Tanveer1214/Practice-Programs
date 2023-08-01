package com.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph_ArrayList {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> []graph) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    public static void bfs(ArrayList<Edge> []graph, int V) {
        Queue<Integer> q = new LinkedList<>();
        boolean []vis = new boolean[V];
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if(!vis[curr]) {
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i=0;i<graph[curr].size();i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }

    public static void dfs(ArrayList<Edge> []graph, int curr, boolean []vis) {
        System.out.print(curr+" ");
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest])
                dfs(graph,e.dest,vis);
        }
    }

    public static void printAllPaths(ArrayList<Edge> []graph, boolean []vis, int curr, String path, int target) {
        if(curr == target) {
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                vis[curr] = true;
                printAllPaths(graph,vis,e.dest,path+e.dest, target);
                vis[curr] = false;
            }
        }
    }

    public static boolean isCycle(ArrayList<Edge> []graph, boolean []vis, int curr, boolean []rec) {
        vis[curr] = true;
        rec[curr] = true;

        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(rec[e.dest]) {
                return true;
            }
            else if(!vis[e.dest]) {
                if(isCycle(graph,vis,e.dest,rec)) {
                    return true;
                }
            }
        }
        rec[curr] = false;
        return false;
    }

    public static void topSortUtil(ArrayList<Edge> []graph, int curr, boolean []vis, Stack<Integer> stack) {
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                topSortUtil(graph,e.dest,vis,stack);
            }
        }
        stack.push(curr);
    }

    public static void topSort(ArrayList<Edge> []graph, int v) {
        boolean[] vis = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<v;i++) {
            if(!vis[i]) {
                topSortUtil(graph,i,vis,stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }

    public static boolean isCycleUndirected(ArrayList<Edge> []graph, boolean []vis, int curr, int par) {
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest] && e.dest != par) {
                return true;
            }
            else if(!vis[curr]) {
                if(isCycleUndirected(graph,vis,e.dest,curr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> []graph = new ArrayList[V];
        createGraph(graph);
        boolean []vis = new boolean[V];

        //bfs(graph,V);
        //dfs(graph,0,vis);
        //printAllPaths(graph,vis,0,"0",3);
        //System.out.println(isCycle(graph,new boolean[V],0,new boolean[V]));
        //topSort(graph,V);
        System.out.println(isCycleUndirected(graph,vis,0,-1));


        /*
         for(int i=0;i<V;i++) { // if graph is divided in different parts then you can use loop like this then call function in loop.
             if(!vis[i]) {
                 bfs(graph,V);
             }
         }
        */

    }
}
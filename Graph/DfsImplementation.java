package Graph;

import java.util.ArrayList;

public class DfsImplementation {

    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        // create empty lists
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 2));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));

    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visited[]){
        // print 
        System.out.println(curr+ " ");

        // make visited true
        visited[curr] = true;

        // add neibhour
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(visited[e.dest] == false){ // if not visited then only call

                dfs(graph, e.dest, visited);

            }
        }
    }

    public static void main(String[] args) {
        int V =4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        boolean visited[] = new boolean[V];
        createGraph(graph);
        dfs(graph, 0, visited);
     }
}

package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfsImplementation {
    static class Edge{
        int src;
        int dist;

        public Edge(int s, int d){
            this.src = s;
            this.dist = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        // create empty arraylist for each array indexes
        for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<Edge>();
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

    public static void bfs(ArrayList<Edge> graph[], int V){
        // Create Queue
        Queue<Integer> q = new LinkedList<>();
        // Visisted array
        boolean vis[] = new boolean[V];
        // Intialise it by any starting point 
        q.add(0); 

        // Now actual operation starts from here
        while(!q.isEmpty()){
            int curr = q.remove();
            // now check if not visited visit it by assigning true
            if(vis[curr] == false){
                // Print curr first 
                System.out.println(curr + " ");
                // Make it true after visiting
                vis[curr] = true;

                // Now the third step add the neibhours
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dist);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V =4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bfs(graph, V);
    }
}


class bfsTrying{
    
}
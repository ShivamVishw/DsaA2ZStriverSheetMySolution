package Graph;
import java.util.ArrayList;

public class PrintAllPathFromSrcToDest {

    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src= s;
            this.dest =d;
        }
    }
   
    public static void createGraph(ArrayList<Edge> graph[]){

        // We are createing empty arraylist in each index of array
        // Bacause intially it containing null not empty and for proceeding we have to make sure that those places are empty not null otherwise it will give errors
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 4));
    }

    public static void dfsModifiedForPrintAllPath(ArrayList<Edge> graph[], boolean visited[], int curr, String path,int target){

        // base case
        if(curr == target){
            System.out.println(path);
            return;
        }

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!visited[e.dest]){
                visited[e.dest] = true; 
                dfsModifiedForPrintAllPath(graph, visited, e.dest, path + e.dest, target);
                // while backtracking make it false or unvisisted again for next posssible path 
                // Mark the node you are entering as visited, and unmark it while backtracking.
                visited[e.dest] = false;  
            }

        }
    }

    public static void main(String[] args) {
        int V =5; // Number of vertex
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);
        int target = 4;
        dfsModifiedForPrintAllPath(graph, new boolean[V],0, "0", target);

    }
}

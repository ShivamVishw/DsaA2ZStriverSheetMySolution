package Graph;
import java.util.ArrayList;

public class UndirectedWeightedGraph {
    static class Edge{
        int src;
        int dest;
        int wt;

        // Constructor
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

        // We are createing empty arraylist in each index of array
        // Bacause intially it containing null not empty and for proceeding we have to make sure that those places are empty not null otherwise it will give errors
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2,2));

        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));

        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 2,-1));

        graph[3].add(new Edge(3, 1,0));
        graph[3].add(new Edge(3, 2, -1));
    }

    public static void main(String[] args) {
        int V =4; // Number of vertex
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        // Lets print 2's neibhours
        for(int i=0; i<graph[3].size(); i++){
            Edge e = graph[3].get(i);
            System.out.println(e.dest+ ", "+ e.wt);  // This is the neibhouring node to 2's node 
        }
    }
}

package Graph;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkestrasAlgorithm {

    static class Edge {
        int src;
        int dest;
        int wt;
    
        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static class Pair implements Comparable<Pair>{

        // This comparable decide that we have to compare based on edge distance 

        int node; // dest node
        int dist; // Edge distance till dest node

        // constructor
        public Pair(int n, int d){
            this.node = n;
            this.dist = d; 
        }

        // Overrride compareto fn to tell we have to compare based on distance
        @Override
        public int compareTo(Pair p2){
            return this.dist - p2.dist;  
        }

    }

    public static void dijkestra(ArrayList<Edge> graph[], int src, int V){

        // Do initialization first 
        // Priority Queue
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // Crete distance array or vector
        int dist[] = new int[V];

        // Assign infinity at each node expect at src 
        for(int i=0; i<V; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE; // Infinity
            }
        }

        // Create boolean visited array
        boolean visited[] = new boolean[V];

        // add sorce node at starting 
        pq.add(new Pair(0, 0));


        // Now initialization is done now write actual code implementation 
        while(!pq.isEmpty()){
            // Get the curr pair as shortest which will be automatically coming due to priority q
            Pair curr = pq.remove();

            // Now check if curr.node not visited then do operation 
            if(!visited[curr.node]){
                visited[curr.node] = true;

                // Go to neibhouring
                for(int i =0; i< graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);

                    int u = e.src;
                    int v = e.dest;

                    if(dist[u] + e.wt < dist[v]){  // Relaxation
                        dist[v] = dist[u] + e.wt;
                        // now after updating add the neibhouring weight i.e new pair 
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        // Print the shortest distances
        for(int i=0; i<V; i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();


    }

    public static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }


    public static void main(String[] args) {
        int V =6;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);
        dijkestra(graph, 0, V);
    }
}

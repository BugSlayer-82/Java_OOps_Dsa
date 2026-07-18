import java.util.ArrayList;

public class GraphClass {
    // /* ========>> Undirected and Weighted Graph */
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.weight = wt;
        }
    }
    public static void createGraph(ArrayList<Edge> []graph){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));
         
        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3,-1));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }

    // /* =======>> Undirected and Unweighted Graph */
    // static class Edge {
    // int src;
    // int dest;
    // public Edge(int s, int d) {
    // this.src = s;
    // this.dest = d;
    // }
    // }
    // public static void createGraph(ArrayList<Edge>[] graph) {
    // for (int i = 0; i < graph.length; i++) {
    // graph[i] = new ArrayList<>();
    // }
    // graph[0].add(new Edge(0, 1));
    // graph[1].add(new Edge(1, 2));
    // graph[1].add(new Edge(1, 3));
    // graph[2].add(new Edge(2, 0));
    // graph[2].add(new Edge(2, 1));
    // graph[2].add(new Edge(2, 3));
    // graph[3].add(new Edge(3, 1));
    // graph[3].add(new Edge(3, 2));
    // }

    public static void main(String[] args) {
        // /* =====>> Adjacency List / Array of ArrayList <<======= */
        // Here is the implementaion of unweighted-graph and undirected graph
        // int V = 4;
        // ArrayList<Edge>[] graph = new ArrayList[V];
        // createGraph(graph);
        // // Print neighbours of 2
        // for (int i = 0; i < graph[2].size(); i++) {
        //     Edge e = graph[2].get(i);
        //     System.out.print(e.dest + " ");
        // }
        // System.out.println();

        // Here is the implementaion of Weighted-graph and undirected graph
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        // Print neighbours of 2
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.dest + " ,"+ e.weight );
        }

    }
}

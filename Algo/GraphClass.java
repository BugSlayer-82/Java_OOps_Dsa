// import java.util.Queue;
// import java.util.ArrayList;
// import java.util.LinkedList;

public class GraphClass {
    // /* ========>> Graph Traversel (BFS/DFS) <<===========*/

    // /* Method 1 ======>> Breadth First Search */
    // static class Edge {
    // int src;
    // int dest;
    // public Edge(int s, int d) {
    // this.src = s;
    // this.dest = d;
    // }
    // }
    // /* =========>> BFS for non disconnected components of graph Time Complexity
    // O(V+E)<<======== */
    // public static void bfs(ArrayList<Edge>[] graph, int V) {
    // Queue<Integer> q = new LinkedList<>();
    // boolean[] visit = new boolean[V];
    // q.add(0);
    // while (!q.isEmpty()) {
    // int curr = q.remove();
    // if (visit[curr] == false) {
    // System.out.print(curr + " ");
    // visit[curr] = true;
    // for (int i = 0; i < graph[curr].size(); i++) {
    // Edge e = graph[curr].get(i);
    // q.add(e.dest);
    // }
    // }
    // }
    // }
    // public static void createGraph(ArrayList<Edge>[] graph) {
    // for (int i = 0; i < graph.length; i++) {
    // graph[i] = new ArrayList<>();
    // }
    // graph[0].add(new Edge(0, 1));
    // graph[0].add(new Edge(0, 2));
    // graph[1].add(new Edge(1, 0));
    // graph[1].add(new Edge(1, 3));
    // graph[2].add(new Edge(2, 0));
    // graph[2].add(new Edge(2, 4));
    // graph[3].add(new Edge(3, 1));
    // graph[3].add(new Edge(3, 4));
    // graph[3].add(new Edge(3, 5));
    // graph[4].add(new Edge(4, 2));
    // graph[4].add(new Edge(4, 3));
    // graph[4].add(new Edge(4, 5));
    // graph[5].add(new Edge(5, 3));
    // graph[5].add(new Edge(5, 4));
    // graph[5].add(new Edge(5, 6));
    // // doubt here
    // graph[6].add(new Edge(6, 5));
    // }
    // /* =========>> BFS for disconnected components of graph Time Complexity
    // O(V+E)<<=========== */
    // public static void bfs(ArrayList<Edge>[] graph, int V, boolean[] visit, int
    // start) {
    // Queue<Integer> q = new LinkedList<>();
    // q.add(start);
    // while (!q.isEmpty()) {
    // int curr = q.remove();
    // if (visit[curr] == false) {
    // System.out.print(curr + " ");
    // visit[curr] = true;
    // for (int i = 0; i < graph[curr].size(); i++) {
    // Edge e = graph[curr].get(i);
    // q.add(e.dest);
    // }
    // }
    // }
    // }
    // public static void createGraph(ArrayList<Edge>[] graph) {
    // for (int i = 0; i < graph.length; i++) {
    // graph[i] = new ArrayList<>();
    // }
    // graph[0].add(new Edge(0, 1));
    // graph[0].add(new Edge(0, 2));
    // graph[1].add(new Edge(1, 0));
    // graph[1].add(new Edge(1, 3));
    // graph[2].add(new Edge(2, 0));
    // graph[2].add(new Edge(2, 4));
    // graph[3].add(new Edge(3, 1));
    // graph[3].add(new Edge(3, 4));
    // graph[3].add(new Edge(3, 5));
    // graph[4].add(new Edge(4, 2));
    // graph[4].add(new Edge(4, 3));
    // graph[4].add(new Edge(4, 5));
    // graph[5].add(new Edge(5, 3));
    // graph[5].add(new Edge(5, 4));
    // graph[5].add(new Edge(5, 6));
    // graph[6].add(new Edge(6, 5));
    // }

    // /* Method 2 ======>> Depth First Search */
    


    // /* ========>> Undirected and Weighted Graph */
    // static class Edge {
    // int src;
    // int dest;
    // int weight;
    // public Edge(int s, int d, int wt) {
    // this.src = s;
    // this.dest = d;
    // this.weight = wt;
    // }
    // }
    // public static void createGraph(ArrayList<Edge> []graph){
    // for(int i = 0; i < graph.length; i++){
    // graph[i] = new ArrayList<>();
    // }
    // graph[0].add(new Edge(0, 1, 2));
    // graph[1].add(new Edge(1, 2, 10));
    // graph[1].add(new Edge(1, 3, 0));
    // graph[2].add(new Edge(2, 0, 2));
    // graph[2].add(new Edge(2, 1, 10));
    // graph[2].add(new Edge(2, 3,-1));
    // graph[3].add(new Edge(3, 1, 0));
    // graph[3].add(new Edge(3, 2, -1));
    // }

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
        // Edge e = graph[2].get(i);
        // System.out.print(e.dest + " ");
        // }
        // System.out.println();

        // Here is the implementaion of Weighted-graph and undirected graph
        // int V = 4;
        // ArrayList<Edge>[] graph = new ArrayList[V];
        // createGraph(graph);
        // // Print neighbours of 2
        // for (int i = 0; i < graph[2].size(); i++) {
        // Edge e = graph[2].get(i);
        // System.out.println(e.dest + " ,"+ e.weight );
        // }

        // Here is the implementaion of BFS(Breadth First Search) for unweighted and
        // undirected graph
        // int V = 7;
        // ArrayList<Edge>[] graph = new ArrayList[V];
        // createGraph(graph);
        // bfs(graph, V);
        // System.out.println();

        // Here is the implementaion of BFS(Breadth First Search) for unweighted and
        // undirected graph of disconnected component
        // int V = 7;
        // ArrayList<Edge>[] graph = new ArrayList[V];
        // createGraph(graph);
        // boolean[] visit = new boolean[V];
        // for (int i = 0; i < V; i++) {
        // if (visit[i] == false) {
        // bfs(graph, V, visit, i);
        // }
        // }
        // System.out.println();

    }
}

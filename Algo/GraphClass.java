
// import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;
// import java.util.LinkedList;
import java.util.PriorityQueue;

public class GraphClass {

    // /* =========>> Bridge in Graphs (Tarjan's Algorithm) <<========= */
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void dfs(ArrayList<Edge> []graph,int curr,boolean [] visit,int []dt,
     int [] low, int time , int par){
        
        visit[curr] = true;
        dt[curr] = low[curr] = ++time;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(e.dest == par){
                continue;
            }
            else if(!visit[e.dest]){
                dfs(graph,e.dest,visit,dt,low, time,curr);
            }
        }
     }
    public static void getBridge(ArrayList<Edge>[]graph, int V){
        int [] dt = new int [V];
        int [] low = new int [V];
        int time = 0;
        boolean [] visit = new boolean[V];
        for(int i = 0; i < V; i++){
            if(!visit[i]){
                dfs(graph,i, visit,dt,low,time ,-1);
            }
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
    }
    // /* =========>> Strongly Connected Component (Kosaraju's Algorithm Time
    // Complexity O(V + E)) <<=========== */
    // static class Edge {
    // int src;
    // int dest;
    // public Edge(int s, int d) {
    // this.src = s;
    // this.dest = d;
    // }
    // }
    // public static void topSort(ArrayList<Edge>[] graph, int curr, boolean[]
    // visit, Stack<Integer> s) {
    // visit[curr] = true;
    // for (int i = 0; i < graph[curr].size(); i++) {
    // Edge e = graph[curr].get(i);
    // if (!visit[e.dest]) {
    // topSort(graph, e.dest, visit, s);
    // }
    // }
    // s.push(curr);
    // }
    // public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visit) {
    // visit[curr] = true;
    // System.out.print(curr + " ");
    // for (int i = 0; i < graph[curr].size(); i++) {
    // Edge e = graph[curr].get(i);
    // if (!visit[e.dest]) {
    // dfs(graph, e.dest, visit);
    // }
    // }
    // }
    // public static void KosarajuAlgo(ArrayList<Edge>[] graph, int V) {
    // // Step - 1 O(V+E)
    // Stack<Integer> stack = new Stack<>();
    // boolean[] visit = new boolean[V];
    // for (int i = 0; i < V; i++) {
    // if (!visit[i]) {
    // topSort(graph, i, visit, stack);
    // }
    // }
    // // Step - 2 O(V+E)
    // ArrayList<Edge>[] transpose = new ArrayList[V];
    // for (int i = 0; i < graph.length; i++) {
    // visit[i] = false;
    // transpose[i] = new ArrayList<>();
    // }
    // for (int i = 0; i < V; i++) {
    // for (int j = 0; j < graph[i].size(); j++) {
    // Edge e = graph[i].get(j); // e.src --> e.dest
    // transpose[e.dest].add(new Edge(e.dest, e.src));
    // }
    // }
    // // Step - 3 O(V+E)
    // while (!stack.isEmpty()) {
    // int curr = stack.pop();
    // if (!visit[curr]) {
    // dfs(transpose, curr, visit);
    // System.out.println();
    // }
    // }
    // }
    // public static void createGraph(ArrayList<Edge>[] graph) {
    // for (int i = 0; i < graph.length; i++) {
    // graph[i] = new ArrayList<>();
    // }
    // graph[0].add(new Edge(0, 2));
    // graph[0].add(new Edge(0, 3));
    // graph[1].add(new Edge(1, 0));
    // graph[2].add(new Edge(2, 1));
    // graph[3].add(new Edge(3, 4));
    // }

    // /* ========>> Minimum Spanning Tree (Prim's Algorithm) Time Complexity
    // O(ElogE) <<======== */
    // static class Edge{
    // int src;
    // int dest;
    // int wei;
    // public Edge(int s,int d , int w){
    // this.src = s;
    // this.dest = d;
    // this.wei = w;
    // }
    // }
    // static class Pair implements Comparable<Pair>{
    // int node;
    // int cost;
    // public Pair(int n,int c){
    // this.node = n;
    // this.cost = c;
    // }
    // @Override
    // public int compareTo(Pair p2){
    // return this.cost - p2.cost; // ascending
    // }
    // }
    // public static void primsAlgo(ArrayList<Edge>[]graph,int V){
    // PriorityQueue <Pair> pq = new PriorityQueue<>();// non mst set (node -int
    // ,cost - int)
    // boolean [] visit = new boolean[V]; // mst set
    // pq.add(new Pair(0,0));
    // int mstCost = 0;
    // while(!pq.isEmpty()){
    // Pair curr = pq.remove();
    // if(!visit[curr.node]){
    // visit[curr.node] = true;
    // mstCost += curr.cost;
    // for(int i = 0; i < graph[curr.node].size(); i ++){
    // Edge e = graph[curr.node].get(i);
    // if(!visit[e.dest]){
    // pq.add(new Pair(e.dest,e.wei));
    // }
    // }
    // }
    // }
    // System.out.println("Minimum cost of mst : "+ mstCost);
    // }
    // public static void createGraph(ArrayList<Edge> []graph){
    // for(int i = 0; i < graph.length; i++){
    // graph[i] = new ArrayList<>();
    // }
    // graph[0].add(new Edge(0,1,10));
    // graph[0].add(new Edge(0,3,30));
    // graph[0].add(new Edge(0,2,15));
    // graph[1].add(new Edge(1,0,10));
    // graph[1].add(new Edge(1,3,40));
    // graph[2].add(new Edge(2,0,15));
    // graph[2].add(new Edge(2,3,50));
    // graph[3].add(new Edge(3,0,30));
    // graph[3].add(new Edge(3,1,40));
    // graph[3].add(new Edge(3,2,50));
    // }

    // /* ========>> Bellman Ford Algorithm (Dynamic Programming) Time Complexity
    // O(V*E) <<======== */
    // static class Edge {
    // int src;
    // int dest;
    // int wei;
    // public Edge(int s, int d, int w) {
    // this.src = s;
    // this.dest = d;
    // this.wei = w;
    // }
    // }
    // public static void bellmanFord(ArrayList<Edge> []graph,int src, int V){
    // int []dist = new int[V];
    // for(int i = 0; i < V; i++){
    // if(i != src){
    // dist[i] = Integer.MAX_VALUE;
    // }
    // }
    // for(int k = 0 ; k < V -1 ; k ++){ // O(V)
    // for(int i = 0 ; i < V; i++){ // O(E)
    // for(int j = 0; j < graph[i].size(); j++){
    // Edge e = graph[i].get(j);
    // int u = e.src;
    // int v = e.dest;
    // if(dist[u] != Integer.MAX_VALUE && dist[u] + e.wei < dist[v])
    // {
    // dist[v] = dist[u]+e.wei;
    // }
    // }
    // }
    // }
    // for(int i = 0; i < dist.length; i++){
    // System.out.print(dist[i]+" ");
    // }
    // System.out.println();
    // }
    // public static void createGraph(ArrayList<Edge>[] graph) {
    // for (int i = 0; i < graph.length; i++) {
    // graph[i] = new ArrayList<>();
    // }
    // graph[0].add(new Edge(0, 1, 2));
    // graph[0].add(new Edge(0, 2, 4));
    // graph[1].add(new Edge(1, 2, -4));
    // graph[2].add(new Edge(2, 3, 2));
    // graph[3].add(new Edge(3, 4, 4));
    // graph[4].add(new Edge(4, 1, -1));
    // }

    // /* ========>> Dijkstra's Algorithm to print the shortest path (Greedy
    // Algorithm) Time Complexity O(E + ElogV) <<========= */
    // static class Edge {
    // int src;
    // int dest;
    // int weig;
    // public Edge(int s, int d, int w) {
    // this.src = s;
    // this.dest = d;
    // this.weig = w;
    // }
    // }
    // public static void createGraph(ArrayList<Edge>[] graph) {
    // for (int i = 0; i < graph.length; i++) {
    // graph[i] = new ArrayList<>();
    // }
    // graph[0].add(new Edge(0, 1, 2));
    // graph[0].add(new Edge(0, 2, 4));
    // graph[1].add(new Edge(1, 3, 7));
    // graph[1].add(new Edge(1, 2, 1));
    // graph[2].add(new Edge(2, 4, 3));
    // graph[3].add(new Edge(3, 5, 1));
    // graph[4].add(new Edge(4, 3, 2));
    // graph[4].add(new Edge(4, 5, 5));
    // }
    // public static class Pair implements Comparable<Pair> {
    // int node;
    // int dist;
    // public Pair(int n, int d) {
    // this.node = n;
    // this.dist = d;
    // }
    // @Override
    // public int compareTo(Pair p2) {
    // return this.dist - p2.dist;
    // }
    // }
    // public static void dijkstra(ArrayList<Edge>[] graph, int src, int V) {
    // PriorityQueue<Pair> pq = new PriorityQueue<>();
    // int[] dist = new int[V];
    // for (int i = 0; i < V; i++) {
    // if (i != src) {
    // dist[i] = Integer.MAX_VALUE;
    // }
    // }
    // boolean[] visit = new boolean[V];
    // pq.add(new Pair(0, 0));
    // while (!pq.isEmpty()) {
    // Pair curr = pq.remove();
    // if (!visit[curr.node]) {
    // visit[curr.node] = true;
    // for (int i = 0; i < graph[curr.node].size(); i++) {
    // Edge e = graph[curr.node].get(i);
    // int u = e.src;
    // int v = e.dest;
    // if (dist[u] + e.weig < dist[v]) {
    // dist[v] = dist[u] + e.weig;
    // pq.add(new Pair(v, dist[v]));
    // }
    // }
    // }
    // }
    // for (int i = 0; i < V; i++) {
    // System.out.print(dist[i] + " ");
    // }
    // }

    // /* ========>> Cycle detection in Undirected graph Time Complexity O(V + E)
    // <<======= */
    // static class Edge {
    // int src;
    // int dest;
    // public Edge(int s, int d) {
    // this.src = s;
    // this.dest = d;
    // }
    // }
    // public static boolean isCycleUndirected(ArrayList<Edge>[]graph,boolean
    // []visit,int curr,int par){
    // visit[curr] = true;
    // for(int i = 0; i < graph[curr].size(); i++){
    // Edge e = graph[curr].get(i);
    // if(visit[e.dest] && e.dest != par){
    // return true;
    // }
    // else if(!visit[e.dest]){
    // if(isCycleUndirected(graph, visit, e.dest, curr)){
    // return true;
    // }
    // }
    // }
    // return false;
    // }
    // public static void createGraph(ArrayList<Edge>[] graph) {
    // for (int i = 0; i < graph.length; i++) {
    // graph[i] = new ArrayList<>();
    // }
    // graph[0].add(new Edge(0, 1));
    // graph[0].add(new Edge(0, 4));
    // graph[1].add(new Edge(1, 0));
    // graph[1].add(new Edge(1, 2));
    // graph[1].add(new Edge(1, 4));
    // graph[2].add(new Edge(2, 1));
    // graph[2].add(new Edge(2, 3));
    // graph[3].add(new Edge(3, 2));
    // graph[4].add(new Edge(4, 0));
    // graph[4].add(new Edge(4, 1));
    // graph[4].add(new Edge(4, 5));
    // graph[5].add(new Edge(5, 4));
    // }

    // /* ========>> Topological Sorting Time Complexity O(V+E) <<========== */
    // static class Edge{
    // int src;
    // int dest;
    // public Edge(int s, int d){
    // this.src = s;
    // this.dest = d;
    // }
    // }
    // public static void topSortUtil(ArrayList<Edge> []graph,int curr, boolean []
    // visit,Stack<Integer> stack){
    // visit[curr] = true;
    // for(int i = 0; i < graph[curr].size(); i++){
    // Edge e = graph[curr].get(i);
    // if(!visit[e.dest]){
    // topSortUtil(graph, e.dest, visit, stack);
    // }
    // }
    // stack.push(curr);
    // }
    // public static void topSort(ArrayList<Edge> []graph, int V){
    // boolean []visit = new boolean[V];
    // Stack<Integer> stack = new Stack<>();
    // for(int i = 0; i < V; i++){
    // if(!visit[i]){
    // topSortUtil(graph, i, visit, stack);
    // }
    // }
    // while(!stack.isEmpty()){
    // System.out.print(stack.pop()+" ");
    // }
    // }
    // public static void createGraph(ArrayList<Edge> []graph){
    // for(int i = 0; i < graph.length; i++){
    // graph[i] = new ArrayList<>();
    // }
    // graph[2].add(new Edge(2, 3));
    // graph[3].add(new Edge(3, 1));
    // graph[4].add(new Edge(4, 0));
    // graph[4].add(new Edge(4, 1));
    // graph[5].add(new Edge(5, 0));
    // }

    // /* ========>> Cycle detection in directed graph Time Complexity O(V + E)
    // <<======= */
    // static class Edge {
    // int src;
    // int dest;
    // public Edge(int s, int d) {
    // this.src = s;
    // this.dest = d;
    // }
    // }
    // public static boolean isCycleDirected(ArrayList<Edge>[] graph, boolean
    // visit[], int curr, boolean[] rec) {
    // visit[curr] = true;
    // rec[curr] = true;
    // for (int i = 0; i < graph[curr].size(); i++) {
    // Edge e = graph[curr].get(i);
    // if (rec[e.dest]) // cycle
    // {
    // return true;
    // } else if (!visit[e.dest]) {
    // if(isCycleDirected(graph, visit, e.dest, rec))
    // {
    // return true;
    // }
    // }
    // }
    // rec[curr] = false;
    // return false;
    // }
    // public static void createGraph(ArrayList<Edge>[] graph) {
    // for (int i = 0; i < graph.length; i++) {
    // graph[i] = new ArrayList<>();
    // }
    // graph[0].add(new Edge(0, 2));
    // graph[1].add(new Edge(1, 0));
    // graph[2].add(new Edge(2, 3));
    // graph[3].add(new Edge(3, 0));
    // }

    // /* Question 1 ===> All Path from Source to Target Time Complexity O(V^V) */
    // static class Edge {
    // int src;
    // int dest;
    // public Edge(int s, int d) {
    // this.src = s;
    // this.dest = d;
    // }
    // }
    // public static void printAllPaths(ArrayList<Edge> []graph ,boolean []visit,int
    // curr,String path,int target){
    // if(curr == target){
    // System.out.println(path);
    // return ;
    // }
    // for(int i = 0; i < graph[curr].size(); i++){
    // Edge e = graph[curr].get(i);
    // if(visit[curr] == false){
    // visit[curr] = true;
    // printAllPaths(graph,visit,e.dest,path+e.dest,target);
    // visit[curr] = false;
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

    // /* ========>> Graph Traversel (BFS/DFS) <<===========*/

    // /* Method 1 ======>> Breadth First Search Time Complexity
    // O(V+E)<<======== */
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

    // /* Method 2 ======>> Depth First Search Time Complexity
    // O(V+E)<<======== */
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
    // public static void dfs(ArrayList<Edge>[]graph,int curr,boolean []visit){
    // System.out.print(curr + " ");
    // visit[curr] = true;
    // for(int i = 0; i < graph[curr].size(); i++){
    // Edge e = graph[curr].get(i);
    // if(visit[e.dest] == false){
    // dfs(graph,e.dest,visit);
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

        // Here is the implementaion of DFS(Depth First Search) for unweighted and
        // undirected graph for non disconnected components
        // int V = 7;
        // ArrayList<Edge>[] graph = new ArrayList[V];
        // boolean [] visit = new boolean[V];
        // createGraph(graph);
        // dfs(graph, 0, visit);
        // System.out.println();

        // Here is the implementaion of DFS(Depth First Search) for unweighted and
        // undirected graph for disconnected components
        // int V = 7;
        // ArrayList<Edge> []graph = new ArrayList[V];
        // createGraph(graph);
        // boolean [] visit = new boolean[V];
        // for(int i = 0; i < V; i++){
        // if(visit[i] == false){
        // dfs(graph, i, visit);
        // }
        // }
        // System.out.println();

        // /* =======>> Question 1 => All Path from Source to Target <<========= */
        // int V = 7;
        // ArrayList<Edge> []graph = new ArrayList[V];
        // createGraph(graph);
        // int src = 0,target = 5;
        // printAllPaths(graph,new boolean[V],src,"0",target);

        // /* ========>> Cycle detection in directed graph <<======= */
        // int V = 4;
        // ArrayList<Edge>[] graph = new ArrayList[V];
        // createGraph(graph);
        // System.out.println(isCycleDirected(graph, new boolean[V], 0, new
        // boolean[V])); // This for only non disconnected graph
        // /* These line of code only for disconnected graph */
        // boolean [] visit = new boolean [V];
        // boolean [] rec = new boolean[V];
        // for(int i = 0; i < V; i++){
        // if(!visit[i]){
        // boolean isCycle = isCycleDirected(graph, visit, 0, rec);
        // if(isCycle){
        // System.out.println(isCycle);
        // }
        // break;
        // }
        // }

        // /* ========>> Topological Sorting Time Complexity O(V+E) <<========== */
        // int V = 6;
        // ArrayList<Edge> [] graph = new ArrayList[V];
        // createGraph(graph);
        // topSort(graph,V);
        // System.out.println();

        // /* ========>> Cycle detection in Undirected graph <<======= */
        // int V = 6;
        // ArrayList<Edge> []graph = new ArrayList[V];
        // createGraph(graph);
        // System.out.println(isCycleUndirected(graph, new boolean[V], 0, -1));

        // /* ========>> Dijkstra's Algorithm to print the shortest path (Greedy
        // Algorithm) <<========= */
        // int V = 6;
        // ArrayList<Edge>[] graph = new ArrayList[V];
        // createGraph(graph);
        // dijkstra(graph, 0, V);
        // System.out.println();

        // /* ========>> Bellman Ford Algorithm (Dynamic Programming) Time Complexity
        // O(V*E) <<======== */
        // int V = 5;
        // ArrayList<Edge>[] graph = new ArrayList[V];
        // createGraph(graph);
        // bellmanFord(graph, 0, V);

        // /* ========>> Minimum Spanning Tree (Prim's Algorithm) Time Complexity
        // O(ElogE) <<======== */
        // int V = 4;
        // ArrayList<Edge> []graph = new ArrayList[V];
        // createGraph(graph);
        // primsAlgo(graph, V);

        // /* =========>> Strongly Connected Component (Kosaraju's Algorithm)
        // <<=========== */
        // int V = 5;
        // ArrayList<Edge>[] graph = new ArrayList[V];
        // createGraph(graph);
        // KosarajuAlgo(graph, V);


        // /* =========>> Bridge in Graphs (Tarjan's Algorithm) <<========= */
        int V = 6; 
        ArrayList<Edge> [] graph = new ArrayList[V];
        createGraph(graph);
    }
}

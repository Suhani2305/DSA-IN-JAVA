import java.util.ArrayList;

// public class graph {
//     //breadth first search
//     public ArrayList<Integer> bfs(int v, ArrayList<ArrayList<Integer>> adj){
//         ArrayList<Integer> result = new ArrayList<>();
//         boolean[] visited = new boolean[adj.size()];
//         java.util.Queue<Integer> queue = new java.util.LinkedList<>();

//         visited[v] = true;
//         queue.add(v);

//         while (!queue.isEmpty()) {
//             int node = queue.poll();
//             result.add(node);

//             for (int neighbor : adj.get(node)) {
//                 if (!visited[neighbor]) {
//                     visited[neighbor] = true;
//                     queue.add(neighbor);
//                 }
//             }
//         }

//         return result;
//     }


//     // depth first search
//     public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
//         vis[node]= true;
//         ls.add(node);
//         for(Integer it: adj.get(node)){
//             if(vis[it]== false){
//                 dfs(it,vis,adj,ls);
//             }
//         }

//     }
//     public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
//         boolean[] vis = new boolean[V+1];
//         vis[0] = true;
//         ArrayList<Integer> ls = new ArrayList<>();
//         dfs(0, vis, adj, ls);
//         return ls;
//     }
//     public static void main(String args[]) {

//         ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
//         for (int i = 0; i < 5; i++) {
//             adj.add(new ArrayList < > ());
//         }
//         adj.get(0).add(2);
//         adj.get(2).add(0);
//         adj.get(0).add(1);
//         adj.get(1).add(0);
//         adj.get(0).add(3);
//         adj.get(3).add(0);
//         adj.get(2).add(4);
//         adj.get(4).add(2);
        
//         graph g = new graph();
//         ArrayList < Integer > ans = g.dfsOfGraph(5, adj);
//         int n = ans.size(); 
//         for(int i = 0;i<n;i++) {
//             System.out.print(ans.get(i)+" "); 
//         }
//     }

// }


//cycle detection in unidirected graph using dfs
// class graph{
//     public boolean checkForCycle(int node, int parent, ArrayList<ArrayList<Integer>> adj , int[] vis ){
//         vis[node]=1;
//         for(int ad : adj.get(node)){
//             if(vis[ad]==0){
//                 if(checkForCycle( ad, node, adj, vis)==true){
//                     return true;
//                 }
//             }else if(ad != parent){   //"Agar current node ka ek neighbour already visited hai aur wo parent nahi hai, to cycle hai."
//                 return true;
//             }
//         }
//         return false;

//     }

//     public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj){
//         int vis[] = new int[v];
//         for(int  i=0;i<v;i++){
//             if(vis[i]==0){
//                 if(checkForCycle(i,-1,adj,vis)== true){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }





// Number of Distinct Islands
// store shape in set data structure  so they give mee unique shape .. 


import java.util.*;

// Pair class for adjacency list
class Pair {
    int first, second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

// Solution class for shortest path logic
class Solution {
    private void topoSort(int node, ArrayList<ArrayList<Pair>> adj, int[] vis, Stack<Integer> st) {
        vis[node] = 1;
        for (int i = 0; i < adj.get(node).size(); i++) {
            Pair neighbor = adj.get(node).get(i);
            if (vis[neighbor.first] == 0) {
                topoSort(neighbor.first, adj, vis, st);
            }
        }
        st.push(node);
    }

    public int[] shortestPath(int N, int M, int[][] edges) {
        final int INF = 1000000000;

        // Create adjacency list
        ArrayList<ArrayList<Pair>> adj = new ArrayList<ArrayList<Pair>>();
        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<Pair>());
        }
        for (int i = 0; i < M; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new Pair(v, wt));
        }

        // Topo sort
        int[] vis = new int[N];
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < N; i++) {
            if (vis[i] == 0) {
                topoSort(i, adj, vis, st);
            }
        }

        // Distance array
        int[] dist = new int[N];
        for (int i = 0; i < N; i++) {
            dist[i] = INF;
        }
        dist[0] = 0;

        while (!st.isEmpty()) {
            int node = st.pop();
            if (dist[node] != INF) {
                for (int i = 0; i < adj.get(node).size(); i++) {
                    int v = adj.get(node).get(i).first;
                    int wt = adj.get(node).get(i).second;
                    if (dist[node] + wt < dist[v]) {
                        dist[v] = dist[node] + wt;
                    }
                }
            }
        }

        // Replace unreachable with -1
        for (int i = 0; i < N; i++) {
            if (dist[i] == INF) dist[i] = -1;
        }

        return dist;
    }
}

// Main class
public class graph {
    public static void main(String[] args) {
        int n = 6, m = 7;
        int[][] edges = {
            {0, 1, 2},
            {0, 4, 1},
            {4, 5, 4},
            {4, 2, 2},
            {1, 2, 3},
            {2, 3, 6},
            {5, 3, 1}
        };

        Solution obj = new Solution();
        int[] res = obj.shortestPath(n, m, edges);

        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}

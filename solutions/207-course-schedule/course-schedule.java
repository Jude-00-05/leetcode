import java.util.*;

class Solution {
    public boolean canFinish(int n, int[][] edges) {
         ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[n];

        // Build graph and calculate indegree
        for (int[] edge : edges) {

            int from = edge[0];
            int to = edge[1];

            graph.get(from).add(to);
            indegree[to]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        // Add nodes with no prerequisites
        for (int i = 0; i < n; i++) {

            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        int[] answer = new int[n];
        int index = 0;

        while (!queue.isEmpty()) {

            int node = queue.poll();

            answer[index++] = node;

            for (int neighbor : graph.get(node)) {

                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        // If not all nodes were processed, a cycle exists
        if (index != n) {
            return false;
        }

        return true;
    }
}
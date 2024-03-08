import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    /** bfs will take an Adjacency List as input and return an array containing the order of nodes traversed via a Breadth First Search.
     *
     * @param graph - an Adjacency List
     * @return - an array containing the order of nodes traversed via a Breadth First Search.
     */
    public static int[] bfs(int[][] graph) {
        int numNodes = graph.length;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        boolean[] visited = new boolean[numNodes];
        visited[0] = true;
        int[] b = new int[numNodes];
        int index = 0;
        b[index++] = 0;

        while (!queue.isEmpty()) {

            int currentNode = queue.poll();
            int[] neighbors = graph[currentNode];

            for (int n : neighbors) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                    b[index++] = n;
                }
            }
        }
        return b;
    }

}
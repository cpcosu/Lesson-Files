import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class ShortestPaths {
    public static int[] dijkstras(int[][] edges, int n, int s) {

        // initialize an adjacency matrix
        int[][] adjMat = new int[n][n];

        // fill matrix with max integer value (represents infinity)
        for (int[] node : adjMat) {
            Arrays.fill(node, Integer.MAX_VALUE);
        }

        // add the given edges to the matrix
        for (int[] ele : edges) {
            adjMat[ele[0]][ele[1]] = ele[2];
        }

        // priority queue for unvisited nodes
        Queue<int[]> unvisited = new PriorityQueue<int[]>(
                Comparator.comparing(pair -> pair[1]));

        // add starting node to unvisited
        unvisited.offer(new int[] { s, 0 });

        // shortest distance for each node
        int[] dis = new int[n];

        // fill with max value (infinity), set starting node to 0
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[s] = 0;

        while (unvisited.size() != 0) {

            // get unvisited node with shortest distance to start
            int current = unvisited.poll()[0];

            // for each node
            for (int i = 0; i < n; i++) {
                // if adjacent with current node
                if (adjMat[current][i] != Integer.MAX_VALUE) {
                    // if the new distance is shorter, update min distance
                    if (adjMat[current][i] + dis[current] < dis[i]) {
                        dis[i] = adjMat[current][i] + dis[current];
                        unvisited.offer(new int[] { i, dis[i] });
                    }
                }

            }
        }

        return dis;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] vals = in.nextLine().split(" ");

        int n = Integer.parseInt(vals[0]), m = Integer.parseInt(vals[1]),
                q = Integer.parseInt(vals[2]), s = Integer.parseInt(vals[3]);

        while (n != 0 || m != 0 || q != 0 || s != 0) {

            int[][] edges = new int[m][3];

            for (int i = 0; i < m; i++) {
                String[] edge = in.nextLine().split(" ");
                edges[i][0] = Integer.parseInt(edge[0]);
                edges[i][1] = Integer.parseInt(edge[1]);
                edges[i][2] = Integer.parseInt(edge[2]);
            }

            int[] distance = dijkstras(edges, n, s);

            for (int j = 0; j < q; j++) {
                int query = in.nextInt();

                if (distance[query] != Integer.MAX_VALUE) {
                    System.out.println(distance[query]);
                } else {
                    System.out.println("Impossible");
                }
            }

            in.nextLine();
            vals = in.nextLine().split(" ");

            n = Integer.parseInt(vals[0]);
            m = Integer.parseInt(vals[1]);
            q = Integer.parseInt(vals[2]);
            s = Integer.parseInt(vals[3]);

        }

    }

}

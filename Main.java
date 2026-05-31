public class Main {

    public static void main(String[] args) {

        int[][] graph = {
                {0,5,2,0},
                {5,0,1,3},
                {2,1,0,7},
                {0,3,7,0}
        };

        Dijkstra dijkstra =
                new Dijkstra();

        dijkstra.dijkstra(graph,0);

        int[][] edges = {
                {0,1,5},
                {0,2,2},
                {2,1,1},
                {1,3,3}
        };

        BellmanFord bf =
                new BellmanFord();

        bf.bellmanFord(4,
                edges,
                0);

        FloydWarshall fw =
                new FloydWarshall();

        fw.floydWarshall(graph);

        int[] passengers =
                {104,102,109,101,105};

        MergeSort.sort(passengers);

        QuickSort.sort(passengers);

        System.out.println(
                "Flight Optimization Completed");
    }
}
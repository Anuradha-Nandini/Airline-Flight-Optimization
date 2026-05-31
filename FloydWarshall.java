public class FloydWarshall {

    public void floydWarshall(int[][] graph) {

        int V = graph.length;

        int[][] dist = new int[V][V];

        for(int i=0;i<V;i++)
            for(int j=0;j<V;j++)
                dist[i][j] = graph[i][j];

        for(int k=0;k<V;k++) {

            for(int i=0;i<V;i++) {

                for(int j=0;j<V;j++) {

                    if(dist[i][k] + dist[k][j]
                            < dist[i][j]) {

                        dist[i][j] =
                                dist[i][k]
                                + dist[k][j];
                    }
                }
            }
        }

        System.out.println(
                "Floyd-Warshall Completed");
    }
}

import java.util.ArrayList;
import java.util.List;


class Edge {
    int dest;
    int weight;

    public Edge(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }
}

public class GraphUsingList {
    List<List<Edge>> adjEdge;
    List<List<Integer>> adjList;

    int vertices;

    public GraphUsingList(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addNode(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void addEdge(int u, int v, int weight) {
//        adjList.get(u).add(new Edge(v, weight));
//        adjList.get(v).add(new Edge(u, weight));  // for undirected graph
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i);
            for (int j : adjList.get(i)) {
                System.out.print("->" + j);
            }
            System.out.println();
        }
    }

    public void printGraph(int node) {
        System.out.println();
            System.out.print(node);
            for (int j : adjList.get(node)) {
                System.out.print("->" + j);
            }
            System.out.println();
    }

    public static void main(String[] args) {
        GraphUsingList g = new GraphUsingList(6);

        g.addNode(0, 1);
        g.addNode(1, 2);
        g.addNode(1, 3);
        g.addNode(3, 4);
        g.addNode(3, 5);
        g.addNode(4, 5);


        g.printGraph();
        g.printGraph(3);
    }
}

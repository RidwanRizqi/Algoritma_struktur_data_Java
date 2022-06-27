import java.util.List;
import java.util.Scanner;

public class Graph_26 {
    int vertex;
    DoubleLinkedList_26[] list;
    public static String jenis;
    private static DataGeneric <String>[] daerah = new DataGeneric[6];

    public Graph_26(int vertex) {
        this.vertex = vertex;
        list = new DoubleLinkedList_26[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new DoubleLinkedList_26();
        }
    }

    public void addEdge(int source, int destination) {
        if (graphType(jenis)) {
            list[source].addFirst(destination);
            list[destination].addFirst(source);
        } else {
            list[source].addFirst(destination);
        }
//        // add edge
//        list[source].addFirst(destination);
//        // add back edge (for undirected)
//        list[destination].addFirst(source);
    }

    public void degree(int source) throws Exception {
        if (graphType(jenis)) {
            System.out.println("degree vertex " + daerah[source].getData() + " : " + list[source].size());
        } else {
            //indegree
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == source) {
                        ++totalIn;
                    }
                }
                // outDegree
                for (k = 0; k < list[source].size(); k++) {
                    list[source].get(k);
                }
                totalOut = k;
            }
            System.out.println("Indegree dari vertex " + daerah[source].getData() + " : " + totalIn);
            System.out.println("Outdegree dari vertex " + daerah[source].getData() + " : " + totalOut);
            System.out.println("degree vertex " + daerah[source].getData() + " : " + (totalIn+totalOut));
        }
//        // degree undirected graph
//        System.out.println("degree vertex " + source + " : " + list[source].size());
//
//        // degree directed graph
//        // inDegree
//        int k, totalIn = 0, totalOut = 0;
//        for (int i = 0; i < vertex; i++) {
//            for (int j = 0; j < list[i].size(); j++) {
//                if (list[i].get(j) == source) {
//                    ++totalIn;
//                }
//            }
//            // outDegree
//            for (k = 0; k < list[source].size(); k++) {
//                list[source].get(k);
//            }
//            totalOut = k;
//        }
//        System.out.println("Indegree dari vertex " + source + " : " + totalIn);
//        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
//        System.out.println("degree vertex " + source + " : " + (totalIn+totalOut));
    }

    public void removeEdge(int source, int destination) throws Exception {
//        for (int i = 0; i < vertex; i++) {
//            if (i == destination) {
//                list[source].remove(destination);
//            }
//        }
        if (graphType(jenis)) {
            list[source].removeRevisi(destination);
            list[destination].removeRevisi(source);
        } else {
            list[source].removeRevisi(destination);
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + daerah[i].getData() + " terhubung dengan : ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(daerah[list[i].get(j)].getData() + " ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean graphType(String jenis) {
        return jenis.equalsIgnoreCase("undirected");
    }

    public static void main(String[] args) throws Exception {
        daerah[0] = new DataGeneric<>("Gresik ");
        daerah[1] = new DataGeneric<>("Bandung");
        daerah[2] = new DataGeneric<>("Yogya  ");
        daerah[3] = new DataGeneric<>("Malang ");
        daerah[4] = new DataGeneric<>("Kediri ");
        daerah[5] = new DataGeneric<>("Jakarta");
//        Graph_26 graph = new Graph_26(6);
        Scanner sc = new Scanner(System.in);
        String source, destination;
        int jumVertex, idxSource = 0, idxDestination = 0;
        System.out.println("Masukkan jenis graph : (directed / undirected)");
        jenis = sc.next();
        System.out.print("Masukkan jumlah vertices : ");
        jumVertex = sc.nextInt();
        Graph_26 graph = new Graph_26(jumVertex);
        System.out.print("Masukkan jumlah edges : ");
        int edges = sc.nextInt();
        System.out.println("Masukkan edges: <source> <destination>");
        for (int i = 0; i < edges; i++) {
            source = sc.next();
            destination = sc.next();
            for (int j = 0; j < jumVertex; j++) {
                if (source.equalsIgnoreCase(daerah[j].getData().trim())) {
                    idxSource = j;
                }
                if (destination.equalsIgnoreCase(daerah[j].getData().trim())) {
                    idxDestination = j;
                }
            }
            graph.addEdge(idxSource, idxDestination);
        }
        graph.printGraph();
//        graph.addEdge(0, 1);
//        graph.addEdge(0, 4);
//        graph.addEdge(1, 2);
//        graph.addEdge(1, 3);
//        graph.addEdge(1, 4);
//        graph.addEdge(2, 3);
//        graph.addEdge(3, 4);
//        graph.addEdge(3, 0);
//        graph.printGraph();
//        graph.degree(2);
//        System.out.println();
//        graph.removeEdge(1, 2);
//        graph.printGraph();
//        System.out.println();
//        graph.removeEdge(1,3);
//        graph.printGraph();
//        graph.removeEdge(4, 0);
//        graph.printGraph();

    }
}
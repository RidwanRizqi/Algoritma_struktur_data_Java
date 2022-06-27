import java.util.Scanner;

public class graphArray_26 {
    private final int vertices;
    private final int [][] twoD_array;
    private static DataGeneric<String>[] daerah = new DataGeneric[5];

    public graphArray_26(int v) {
        vertices = v;
        twoD_array = new int[vertices + 1][vertices + 1];
    }

    public void makeEdge(int to, int from, int edge) {
        try {
            twoD_array[to][from] = edge;
        }
        catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex tidak ada");
        }
    }

    public int getEdge(int to, int from) {
        try {
            return twoD_array[to][from];
        }
        catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex tidak ada");
        }
        return -1;
    }

    public static void main(String[] args) {
        daerah[0] = new DataGeneric<>("Gresik ");
        daerah[1] = new DataGeneric<>("Bandung");
        daerah[2] = new DataGeneric<>("Yogya  ");
        daerah[3] = new DataGeneric<>("Malang ");
        daerah[4] = new DataGeneric<>("Kediri ");
        int v, e, count = 1, indexTo = 0, indexFrom = 0;
        String to, from;
        Scanner sc = new Scanner(System.in);
        graphArray_26 graph;
        try {
            System.out.println("Masukkan jumlah vertices: ");
            v = sc.nextInt();
            System.out.println("Masukkan jumlah edges: ");
            e = sc.nextInt();
            graph = new graphArray_26(v);
            System.out.println("Masukkan edges: <to> <from>");
            while (count <= e) {
                to = sc.next();
                from = sc.next();
                for (int i = 0; i < v; i++) {
                    if (to.equalsIgnoreCase(daerah[i].getData().trim())) {
                        indexTo = i;
                    }
                    if (from.equalsIgnoreCase(daerah[i].getData().trim())) {
                        indexFrom = i;
                    }
                }
                graph.makeEdge(indexTo, indexFrom + 1, 1);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph sbb: ");
            System.out.print("\t\t ");
            for (int i = 0; i < v; i++) {
                System.out.print(daerah[i].getData() + " ");
            }
            System.out.println();

            for (int i = 0; i < v; i++) {
                System.out.print(daerah[i].getData() + " \t");
                for (int j = 1; j <= v; j++) {
                    System.out.print(graph.getEdge(i, j) + " \t\t");
                }
                System.out.println();
            }
        } catch (Exception E) {
            System.out.println("Error. Silakan cek kembali\n" + E.getMessage());
        }
        sc.close();
    }
}
//import java.util.Scanner;
//
//public class graphArray_26<T> {
//    private final int vertices;
//    private final int [][] twoD_array;
//    public graphArray_26(int v) {
//        vertices = v;
//        twoD_array = new int[vertices + 1][vertices + 1];
//    }
//
//    public void makeEdge(int to, int from, int edge) {
//        try {
//            twoD_array[to][from] = edge;
//        }
//        catch (ArrayIndexOutOfBoundsException index) {
//            System.out.println("Vertex tidak ada");
//        }
//    }
//
//    public int getEdge(int to, int from) {
//        try {
//            return twoD_array[to][from];
//        }
//        catch (ArrayIndexOutOfBoundsException index) {
//            System.out.println("Vertex tidak ada");
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int v, e, count = 1, to = 0, from = 0;
//        Scanner sc = new Scanner(System.in);
//        graphArray_26 graph;
//        try {
//            System.out.println("Masukkan jumlah vertices: ");
//            v = sc.nextInt();
//            System.out.println("Masukkan jumlah edges: ");
//            e = sc.nextInt();
//
//            graph = new graphArray_26(v);
//
//            System.out.println("Masukkan edges: <to> <from>");
//            while (count <= e) {
//                to = sc.nextInt();
//                from = sc.nextInt();
//
//                graph.makeEdge(to, from, 1);
//                count++;
//            }
//            System.out.println("Array 2D sebagai representasi graph sbb: ");
//            System.out.print("  ");
//            for (int i = 1; i <= v; i++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//
//            for (int i = 1; i <= v; i++) {
//                System.out.print(i + " ");
//                for (int j = 1; j <= v; j++) {
//                    System.out.print(graph.getEdge(i, j) + " ");
//                }
//                System.out.println();
//            }
//        } catch (Exception E) {
//            System.out.println("Error. Silakan cek kembali\n" + E.getMessage());
//        }
//        sc.close();
//    }
//}

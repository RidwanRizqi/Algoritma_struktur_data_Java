package KuisRidwan;

public class Test {
    public static void main(String[] args) {
        Segitiga ppArray[][] = new Segitiga[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ppArray[i][j] = new Segitiga();
                ppArray[i][j].lebar = i+2;
                ppArray[i][j].panjang= i+3;
            }
        }
        System.out.println("Output Panjang");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ppArray[i][j] = new Segitiga();
                System.out.println(ppArray[i][j].panjang + " ");
            }
            System.out.println();
        }
        System.out.println("Output lebar");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ppArray[i][j] = new Segitiga();
                System.out.println(ppArray[i][j].lebar + " ");
            }
            System.out.println();
        }
    }
}

package minggu3;
import java.util.Scanner;
public class ArrayObjectsRidwan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahPP;
        System.out.print("Masukkan jumlah persegi panjang: ");
        jumlahPP = sc.nextInt();
        PersegiPanjangRidwan[] ppArray = new PersegiPanjangRidwan[jumlahPP];

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjangRidwan();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}

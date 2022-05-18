package minggu5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Masukkan jumlah perusahaan yang akan dihitung : ");
        int jumPerusahaan = sc.nextInt();

        for (int i = 0; i < jumPerusahaan; i++) {
            System.out.println("============================================================");

            System.out.println("Program Menghitung Keuntungan Total (Satuan juta. Misal 5.9)");
            System.out.print("Masukkan jumlah bulan perushaan ke-" + (i+1) + " : ");
            int elm = sc.nextInt();

            Sum sm = new Sum(elm);
            System.out.println("============================================================");
            for (int j = 0; j < sm.elemen; j++) {
                System.out.print("Masukkan keuntungan bulan ke - " + (j + 1) + " = ");
                sm.keuntungan[j] = sc.nextDouble();
            }

            System.out.println("============================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan ke- " + (i+1) + " selama " + sm.elemen + " bulan adalah = " + df.format(sm.totalBF(sm.keuntungan)));
            System.out.println("============================================================");
            System.out.println("Algoritma Devide Conquer");
            System.out.println("Total keuntungan perusahaan ke- " + (i+1) + " selama " + sm.elemen + " bulan adalah = " + df.format(sm.totalDC(sm.keuntungan, 0, sm.elemen - 1)));
        }
    }
}

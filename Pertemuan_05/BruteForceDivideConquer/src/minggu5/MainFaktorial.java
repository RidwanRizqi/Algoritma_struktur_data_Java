package minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        // menghitung waktu eksekusi metode brute force
        long startTimeBF = System.currentTimeMillis();
        System.out.println("===========================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        long endTimeBF = System.currentTimeMillis();
        long waktuEksekusiBF = endTimeBF - startTimeBF;
        System.out.println("Waktu eksekusi metode Brute Force : " + String.valueOf(waktuEksekusiBF) + " milidetik");

        long startTimeDC = System.currentTimeMillis();
        System.out.println("===========================================");
        System.out.println("Hasil Faktorial dengan Devide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("===========================================");
        long endTimeDC = System.currentTimeMillis();
        long waktuEksekusiDC = endTimeDC - startTimeDC;
        System.out.println("Waktu eksekusi metode Brute Force : " + String.valueOf(waktuEksekusiDC) + " milidetik");

    }
}

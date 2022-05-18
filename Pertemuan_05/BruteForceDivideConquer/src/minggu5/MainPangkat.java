package minggu5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        int nilai,pangkat;
        byte menu;

        Pangkat[] png = new Pangkat[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i+1) + " : ");
            nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i+1) + " : ");
            pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("================================");
        System.out.println("|| [1] Metode Brute Force     ||");
        System.out.println("|| [2] Metode Devide Conquer  ||");
        System.out.println("================================");
        System.out.print("Pilih metode yang ingin digunakan (angka 1 atau 2) : ");
        menu = sc.nextByte();

        if (menu == 1) {
            System.out.println("===========================================");
            System.out.println("Hasil Pangkat dengan Brute Force");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
            System.out.println("===========================================");
        } else if (menu == 2){
            System.out.println("===========================================");
            System.out.println("Hasil Pangkat dengan Devide and Conquer");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
            System.out.println("===========================================");
        }
    }
}

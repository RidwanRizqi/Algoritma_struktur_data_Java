package LatihanPraktikumRidwan;

import java.util.Scanner;

public class MainTiketRidwan {
    public static void main(String[] args) {
        System.out.println("Selamat datang kedalam sistem penjualan tiket kami");

        TiketServiceRidwan daftarTiket = new TiketServiceRidwan();
        byte menu;
        Scanner input = new Scanner(System.in);
        TiketRidwan tiket1 = new TiketRidwan("Super Air Jet", 470_000, "Surabaya", "Jakarta");
        TiketRidwan tiket2 = new TiketRidwan("Garuda Indonesia", 980_000, "Surabaya", "Jakarta");
        TiketRidwan tiket3 = new TiketRidwan("Batik Air", 680_000, "Surabaya", "Jakarta");
        TiketRidwan tiket4 = new TiketRidwan("Citilink Indonesia", 900_000, "Surabaya", "Jakarta");
        TiketRidwan tiket5 = new TiketRidwan("Lion", 480_000, "Surabaya", "Jakarta");

        daftarTiket.tambah(tiket1);
        daftarTiket.tambah(tiket2);
        daftarTiket.tambah(tiket3);
        daftarTiket.tambah(tiket4);
        daftarTiket.tambah(tiket5);

        System.out.println("Silahkan pilih filter daftar tiket berdasarkan harga : ");
        System.out.println("[1] termurah");
        System.out.println("[2] termahal");
        System.out.println("==========================================");
        System.out.print("Masukkan pilihan anda : ");
        menu = input.nextByte();
        System.out.println();

        switch (menu) {
            case 1 -> {
                daftarTiket.bubbleSort();
                System.out.println("==== Daftar tiket diurutkan dari termurah ====");
                daftarTiket.tampilAll();
            }
            case 2 -> {
                daftarTiket.selectionSort();
                System.out.println("==== Daftar tiket diurutkan dari termahal ====");
                daftarTiket.tampilAll();
            }
            default -> System.out.println("Inputan salah!");
        }

    }
}

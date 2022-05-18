package UTS;

import java.util.Scanner;
// Nama  : Ridwan Caesar Rizqi K.B
// NIM   : 2141720183
// Kelas : TI-1C
public class BarangMain {
    static Scanner input = new Scanner(System.in);
    static Barang[] listBarang = new Barang[10];
    public static void main(String[] args) {
        System.out.println("Tugas UTS");
        System.out.println("Nama  : Ridwan Caesar Rizqi K.B");
        System.out.println("NIM   : 2141720183");
        System.out.println("Kelas : TI-1C");
        listBarang[0] = new Barang("Topi",101, 4);
        listBarang[1] = new Barang("Baju",102, 6);
        listBarang[2] = new Barang("Celana",103, 2);
        listBarang[3] = new Barang("Pensil",104, 5);
        listBarang[4] = new Barang("Buku",105, 8);
        listBarang[5] = new Barang("Sepatu",106, 9);
        listBarang[6] = new Barang("Tas",107, 5);
        listBarang[7] = new Barang("Dasi",108, 4);
        listBarang[8] = new Barang("Penggaris",109, 6);
        listBarang[9] = new Barang("Spidol",110, 10);
        int i = 1;
        listBarang[i] = new Barang("unti",1,1);
        menu();
    }

    static void menu() {
        System.out.println("========================");
        System.out.println("| [1] Menambah stok    |");
        System.out.println("| [2] Mengurangi stok  |");
        System.out.println("| [3] Menampilkan Data |");
        System.out.println("| [4] Mengurutkan stok |");
        System.out.println("| [5] Mencari data     |");
        System.out.println("========================");

        System.out.print("Masukkan menu : ");
        int menu = input.nextInt();

        String kondisi;
            switch (menu) {
                case 1 -> menambahStok(listBarang);
                case 2 -> mengurangiStok(listBarang);
                case 3 -> tampilSemuaData(listBarang);
                case 4 -> mengurutkanData(listBarang);
                case 5 -> mencariData(listBarang);
            }

            System.out.println("Apakah ada keperluan lain ? (Ya/Tidak)");
            kondisi = input.next();
            if (kondisi.equalsIgnoreCase("Tidak")) {
                System.out.println("Terimakasih atas kunjungannya");
            } else {
                menu();
            }

    }

    static void tampilSemuaData(Barang[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("Nama Barang\t = " + list[i].namaBarang);
            System.out.println("No Barcode\t = " + list[i].noBarcode);
            System.out.println("Stok Barang\t = " + list[i].stok);
            System.out.println("===============================");
        }
    }

    static void menambahStok(Barang[] list) {
        tampilSemuaData(list);
        System.out.print("Masukkan no barcode barang yang ingin ditambah stok : ");
        int kode = input.nextInt();
        System.out.print("Ingin menambah berapa jumlah stok ? ");
        int jumlah = input.nextInt();
        for (int i = 0; i < list.length; i++) {
            if (kode == list[i].noBarcode) {
                list[i].stok += jumlah;
                System.out.println("Data sudah di update");
                list[i].tampilData();
                break;
            } else if (i == list.length -1 && kode != list[i].noBarcode) {
                System.out.println("Barang tidak ditemukan");
            }
        }
    }

    static void mengurangiStok(Barang[] list) {
        tampilSemuaData(list);
        System.out.print("Masukkan no barcode barang yang ingin dikurangi stok : ");
        int kode = input.nextInt();
        System.out.print("Ingin mengurangi berapa jumlah stok ? ");
        int jumlah = input.nextInt();
        for (int i = 0; i < list.length; i++) {
            if (kode == list[i].noBarcode) {
                list[i].stok -= jumlah;
                System.out.println("Data sudah di update");
                list[i].tampilData();
                break;
            } else if (i == list.length -1 && kode != list[i].noBarcode) {
                System.out.println("Barang tidak ditemukan");
            }
        }
    }

    static void mengurutkanData(Barang[] list) {
        System.out.println("Mengurutkan barang berdasarkan stok terbanyak");
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 1; j < list.length - i; j++) {
                if (list[j].stok > list[j - 1].stok) {
                    Barang temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }
        }
        System.out.println("Data sudah diurutkan");
        tampilSemuaData(list);
    }
    static void mencariData(Barang[] list) {
        System.out.print("Masukkan no barcode barang yang ingin dicari : ");
        int cari = input.nextInt();
        for (int i = 0; i < list.length; i++) {
            if (cari == list[i].noBarcode) {
                list[i].tampilData();
                break;
            } else if (i == list.length -1 && cari != list[i].noBarcode) {
                System.out.println("Barang tidak ditemukan");
            }
        }
    }
}

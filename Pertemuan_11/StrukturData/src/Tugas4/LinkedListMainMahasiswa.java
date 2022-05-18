package Tugas4;

import java.util.Scanner;

public class LinkedListMainMahasiswa {
    public static void menu() {
        System.out.println("Masukkan menu yang anda pilih: ");
        System.out.println("| [1] Antrian Baru (Dari Belakang)");
        System.out.println("| [2] Antrian Keluar (Dari Depan)");
        System.out.println("| [3] Cek Semua Antrian");
        System.out.println("| [4] Cek Antrian Terdepan");
        System.out.println("| [5] Cek Antrian Paling Belakang");
        System.out.println("| [6] Mencari Posisi Mahasiswa Pada Antrian");
        System.out.println("| [7] Cek Mahasiswa Pada Antrian Tertentu");
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SingleLinkedListMahasiswa antri = new SingleLinkedListMahasiswa();
        int pilih;
        do {
            menu();
            pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1 -> {
                    System.out.print("NIM\t\t\t : ");
                    String nim = input.nextLine();
                    System.out.print("Nama\t\t : ");
                    String nama = input.nextLine();
                    System.out.print("Absen\t\t : ");
                    int absen = input.nextInt();
                    System.out.print("IPK\t\t\t : ");
                    double ipk = input.nextDouble();
                    input.nextLine();
                    MahasiswaRidwan mhs = new MahasiswaRidwan(nim, nama, absen, ipk);
                    antri.addLast(mhs);
                }
                case 2 -> antri.removeFirst();
                case 3 -> antri.print();
                case 4 -> antri.getDataFirst();
                case 5 -> antri.getDataLast();
                case 6 -> {
                    System.out.print("Masukkan NIM mahasiswa yang anda cari : ");
                    String search = input.next();
                    antri.indexOf(search);
                }
                case 7 -> {
                    System.out.println("Masukkan posisi antrian yang anda cari : ");
                    int nomor = input.nextInt();
                    antri.getData(nomor);
                }
            }
        } while (pilih >= 1 && pilih <= 7);
    }
}

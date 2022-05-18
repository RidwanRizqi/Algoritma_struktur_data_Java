package Tugas;

import java.util.Scanner;

public class QueueMainMahasiswa {
    public static void menu() {
        System.out.println("Masukkan menu yang anda pilih: ");
        System.out.println("| [1] Antrian Baru");
        System.out.println("| [2] Antrian Keluar");
        System.out.println("| [3] Cek Semua Antrian");
        System.out.println("| [4] Cek Antrian Terdepan");
        System.out.println("| [5] Cek Antrian Paling Belakang");
        System.out.println("| [6] Mencari Posisi Mahasiswa Pada Antrian");
        System.out.println("| [7] Cek Mahasiswa Pada Antrian Tertentu");
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah antrian : ");
        int jumlah = input.nextInt();
        QueueMahasiswa antri = new QueueMahasiswa(jumlah);

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
                    antri.enqueue(mhs);
                }
                case 2 -> {
                    MahasiswaRidwan data = antri.dequeue();
                    if (!"".equals(data.nim) && !"".equals(data.nama) && data.absen != 0
                    && data.ipk != 0) {
                        System.out.println("Antrian yang keluar : ");
                        System.out.println("Nim\t\t\t : " + data.nim);
                        System.out.println("Nama\t\t : " + data.nama);
                        System.out.println("Absen\t\t : " + data.absen);
                        System.out.println("IPK\t\t\t : " + data.ipk);
                    }
                }
                case 3 -> antri.print();
                case 4 -> antri.peek();
                case 5 -> antri.peekRear();
                case 6 -> {
                    System.out.print("Masukkan NIM yang anda cari : ");
                    String search = input.next();
                    antri.peekPosition(search);
                }
                case 7 -> {
                    System.out.println("Masukkan posisi antrian yang anda cari : ");
                    int posisi = input.nextInt();
                    antri.printMahasiswa(posisi);
                }
            }
        } while (pilih >= 1 && pilih <= 7);
    }
}

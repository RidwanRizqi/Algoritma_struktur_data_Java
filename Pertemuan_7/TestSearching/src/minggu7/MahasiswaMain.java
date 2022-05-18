package minggu7;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumMhs = s.nextInt();
        PencarianMhsRidwan data = new PencarianMhsRidwan(jumMhs);

        System.out.println("-----------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("-------------------");
            System.out.print("Nim\t\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = sl.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t\t : ");
            double ipk = s.nextDouble();

            MahasiswaRidwan m = new MahasiswaRidwan(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("------------------------------------------------------");
        System.out.println("Data keseluruhan mahasiswa : ");
        data.tampil();

        System.out.println("______________________________________________________");
        System.out.println("______________________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama mahasiswa yang dicari : ");
        System.out.print("NAMA : ");
        String cari = sl.nextLine();
        System.out.println("Menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);

        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
//
//        System.out.println("===============================");
//        System.out.println("menggunakan binary search");
//        data.urutkanData();
//        posisi = data.FindBinarySearch(cari, 0, jumMhs-1);
//        data.TampilPosisi(cari, posisi);
//        data.TampilData(cari, posisi);
    }
}

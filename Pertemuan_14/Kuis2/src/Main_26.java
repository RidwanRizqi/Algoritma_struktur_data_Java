import java.util.Scanner;

public class Main_26 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("===== QUIZ 2 PRAKTIKUM ASD TI - 1C DAN TI - 1F =====");
        System.out.println("dibuat oleh : Ridwan Caesar Rizqi Karisma Biwarni");
        System.out.println("NIM : 2141720183");
        System.out.println("Absen : 26");
        System.out.println("====================================================");
        System.out.println("Sistem Antrian Resto Royal Delish");
        DoubleLinkedList_26 dll = new DoubleLinkedList_26();
        DoubleLinkedListPesanan_26 dllPesanan = new DoubleLinkedListPesanan_26();
        int menu;
        // penambahan data tanpa input data melalui keyboard
        dll.addLast(new Pembeli_26("Ridwan","085131232", 1));
        dll.addLast(new Pembeli_26("Caesar","082142412", 2));
        dll.addLast(new Pembeli_26("Rizqi","0842142142", 3));
        int noAntrian = 1;
        do {
            System.out.println("Menu");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan pesanan by nama");
            System.out.println("5. Hitung total Pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih (1-6):");
            menu = input.nextInt();
            switch (menu) {
                case 1 -> {
                    System.out.println("---------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("---------------");
                    System.out.println("Nomor Antrian : " + (dll.size + 1));
                    System.out.print("Nama Customer : ");
                    String namaCustomer = input.next();
                    input.nextLine();
                    System.out.print("Nomor Hp : ");
                    String noHP = input.nextLine();
                    Pembeli_26 newPembeli = new Pembeli_26(namaCustomer, noHP, (dll.size + 1));
                    dll.addLast(newPembeli);
                }
                case 2 -> {
                    System.out.println("++++++++++++++++");
                    System.out.println("Daftar Antrian Resto Royal Delish");
                    System.out.println("++++++++++++++++");
                    dll.print();
                }
                case 3 -> {
                    dll.removeFirst();
                    System.out.println("------------------");
                    System.out.println("Transaksi input pesanan");
                    System.out.println("------------------");
                    System.out.println("Nomor Pesanan : " + (dllPesanan.size + 1));
                    System.out.print("Pesanan : ");
                    String pesanan = input.next();
                    input.nextLine();
                    System.out.print("Harga : ");
                    int harga = input.nextInt();
                    Pesanan_26 newPesanan = new Pesanan_26((dllPesanan.size + 1),pesanan, harga);
                    dllPesanan.addLast(newPesanan);
                    dllPesanan.print();
                }
                case 4 -> {
                    System.out.println("++++++++++");
                    System.out.println("Daftar Pesanan Masuk Resto Royal Delish");
                    System.out.println("++++++++++");
                    dllPesanan.sortByNama();
                }
                case 5 -> {
                    System.out.println("++++++++++++");
                    System.out.println("Total Pendapatan");
                    System.out.println("++++++++++++");
                    System.out.println("Pendapatan hari ini " + dllPesanan.totalPendapatan());
                }
                case 6 -> {
                    System.exit(0);
                }
            }
        } while (menu >= 1 && menu <= 6);
    }
}

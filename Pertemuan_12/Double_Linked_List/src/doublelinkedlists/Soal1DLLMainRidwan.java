package doublelinkedlists;
import java.util.Scanner;

public class Soal1DLLMainRidwan {
    public static Scanner input = new Scanner(System.in);
    public static Soal1DLLRidwan DLL = new Soal1DLLRidwan();
    public static void main(String[] args) throws Exception {
        int menuInput;
        do {
            Menu();
            menuInput = input.nextInt();
            switch (menuInput) {
                case 1 -> TambahData();
                case 2 -> HapusData();
                case 3 -> TampilData();
                case 4 -> {
                    System.out.println("System akan dimatikan");
                    System.exit(0);
                }
            }
        } while (menuInput > 0 && menuInput < 5);
    }

    public static void Menu() {
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++");
    }

    public static void TambahData() {
        int nomorAntrian;
        String nama;
        System.out.println("------------------------------");
        System.out.println("Masukkan Data Penerima Vaksin");
        System.out.println("------------------------------");
        System.out.println("Nomor Antrian : ");
        nomorAntrian = input.nextInt();
        input.nextLine();
        System.out.println("Nama Penerima : ");
        nama = input.nextLine();
        Soal1DataAntrian newData = new Soal1DataAntrian(nama, nomorAntrian);
        DLL.addLast(newData);
    }

    public static void TampilData() {
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("Daftar Pengantri Vaksin");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("| No.\t| Nama\t|");
        DLL.print();
    }

    public static void HapusData() throws Exception {
        DLL.removeFirst();
        TampilData();
    }
}

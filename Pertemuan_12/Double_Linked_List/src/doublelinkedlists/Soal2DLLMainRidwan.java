package doublelinkedlists;

import java.util.Scanner;

public class Soal2DLLMainRidwan {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int menuInput, urutan;
        int idFilm;
        String judulFilm;
        double rating;
        Soal2DLLRidwan DLL = new Soal2DLLRidwan();
        do {
            menu();
            menuInput = input.nextInt();
            switch (menuInput) {
                case 1 -> {
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.println("ID Film :");
                    idFilm = input.nextInt();
                    input.nextLine();
                    System.out.println("Judul Film : ");
                    judulFilm = input.nextLine();
                    System.out.println("Rating Film : ");
                    rating = input.nextDouble();
                    Soal2DataFilm newData = new Soal2DataFilm(idFilm, judulFilm, rating);
                    DLL.addFirst(newData);
                }
                case 2 -> {
                    System.out.println("Masukkan Data Posisi Akhir");
                    System.out.println("ID Film :");
                    idFilm = input.nextInt();
                    input.nextLine();
                    System.out.println("Judul Film : ");
                    judulFilm = input.nextLine();
                    System.out.println("Rating Film : ");
                    rating = input.nextDouble();
                    Soal2DataFilm newData = new Soal2DataFilm(idFilm, judulFilm, rating);
                    DLL.addLast(newData);
                }
                case 3 -> {
                    System.out.println("Masukkan Data Film");
                    System.out.println("Urutan ke-");
                    System.out.println("ID Film :");
                    idFilm = input.nextInt();
                    input.nextLine();
                    System.out.println("Judul Film : ");
                    judulFilm = input.nextLine();
                    System.out.println("Rating Film : ");
                    rating = input.nextDouble();
                    System.out.println("Data Film ini akan masuk di urutan ke-");
                    urutan = input.nextInt();
                    Soal2DataFilm newData = new Soal2DataFilm(idFilm, judulFilm, rating);
                    DLL.add(newData, urutan - 1);
                }
                case 4 -> {
                    System.out.println("Hapus Data Pertama");
                    DLL.removeFirst();
                }
                case 5 -> {
                    System.out.println("Hapus Data Terakhir");
                    DLL.removeLast();
                }
                case 6 -> {
                    System.out.println("Masukkan index data yang ingin dihapus : ");
                    int index = input.nextInt();
                    DLL.remove(index - 1);
                }
                case 7 -> {
                    System.out.println("Cetak Data");
                    DLL.print();
                }
                case 8 -> {
                    System.out.println("Cari Data");
                    System.out.println("Masukkan ID Film yang dicari ");
                    int ID = input.nextInt();
                    DLL.searchID(ID);
                }
                case 9 -> {
                    DLL.sortDescRating();
                }
                case 10 -> {
                    System.out.println("Program akan ditutup");
                    System.exit(0);
                }
            }
        } while (menuInput > 0 && menuInput < 11);
    }

    public static void menu() {
        System.out.println("===============================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("===============================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("===============================");
    }
}

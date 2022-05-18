package KuisRidwan;

public class BukuRidwan {
    String judulBuku;
    String ISBN;
    String pengarang;
    int stok;

    BukuRidwan(String judulBuku, String ISBN, String pengarang, int stok) {
        this.judulBuku = judulBuku;
        this.ISBN = ISBN;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    void detailBuku() {
        System.out.println("Judul\t\t = " + judulBuku);
        System.out.println("ISBN\t\t = " + ISBN);
        System.out.println("Pengarang\t = " + pengarang);
        System.out.println("Stok \t\t = " + stok);
        System.out.println("====================================");
    }

    void bukuDipinjam(int nomor) {
        System.out.println("Buku ke-" + nomor + " dipinjam");
        stok = stok - 1;
    }

}

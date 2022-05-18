package Tugas;

public class BarangMain {
        public static void main(String[] args) {
            Barang barang1 = new Barang("Roti", 5000, 2);
            barang1.tampil();
            System.out.println();
            Barang barang2 = new Barang("Biskuit", 1000, 110);
            barang2.tampil();
            System.out.println();
            Barang barang3 = new Barang("Susu", 10000, 5);
            barang3.tampil();
        }
}

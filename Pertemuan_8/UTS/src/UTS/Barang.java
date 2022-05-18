package UTS;
// Nama  : Ridwan Caesar Rizqi K.B
// NIM   : 2141720183
// Kelas : TI-1C
public class Barang {
    String namaBarang;
    int noBarcode;
    int stok;

    Barang(String namaBarang, int noBarcode, int stok) {
        this.namaBarang = namaBarang;
        this.noBarcode = noBarcode;
        this.stok = stok;
    }

    public void tampilData() {
        System.out.println("Nama Barang\t = " + namaBarang);
        System.out.println("No Barcode\t = " + noBarcode);
        System.out.println("Stok Barang\t = " + stok);
        System.out.println("===============================");
    }
}

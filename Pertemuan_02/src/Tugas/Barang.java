package Tugas;

public class Barang {
    String nama;
    int hargaSatuan;
    int jumlah;

    Barang(String namaBarang, int hargaSatuanBarang, int jumlahBarang) {
        nama = namaBarang;
        hargaSatuan = hargaSatuanBarang;
        jumlah = jumlahBarang;
    }

    int hitungHargaTotal() {
        return hargaSatuan * jumlah;
    }

    int hitungDiskon(int hargaTotal) {
        float diskon;
        if (hargaTotal > 100_000) {
            diskon = hargaTotal * 0.1f;
        } else if (hargaTotal >= 50_000) {
            diskon = hargaTotal * 0.05f;
        } else {
            diskon = 0;
        }
        return (int) diskon;
    }

    int hitungHargaBayar(int hargaTotal, int diskon) {
        return hargaTotal - diskon;
    }

    void tampil() {
        System.out.println("Barang = " + nama);
        System.out.println("Harga satuan = " + hargaSatuan);
        System.out.println("Jumlah barang = " + jumlah);
        System.out.println("Diskon = Rp." + hitungDiskon(hitungHargaTotal()));
        System.out.println("Total = Rp." + hitungHargaBayar(hitungHargaTotal(), hitungDiskon(hitungHargaTotal())));
    }
}

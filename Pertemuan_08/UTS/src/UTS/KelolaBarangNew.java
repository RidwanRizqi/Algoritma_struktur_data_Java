package UTS;

public class KelolaBarangNew {
    BarangNew[] listBarang = new BarangNew[10];
    int index;

    void tambahData(BarangNew barang) {
        if (index < listBarang.length) {
            listBarang[index] = barang;
            index++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void mengurangiStok() {

    }
}

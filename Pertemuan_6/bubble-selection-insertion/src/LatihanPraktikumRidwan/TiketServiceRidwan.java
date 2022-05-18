package LatihanPraktikumRidwan;

public class TiketServiceRidwan {
    TiketRidwan[] tikets = new TiketRidwan[5];
    int count;

    void tambah(TiketRidwan t) {
        if (count > tikets.length) {
            System.out.println("Jumlah tiket sudah maksimal");
        } else {
            tikets[count] = t;
            count++;
        }
    }

    void tampilAll() {
        int nomor = 1;
        for (TiketRidwan t : tikets) {
            t.tampil(nomor);
            nomor++;
        }
        
    }

    void bubbleSort() {
        for (int i = 0; i < tikets.length - 1; i++) {
            for (int j = 0; j < tikets.length - 1 -i; j++) {
                if (tikets[j].harga > tikets[j + 1].harga) {
                    TiketRidwan tmp = tikets[j];
                    tikets[j] = tikets[j + 1];
                    tikets[j + 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < tikets.length - 1; i++) {
            int indexMax = i;
            for (int j = 1 + i; j < tikets.length; j++) {
                if (tikets[indexMax].harga < tikets[j].harga) {
                    indexMax = j;
                }
            }
            TiketRidwan tmp = tikets[indexMax];
            tikets[indexMax] = tikets[i];
            tikets[i] = tmp;
        }
    }
}

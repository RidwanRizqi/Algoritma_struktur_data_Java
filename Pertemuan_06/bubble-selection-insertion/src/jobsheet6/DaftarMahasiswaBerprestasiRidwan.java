package jobsheet6;

public class DaftarMahasiswaBerprestasiRidwan {
    MahasiswaRidwan listMhs[] = new MahasiswaRidwan[5];
    int idx;

    //setelah ini tuliskan method tambah()
    void tambah(MahasiswaRidwan m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!!!");
        }
    }

    //setelah ini tuliskan method tampil()
    void tampil() {
        for (MahasiswaRidwan m : listMhs) {
            m.tampil();
            System.out.println("---------------------");
        }
    }

    //setelah ini tuliskan method bubbleSort()
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    //di bawah ini proses swap atau penukaran
                    MahasiswaRidwan tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    //setelah ini tuliskan method selectionSort()
    void selectionSort() {
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            // swap
            MahasiswaRidwan tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    //setelah ini tuliskan method insertionSort()
    void insertionSort(boolean asc) {
        for (int i = 1; i < listMhs.length; i++) {
            MahasiswaRidwan temp = listMhs[i];
            int j = i;
            if (asc) {
                while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                    listMhs[j] = listMhs[j-1];
                    j--;
                }
            } else {
                while (j > 0 && listMhs[j -1].ipk < temp.ipk) {
                    listMhs[j] = listMhs[j-1];
                    j--;
                }
            }
            listMhs[j] = temp;
        }
    }


}
package minggu7;

public class PencarianMhsRidwan {
    MahasiswaRidwan[] listMhs;
    int idx;

    PencarianMhsRidwan(int jumlahMhs) {
        this.listMhs = new MahasiswaRidwan[jumlahMhs];
    }
    void tambah(MahasiswaRidwan m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh !! ");
        }
    }

    void tampil() {
        for(MahasiswaRidwan m : listMhs) {
            m.tampil();
            System.out.println("-----------------------");
        }
    }
// modifikasi bagian ini untuk search nama
    public int FindSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nama.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void urutkanData() {
        MahasiswaRidwan temp;
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 0; j < listMhs.length - 1 - i; j++) {
                if (listMhs[j].nim > listMhs[j + 1].nim) {
                    temp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = temp;
                }
            }
        }
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right)/2;
            if (cari == listMhs[mid].nim) {
                return mid;
            } else if (listMhs[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    // modifikasi bagian parameter
    public void TampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data\t : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data\t : " + x + " tidak ditemukan");
        }
    }
    // modifikasi bagian parameter dan variable
    public void TampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + x);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
}

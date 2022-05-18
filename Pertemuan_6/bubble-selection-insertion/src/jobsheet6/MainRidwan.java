package jobsheet6;

public class MainRidwan {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasiRidwan list = new DaftarMahasiswaBerprestasiRidwan();
        MahasiswaRidwan m1 = new MahasiswaRidwan("Nusa", 2017, 25, 3);
        MahasiswaRidwan m2 = new MahasiswaRidwan("Rara", 2012, 19, 4);
        MahasiswaRidwan m3 = new MahasiswaRidwan("Dompu", 2018, 19, 3.5);
        MahasiswaRidwan m4 = new MahasiswaRidwan("Abdul", 2017, 23, 2);
        MahasiswaRidwan m5 = new MahasiswaRidwan("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionSort(true);
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.insertionSort(false);
        list.tampil();
    }
}

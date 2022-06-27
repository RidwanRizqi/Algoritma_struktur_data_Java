import java.util.*;

public class MainTugas2_26 {
    static List<Mahasiswa_26> mahasiswa26s = new ArrayList<>();
    static List<MataKuliah_26> mataKuliah26s = new ArrayList<>();
    static List<Nilai_26> nilai26s = new ArrayList<>();
    public static void main(String[] args) {
        // INPUT DATA MAHASISWA DAN MATA KULIAH
        mahasiswa26s.add(new Mahasiswa_26("20001","Thalhah     ", "021xxx"));
        mahasiswa26s.add(new Mahasiswa_26("20002","Zubair      ", "021xxx"));
        mahasiswa26s.add(new Mahasiswa_26("20003","Abdur-Rahman", "021xxx"));
        mahasiswa26s.add(new Mahasiswa_26("20004","Sa'ad       ", "021xxx"));
        mahasiswa26s.add(new Mahasiswa_26("20005","Sa'id       ", "021xxx"));
        mahasiswa26s.add(new Mahasiswa_26("20006","Ubaidah     ", "021xxx"));
        mataKuliah26s.add(new MataKuliah_26("00001", "Internet of Things                   ", 3));
        mataKuliah26s.add(new MataKuliah_26("00002", "Algoritma dan Struktur Data          ", 2));
        mataKuliah26s.add(new MataKuliah_26("00003", "Algoritma dan Pemrograman            ", 2));
        mataKuliah26s.add(new MataKuliah_26("00004", "Praktikum Algoritma dan Struktur Data", 3));
        mataKuliah26s.add(new MataKuliah_26("00005", "Praktikum Algoritma dan Pemrograman  ", 3));

        Scanner input = new Scanner(System.in);
        int menu;
        do {
            System.out.println("***********************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("***********************************************");
            System.out.println();
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.print("Pilih : ");
            menu = input.nextInt();
            switch (menu) {
                case 1 -> {
                    String nim, kodeNilai, kodeMK;
                    int indexMahasiswa, indexMatakuliah;
                    String nilai;
                    System.out.println("Masukkan data");
                    System.out.print("Kode\t\t : ");
                    kodeNilai = input.next();
                    System.out.print("Nilai\t\t : ");
                    nilai = input.next();
                    tampilMahasiswa();
                    System.out.print("Pilih mahasiswa by nim: ");
                    nim = input.next();
                    indexMahasiswa = Collections.binarySearch(mahasiswa26s,
                            new Mahasiswa_26(nim, null, null), mahasiswa26Comparator);
                    String  newNama = mahasiswa26s.get(indexMahasiswa).nama;
                    tampilMatakuliah();
                    System.out.print("Pilih MK by kode: ");
                    kodeMK = input.next();
                    indexMatakuliah = Collections.binarySearch(mataKuliah26s,
                            new MataKuliah_26(kodeMK, null, 0), mataKuliah26Comparator);
                    String newNamaMK = mataKuliah26s.get(indexMatakuliah).nama;
                    int newSKS = mataKuliah26s.get(indexMatakuliah).sks;
                    Nilai_26 newNilai = new Nilai_26(kodeNilai, nim, newNama, newNamaMK, newSKS, nilai);
                    nilai26s.add(newNilai);
                }
                case 2 -> tampilNilai();
                case 3 -> {
                    String searchNIM;
                    int indexSearch;
                    tampilNilai();
                    System.out.print("Masukkan data mahasiswa [nim] : ");
                    searchNIM = input.next();
                    indexSearch = Collections.binarySearch(nilai26s,
                            new Nilai_26(null, searchNIM, null, null, 0 , null),
                            nilai26Comparator);
                    System.out.println("NIM\t\t\tNama\t\t\tMata Kuliah\t\t\t\t\t\t\tSKS\t\tNilai");
                    System.out.println(nilai26s.get(indexSearch).nim + "\t\t" + nilai26s.get(indexSearch).nama +
                            "\t" + nilai26s.get(indexSearch).mataKuliah + "" + nilai26s.get(indexSearch).sks +
                            "\t\t" + nilai26s.get(indexSearch).nilai);
                }
                case 4 -> {
                    nilai26s.sort(sortNilaiComparator);
                    tampilNilai();
                }
                case 5 -> System.exit(0);
            }
        } while (menu <= 5 && menu >= 0);
    }

    static Comparator<Mahasiswa_26> mahasiswa26Comparator = Comparator.comparing(o -> o.nim);

    static Comparator<Nilai_26> sortNilaiComparator = Comparator.comparing(o -> o.nilai);

    static Comparator<Nilai_26> nilai26Comparator = Comparator.comparing(o -> o.nim);

    static Comparator<MataKuliah_26> mataKuliah26Comparator = Comparator.comparing(o -> o.kode);

    static void tampilMahasiswa() {
        System.out.println();
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("***********************************************");
        System.out.println("NIM\t\t\tNama\t\t\t\t\tTelf");
        mahasiswa26s.forEach(mahasiswa_26 ->
                System.out.println(mahasiswa_26.nim + "\t\t" + mahasiswa_26.nama + "\t\t\t" + mahasiswa_26.telf));
    }

    static void tampilMatakuliah() {
        System.out.println();
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("***********************************************");
        System.out.println("Kode\t\tMata Kuliah\t\t\t\t\t\t\t\tSKS");
        mataKuliah26s.forEach(mataKuliah_26 ->
                System.out.println(mataKuliah_26.kode + "\t\t" + mataKuliah_26.nama + "\t" + mataKuliah_26.sks));
    }

    static void tampilNilai() {
        System.out.println();
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("***********************************************");
        System.out.println("NIM\t\t\tNama\t\t\tMata Kuliah\t\t\t\t\t\t\tSKS\t\tNilai");
        nilai26s.forEach(nilai_26 ->
                System.out.println(nilai_26.nim + "\t\t" + nilai_26.nama + "\t" + nilai_26.mataKuliah
                + "" + nilai_26.sks + "\t\t" + nilai_26.nilai));
    }
}

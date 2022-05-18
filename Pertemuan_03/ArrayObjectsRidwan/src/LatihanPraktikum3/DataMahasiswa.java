package LatihanPraktikum3;

public class DataMahasiswa {
    String nama;
    int NIM;
    char jenisKelamin;
    float IPK;

    DataMahasiswa(String nama, int NIM, char jenisKelamin, float IPK) {
        this.nama = nama;
        this.NIM = NIM;
        this.jenisKelamin = jenisKelamin;
        this.IPK = IPK;
    }

    void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Jenis kelamin : " + jenisKelamin);
        System.out.println("Nilai IPK : " + IPK);
    }
}

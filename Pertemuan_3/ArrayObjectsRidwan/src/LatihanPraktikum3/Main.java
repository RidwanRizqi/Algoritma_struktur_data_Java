package LatihanPraktikum3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int NIM;
        char jenisKelamin;
        float IPK;

        DataMahasiswa[] arrDataMhs = new DataMahasiswa[3];
        for (int i = 0; i < arrDataMhs.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama : ");
            nama = input.nextLine();
            System.out.print("Masukkan NIM : ");
            NIM = input.nextInt();
            System.out.print("Masukkan jenis kelamin : ");
            jenisKelamin = input.next().charAt(0);
            System.out.print("Masukkan IPK : ");
            IPK = input.nextFloat();
            input.nextLine();
            arrDataMhs[i] = new DataMahasiswa(nama, NIM, jenisKelamin, IPK);
        }
        for (int i = 0; i < arrDataMhs.length; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));
            arrDataMhs[i].tampilData();
        }
    }
}

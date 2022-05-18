package tugas;

import java.util.Scanner;

public class PemilihanSuaraRidwan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int elemen;
        String[] kandidat = {"haris", "dian", "rani", "bisma"};
        System.out.println("Nama kandidat : ");
        for (int i = 0; i < kandidat.length; i++) {
            System.out.println(kandidat[i]);
        }
        System.out.println();
        System.out.print("Masukkan jumlah suara yang terkumpul : ");
        elemen = input.nextInt();
        input.nextLine();
        String[] hasilPemilihan = new String[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nama yang di pilih ke-" + (1+i) + " : ");
            hasilPemilihan[i] = input.nextLine();
        }

        System.out.println("Hasil pemilihan suara : ");
        for (int i = 0; i < elemen; i++) {
            System.out.print("[" + hasilPemilihan[i] + "]  ");
        }

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (int i = 0; i < elemen; i++) {
            switch (hasilPemilihan[i]) {
                case "haris" -> count1++;
                case "dian" -> count2++;
                case "rani" -> count3++;
                case "bisma" -> count4++;
                default -> System.out.println("nama kandidat tidak ada");
            }
        }

        int[] hasil = {count1, count2, count3, count4};
        int max = 0;
        int count = 0;
        for (int i = 0; i < hasil.length; i++) {
            if (max < hasil[i]) {
                max = hasil[i];
                count = i;
            }
        }

        System.out.println();
        System.out.println("Kandidat yang menjadi mayoritas : " + kandidat[count] );

    }

}

package KuisRidwan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nomor;
        Scanner input = new Scanner(System.in);
        BukuRidwan[] arrBuku = new BukuRidwan[6];
        arrBuku[0] = new BukuRidwan("Programing Java", "ISBN 121", "Ridwan", 5);
        arrBuku[1] = new BukuRidwan("Programing C++", "ISBN 122", "Caesar", 10);
        arrBuku[2] = new BukuRidwan("Programing Phyton", "ISBN 123", "Rizqi", 15);
        arrBuku[3] = new BukuRidwan("Programing PHP", "ISBN 124", "Karisma", 20);
        arrBuku[4] = new BukuRidwan("Programing HTML", "ISBN 125", "Biwarni", 25);
        arrBuku[5] = new BukuRidwan("Programing JavaScript", "ISBN 126", "Ridwan Rizqi", 30);

        for (int i = 0; i < arrBuku.length; i++) {
            System.out.println("Buku Ke-" + (i+1));
            arrBuku[i].detailBuku();
        }
        System.out.println();
        System.out.print("Masukkan nomor buku yang ingin anda pinjam = ");
        nomor = input.nextInt();
        arrBuku[nomor - 1].bukuDipinjam(nomor);
        System.out.println("Stok setalah dipinjam : ");
        System.out.println();
        arrBuku[nomor - 1].detailBuku();
    }
}

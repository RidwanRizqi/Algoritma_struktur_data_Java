package LatihanPraktikum2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah, panjang, lebar, terbesar = 0, count = 0;
        System.out.print("Jumlah tanah: ");
        jumlah = input.nextInt();
        LuasTanah[] arrTanah = new LuasTanah[jumlah];
        for (int i = 0; i < arrTanah.length; i++) {
            System.out.println("Tanah " + (i+1));
            System.out.print("Panjang : ");
            panjang = input.nextInt();
            System.out.print("Lebar : ");
            lebar = input.nextInt();
            arrTanah[i] = new LuasTanah(panjang, lebar);
        }
        for (int i = 0; i < arrTanah.length; i++) {
            System.out.println("Luas tanah " + (i+1) + ": " + arrTanah[i].hitungLuas());
            if (terbesar < arrTanah[i].hitungLuas()) {
                terbesar = arrTanah[i].hitungLuas();
                count = i;
            }
        }
        System.out.println("Tanah Terluas: Tanah " + (count+1));
    }
}

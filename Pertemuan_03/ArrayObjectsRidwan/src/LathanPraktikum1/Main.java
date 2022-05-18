package LathanPraktikum1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KubusRidwan[] arrKubus = new KubusRidwan[2];
        System.out.println("======== KUBUS ========");
        for (int i = 0; i < 2; i++) {
            System.out.print("Masukkan panjang sisi kubus ke " + i + " : ");
            int sisi = input.nextInt();
            arrKubus[i] = new KubusRidwan(sisi);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Kubus ke-" + i + ", Volume  " + arrKubus[i].hitungVolume() + ", Luas Permukaan : " + arrKubus[i].hitungLuasPermukaan());
        }
        System.out.println();
        BalokRidwan[] arrBalok = new BalokRidwan[2];
        System.out.println("======== BALOK ========");
        for (int i = 0; i < 2; i++) {
            System.out.print("Masukkan panjang balok ke " + i + " : ");
            int panjang = input.nextInt();
            System.out.print("Masukkan lebar balok ke " + i + " : ");
            int lebar = input.nextInt();
            System.out.print("Masukkan tinggi balok ke " + i + " : ");
            int tinggi = input.nextInt();
            arrBalok[i] = new BalokRidwan(panjang, lebar, tinggi);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Balok ke-" + i + ", Volume  " + arrBalok[i].hitungVolume() + ", Luas Permukaan : " + arrBalok[i].hitungLuasPermukaan());
        }
        System.out.println();
        TabungRidwan[] arrTabung = new TabungRidwan[2];
        System.out.println("======== TABUNG ========");
        for (int i = 0; i < 2; i++) {
            System.out.print("Masukkan jari-jari tabung ke " + i + " : ");
            int jari = input.nextInt();
            System.out.print("Masukkan tinggi tabung ke " + i + " : ");
            int tinggi = input.nextInt();
            arrTabung[i] = new TabungRidwan(jari, tinggi);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Tabung ke-" + i + ", Volume  " + arrTabung[i].hitungVolume() + ", Luas Permukaan : " + arrTabung[i].hitungLuasPermukaan());
        }
        System.out.println();
        BolaRidwan[] arrBola = new BolaRidwan[3];
        System.out.println("======== BOLA ========");
        for (int i = 0; i < 2; i++) {
            System.out.print("Masukkan jari-jari bola ke " + i + " : ");
            int jari = input.nextInt();
            arrBola[i] = new BolaRidwan(jari);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Bola ke-" + i + ", Volume  " + arrBola[i].hitungVolume() + ", Luas Permukaan : " + arrBola[i].hitungLuasPermukaan());
        }
    }
}

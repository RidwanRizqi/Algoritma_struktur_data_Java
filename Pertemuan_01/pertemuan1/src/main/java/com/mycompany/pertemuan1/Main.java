/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pertemuan1;

/**
 *
 * @author Ridwan
 */
import java.util.Scanner;
public class Main {
        public static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        String nilaiHuruf;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        nilaiTugas = masukNilai("Tugas") * 20/100;
        nilaiUTS = masukNilai("UTS") * 35/100;
        nilaiUAS = masukNilai("UAS") * 45/100;
        System.out.println("==============================");
        System.out.println("==============================");
        nilaiAkhir = nilaiTugas + nilaiUTS + nilaiUAS;
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        System.out.println("Nilai Huruf : " + nilaiHuruf);

        if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
            System.out.println("==============================");
            System.out.println("Mohon maaf anda belum lulus");
        } else {
            System.out.println("==============================");
            System.out.println("Selamat anda lulus");
        }           
    }
    
    static float masukNilai(String jenis) {
        float nilai;
        while (true) {
            System.out.print("Masukkan Nilai " +  jenis +" : ");
            nilai = input.nextFloat();
            if (nilai > 100 || nilai < 0) {
                System.out.println("Masukkan yang anda masukkan salah !");
            } else {
                break;
            }
        }
        return nilai;
    }
    
}

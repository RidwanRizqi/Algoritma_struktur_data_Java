package Praktikum1;

import java.util.Scanner;

public class StackMainRidwan {
    public static void main(String[] args) {
        StackRidwan stk = new StackRidwan(5);
        Scanner sc = new Scanner(System.in);
        Scanner input= new Scanner(System.in);
        while (true) {
            System.out.println("=======================");
            System.out.println("| [1] push            |");
            System.out.println("| [2] pop             |");
            System.out.println("| [3] peek            |");
            System.out.println("| [4] print           |");
            System.out.println("| [5] clear           |");
            System.out.println("| [6] Harga terendah  |");
            System.out.println("=======================");
            System.out.print("Masukkan angka menu yang anda pilih : ");
            int menu = input.nextInt();
            switch (menu) {
                case 1 -> {
                    char pilih;
                    do {
                        System.out.print("Jenis: ");
                        String jenis = sc.nextLine();
                        System.out.print("Warna: ");
                        String warna = sc.nextLine();
                        System.out.print("Merk: ");
                        String merk = sc.nextLine();
                        System.out.print("Ukuran: ");
                        String ukuran = sc.nextLine();
                        System.out.print("Harga: ");
                        double harga = sc.nextDouble();

                        PakaianRidwan p = new PakaianRidwan(jenis, warna, merk, ukuran, harga);
                        System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n) ? ");
                        pilih = sc.next().charAt(0);
                        sc.nextLine();
                        stk.push(p);
                    } while (pilih == 'y');
                }
                case 2 -> stk.pop();
                case 3 -> stk.peek();
                case 4 -> stk.print();
                case 5 -> stk.clear();
                case 6 -> stk.getMin();
                default -> System.out.println("Masukkan salah");
            }
            System.out.println("apakah ada keperluan lagi? (y/n) ");
            char pilih = sc.next().charAt(0);
            sc.nextLine();
            if (pilih != 'y') {
                break;
            }
        }


//        char pilih;
//        do {
//            System.out.print("Jenis: ");
//            String jenis = sc.nextLine();
//            System.out.print("Warna: ");
//            String warna = sc.nextLine();
//            System.out.print("Merk: ");
//            String merk = sc.nextLine();
//            System.out.print("Ukuran: ");
//            String ukuran = sc.nextLine();
//            System.out.print("Harga: ");
//            double harga = sc.nextDouble();
//
//            PakaianRidwan p = new PakaianRidwan(jenis,warna, merk, ukuran, harga);
//            System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n) ? ");
//            pilih = sc.next().charAt(0);
//            sc.nextLine();
//            stk.push(p);
//        } while (pilih == 'y');
//        stk.print();
//        stk.pop();
//        stk.peek();
//        stk.print();
    }
}

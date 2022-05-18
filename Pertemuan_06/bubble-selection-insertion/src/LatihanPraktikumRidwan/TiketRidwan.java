package LatihanPraktikumRidwan;

public class TiketRidwan {
    String maskapai;
    int harga;
    String asal;
    String tujuan;

    TiketRidwan(String m, int h, String a, String t) {
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }

    void tampil(int nomor) {
        System.out.println("||\t\t\t  Tiket " + nomor + "  \t\t\t  ||");
        System.out.println("--> Maskapai = " + maskapai);
        System.out.println("--> Harga    = Rp." + harga);
        System.out.println("--> Asal     = " + asal);
        System.out.println("--> Tujuan   = " + tujuan);
        System.out.println("====================================");
    }
}

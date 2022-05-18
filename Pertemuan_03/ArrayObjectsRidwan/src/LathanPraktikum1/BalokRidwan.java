package LathanPraktikum1;

public class BalokRidwan {
    int panjang;
    int lebar;
    int tinggi;

    BalokRidwan(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    float hitungVolume() {
        return panjang * lebar * tinggi;
    }

    float hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

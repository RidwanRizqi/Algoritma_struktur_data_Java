package LathanPraktikum1;

public class TabungRidwan {
    int jari;
    int tinggi;

    TabungRidwan(int r, int t) {
        jari = r;
        tinggi = t;
    }

    float hitungVolume() {
        return 3.14f * jari * jari * tinggi;
    }

    float hitungLuasPermukaan() {
        return 2 * 3.14f * jari * (jari + tinggi);
    }
}

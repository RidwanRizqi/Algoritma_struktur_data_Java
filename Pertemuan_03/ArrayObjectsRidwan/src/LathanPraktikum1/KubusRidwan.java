package LathanPraktikum1;

public class KubusRidwan {
    int sisi;

    KubusRidwan(int s) {
        sisi = s;
    }

    float hitungVolume() {
        return sisi * sisi * sisi;
    }

    float hitungLuasPermukaan() {
        return  6 * sisi * sisi;
    }
}

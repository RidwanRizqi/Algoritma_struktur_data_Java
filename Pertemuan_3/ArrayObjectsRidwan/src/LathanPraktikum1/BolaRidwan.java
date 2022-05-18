package LathanPraktikum1;

public class BolaRidwan {
    int jari;

    BolaRidwan(int r) {
        jari = r;
    }

    float hitungVolume() {
        return 4 * 3.14f * jari * jari * jari / 3;
    }

    float hitungLuasPermukaan() {
        return 4 * 3.14f * jari * jari;
    }
}

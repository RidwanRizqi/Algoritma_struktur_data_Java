package LatihanPraktikum2;

public class LuasTanah {
    int panjang;
    int lebar;

    LuasTanah(int p, int l) {
        panjang = p;
        lebar = l;
    }

    int hitungLuas() {
        return panjang * lebar;
    }
}

package ArrayBalok;

public class BalokRidwan {
    public int panjang;
    public int lebar;
    public int tinggi;

    public BalokRidwan() {
        panjang +=1;
    }

    public BalokRidwan(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

package ArrayBalok;

public class Segitiga {
    public int alas;
    public int tinggi;

    Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    double hitungKeliling() {
        double c = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return alas + tinggi + c;
    }
}

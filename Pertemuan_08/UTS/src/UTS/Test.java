package UTS;

public class Test {
    public static void main(String[] args) {
        boolean kondisi;
        int i;
        i = 100;
        do {
            i -= 30;
            kondisi = i < 0;
        } while (!kondisi);
        System.out.println("i - " + i);
    }
}

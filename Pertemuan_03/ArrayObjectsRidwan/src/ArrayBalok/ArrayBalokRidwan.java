package ArrayBalok;

public class ArrayBalokRidwan {
    public static void main(String[] args) {
        BalokRidwan[] blArray = new BalokRidwan[3];
        blArray[0] = new BalokRidwan(100, 30, 12);
        blArray[1] = new BalokRidwan(120, 40, 15);
        blArray[2] = new BalokRidwan(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }

        Segitiga[] sgArray = new Segitiga[4];
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Segitiga ke-" + i + ", Luas : " + sgArray[i].hitungLuas() + ", keliling : " + sgArray[i].hitungKeliling());
        }
    }
}

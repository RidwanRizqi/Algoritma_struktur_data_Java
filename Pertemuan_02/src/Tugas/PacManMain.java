package Tugas;

public class PacManMain {
    public static void main(String[] args) {
        PacMan pac1 = new PacMan(0,0,5,5);
        System.out.println("posisi awal");
        pac1.printPosition();
        pac1.moveRight();
        pac1.moveDown();
        pac1.printPosition();
        pac1.moveLeft();
        pac1.moveUp();
        pac1.printPosition();
        pac1.moveLeft();
        pac1.moveUp();
        pac1.printPosition();

    }
}

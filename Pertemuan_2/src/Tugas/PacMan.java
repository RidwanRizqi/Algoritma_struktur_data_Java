package Tugas;

public class PacMan {
    int x;
    int y;
    int width;
    int height;

    PacMan(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        if (x < width && x > 0) {
            x -= 1;
            System.out.println("Belok kiri");
        } else {
            System.out.println("Tidak bisa Belok kiri");
        }
    }

    void moveRight() {
        if (x < width && x >= 0) {
            x += 1;
            System.out.println("Belok kanan");
        } else {
            System.out.println("Tidak bisa Belok kanan");
        }
    }

    void moveUp() {
        if (y < height && y > 0) {
            y -= 1;
            System.out.println("Naik");
        } else {
            System.out.println("Tidak bisa Naik");
        }
    }

    void moveDown() {
        if (y < height && y >= 0) {
            y += 1;
            System.out.println("Turun");
        } else {
            System.out.println("Tidak bisa Turun");
        }
    }

    void printPosition() {
        System.out.println("======== Position ========");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("==========================");
    }
}

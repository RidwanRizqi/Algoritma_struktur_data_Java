package Praktikum1;

public class StackRidwan {
    int size;
    int top;
    PakaianRidwan data[];

    StackRidwan(int size) {
        this.size = size;
        data = new PakaianRidwan[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(PakaianRidwan pkn) {
        if (!IsFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            PakaianRidwan x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.jenis + " " + x.warna +
                    " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        System.out.println("Elemen teratas: " + data[top].jenis + " " + data[top].warna +
                " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }

    public void print() {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna +
                    " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void getMin() {
        if (IsEmpty()) {
            System.out.println("Stack masih kosong");
        } else {
            double min = data[0].harga;
            int indeks = 0;
            for (int i = 1; i <= top; i++) {
                if (min > data[i].harga) {
                    indeks = i;
                }
            }
            System.out.println("Pakaian dengan harga terendah : ");
            System.out.println("Jenis  = " + data[indeks].jenis);
            System.out.println("Warna  = " + data[indeks].warna);
            System.out.println("Merk   = " + data[indeks].merk);
            System.out.println("Ukuran = " + data[indeks].ukuran);
            System.out.println("Harga  = " + data[indeks].harga);
        }
    }
}

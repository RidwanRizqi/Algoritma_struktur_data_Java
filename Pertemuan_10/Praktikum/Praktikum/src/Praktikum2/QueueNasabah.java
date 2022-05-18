package Praktikum2;

public class QueueNasabah {
    NasabahRidwan[] data;
    int front;
    int rear;
    int size;
    int max;

    public QueueNasabah(int n) {
        max = n;
        data = new NasabahRidwan[max];
        size = 0;
        front = rear = -1;
    }

    public void Enqueue(NasabahRidwan dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(0);
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public NasabahRidwan Dequeue() {
        NasabahRidwan dt = new NasabahRidwan();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(0);
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].norek + " "
            + data[front].nama + " " + data[front].alamat + " " + data[front].umur
            + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            System.out.println("Elemen paling belakang: " + data[rear].norek + " "
                    + data[rear].nama + " " + data[rear].alamat + " " + data[rear].umur
                    + " " + data[rear].saldo);
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].norek + " " + data[i].nama + " "
                        + data[i].alamat + " " + data[i].umur
                        + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " "
                    + data[i].alamat + " " + data[i].umur
                    + data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}

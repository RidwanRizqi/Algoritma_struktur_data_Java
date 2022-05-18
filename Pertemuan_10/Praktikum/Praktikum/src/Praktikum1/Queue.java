package Praktikum1;

public class Queue {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
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
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
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

    public void Enqueue(int dt) {
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

    public int Dequeue() {
        int dt = 0;
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

    public void peekPosition(int data) {
        int indeks = -1;
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            int i = front;
            while (i != rear) {
                if (data == this.data[i]) {
                    indeks = i;
                    System.out.println("Nilai " + data + " ditemukan pada indeks ke " + indeks);
                }
                i = (i + 1) % max;
            }
            if (data == this.data[i]) {
                indeks = i;
                System.out.println("Nilai " + data + " ditemukan pada indeks ke " + indeks);
            }
            if (indeks == -1) {
                System.out.println("Data tidak ditemukan");
            }
        }
    }

    public void peekAt(int posisi) {
        int indeks = -1;
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            int i = front;
            while (i != rear) {
                if (posisi == i) {
                    indeks = i;
                    System.out.println("Nilai pada indeks ke " + posisi + " adalah " + data[indeks]);
                }
                i = (i + 1) % max;
            }
            if (posisi == i) {
                indeks = i;
                System.out.println("Nilai pada indeks ke " + posisi + " adalah " + data[indeks]);
            }
            if (indeks == -1) {
                System.out.println("Data tidak ditemukan");
            }
        }
    }
}

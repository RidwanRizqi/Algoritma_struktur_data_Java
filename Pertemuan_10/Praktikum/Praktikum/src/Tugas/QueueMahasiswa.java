package Tugas;

public class QueueMahasiswa {
    MahasiswaRidwan[] antrian;
    int front;
    int rear;
    int size;
    int max;

    QueueMahasiswa(int n) {
        max = n;
        antrian = new MahasiswaRidwan[max];
        front = rear = -1;
        size = 0;
    }

    boolean IsEmpty() {
        return size == 0;
    }

    boolean IsFull() {
        return size == max;
    }

    void enqueue(MahasiswaRidwan antri) {
        if (IsFull()) {
            System.out.println("Antrian sudah penuh");
            System.exit(0);
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        }
    }

    MahasiswaRidwan dequeue() {
        MahasiswaRidwan data = new MahasiswaRidwan();
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
            System.exit(0);
        } else {
            data = antrian[front];
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
        return data;
    }

    void print() {
        int count = 0;
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                count++;
                System.out.println("Mahasiswa Antrian ke " + count);
                System.out.println("Nim\t\t\t : " + antrian[i].nim);
                System.out.println("Nama\t\t : " + antrian[i].nama);
                System.out.println("Absen\t\t : " + antrian[i].absen);
                System.out.println("IPK\t\t\t : " + antrian[i].ipk);
                System.out.println("==================================");
                i = (i + 1) % max;
            }
            count++;
            System.out.println("Mahasiswa Antrian ke " + count);
            System.out.println("Nim\t\t\t : " + antrian[i].nim);
            System.out.println("Nama\t\t : " + antrian[i].nama);
            System.out.println("Absen\t\t : " + antrian[i].absen);
            System.out.println("IPK\t\t\t : " + antrian[i].ipk);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    void peek() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Antrian paling depan : ");
            System.out.println("Nim\t\t\t : " + antrian[front].nim);
            System.out.println("Nama\t\t : " + antrian[front].nama);
            System.out.println("Absen\t\t : " + antrian[front].absen);
            System.out.println("IPK\t\t\t : " + antrian[front].ipk);
        }
    }

    void peekRear() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Antrian paling belakang : ");
            System.out.println("Nim\t\t\t : " + antrian[rear].nim);
            System.out.println("Nama\t\t : " + antrian[rear].nama);
            System.out.println("Absen\t\t : " + antrian[rear].absen);
            System.out.println("IPK\t\t\t : " + antrian[rear].ipk);
        }
    }

    void peekPosition(String nim) {
        int indeks = -1;
        int count = 1;
        if (IsEmpty()) {
            System.out.println("Antrian Masih Kosong");
        } else {
            int i = front;
            while (i != rear) {
                if (nim.equals(antrian[i].nim)) {
                    indeks = i;
                    count++;
                    System.out.println("Mahasiswa dengan NIM " + nim + " ditemukan pada antrian ke " + count);
                }
                i = (i + 1) % max;
            }
            count++;
            if (nim.equals(antrian[i].nim)) {
                indeks = i;
                System.out.println("Mahasiswa dengan NIM " + nim + " ditemukan pada antrian ke " + count);
            }
            if (indeks == -1) {
                System.out.println("Data tidak ditemukan");
            }
        }
    }

    void printMahasiswa(int posisi) {
        int indeks = -1;
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            int i = front;
            while (i != rear) {
                if (posisi == i) {
                    indeks = i;
                    System.out.println("Mahasiswa pada antrian ke " + posisi + " adalah ");
                    System.out.println("Nim\t\t\t : " + antrian[indeks].nim);
                    System.out.println("Nama\t\t : " + antrian[indeks].nama);
                    System.out.println("Absen\t\t : " + antrian[indeks].absen);
                    System.out.println("IPK\t\t\t : " + antrian[indeks].ipk);
                }
                i = (i + 1) % max;
            }
            if (posisi == i) {
                indeks = i;
                System.out.println("Mahasiswa pada antrian ke " + posisi + " adalah ");
                System.out.println("Nim\t\t\t : " + antrian[indeks].nim);
                System.out.println("Nama\t\t : " + antrian[indeks].nama);
                System.out.println("Absen\t\t : " + antrian[indeks].absen);
                System.out.println("IPK\t\t\t : " + antrian[indeks].ipk);
            }
            if (indeks == -1) {
                System.out.println("Data tidak ditemukan");
            }
        }
    }
}

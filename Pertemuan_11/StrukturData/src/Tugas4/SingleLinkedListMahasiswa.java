package Tugas4;

public class SingleLinkedListMahasiswa {
    NodeRidwanSoal4 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeRidwanSoal4 tmp = head;
            int count = 0;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                count++;
                System.out.println("Mahasiswa Antrian ke " + count);
                System.out.println("Nim\t\t\t : " + tmp.data.nim);
                System.out.println("Nama\t\t : " + tmp.data.nama);
                System.out.println("Absen\t\t : " + tmp.data.absen);
                System.out.println("IPK\t\t\t : " + tmp.data.ipk);
                System.out.println("==================================");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addLast (MahasiswaRidwan input) {
        NodeRidwanSoal4 ndinput = new NodeRidwanSoal4(input, null);
        if (isEmpty()) {
            head = ndinput;
            tail = ndinput;
        } else {
            tail.next = ndinput;
            tail = ndinput;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            System.out.println("Antrian yang keluar :");
            System.out.println("Nim\t\t\t: " + head.data.nim);
            System.out.println("Nama\t\t\t: " + head.data.nama);
            System.out.println("Absen\t\t\t: " + head.data.absen);
            System.out.println("IPK\t\t\t: " + head.data.ipk);
            head = tail = null;
        } else {
            System.out.println("Antrian yang keluar :");
            System.out.println("Nim\t\t\t: " + head.data.nim);
            System.out.println("Nama\t\t: " + head.data.nama);
            System.out.println("Absen\t\t: " + head.data.absen);
            System.out.println("IPK\t\t\t: " + head.data.ipk);
            head = head.next;
        }
    }

    public void getDataFirst() {
        System.out.println("Mahasiswa yang berada di antrian terdepan :");
        System.out.println("Nim\t\t\t : " + head.data.nim);
        System.out.println("Nama\t\t : " + head.data.nama);
        System.out.println("Absen\t\t : " + head.data.absen);
        System.out.println("IPK\t\t\t : " + head.data.ipk);
        System.out.println("==================================");
    }

    public void getDataLast() {
        System.out.println("Mahasiswa yang berada di antrian paling belakang :");
        System.out.println("Nim\t\t\t : " + tail.data.nim);
        System.out.println("Nama\t\t : " + tail.data.nama);
        System.out.println("Absen\t\t : " + tail.data.absen);
        System.out.println("IPK\t\t\t : " + tail.data.ipk);
        System.out.println("==================================");
    }

    public void indexOf(String key) {
        NodeRidwanSoal4 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nim.equals(key)) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            System.out.println("Data tidak ditemukan");
        } else {
            System.out.println("Mahasiswa dengan NIM " + key + " berada" +
                    " pada antrian ke-" + (index + 1));
        }
    }

    public void getData(int index) {
        NodeRidwanSoal4 tmp = head;
        for (int i = 0; i < index - 1; i++) {
            tmp = tmp.next;
        }
        System.out.println("Mahasiswa pada antrian ke - " + index  +
                " adalah :");
        System.out.println("Nim\t\t\t : " + tmp.data.nim);
        System.out.println("Nama\t\t : " + tmp.data.nama);
        System.out.println("Absen\t\t : " + tmp.data.absen);
        System.out.println("IPK\t\t\t : " + tmp.data.ipk);
    }

}

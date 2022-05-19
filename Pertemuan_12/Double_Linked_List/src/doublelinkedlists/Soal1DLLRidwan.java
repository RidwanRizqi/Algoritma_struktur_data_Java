package doublelinkedlists;

public class Soal1DLLRidwan {
    Soal1NodeRidwan head, tail;
    int size;

    Soal1DLLRidwan() {
        head = tail = null;
        size = 0;
    }

    public void addLast(Soal1DataAntrian data) {
        if (head == null) {
            head = tail = new Soal1NodeRidwan(null, data, null);
        } else {
            Soal1NodeRidwan newNode = new Soal1NodeRidwan(tail, data, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void print() {
        if (head == null) {
            System.out.println("Data antrian masih kosong");
        } else {
            Soal1NodeRidwan tmp = head;
            while (tmp != null) {
                System.out.println("| " + tmp.data.nomorAntrian + "\t| " + tmp.data.nama + "\t|");
                tmp = tmp.next;
            }
            System.out.println("Sisa Antrian: " + size);
        }
    }

    public void removeFirst() throws Exception {
        if (head == null) {
            throw new Exception("Antrian sudah kosong, tidak dapat dihapus");
        } else if (size == 1) {
                System.out.println(head.data.nama + " telah selesai divaksinasi.");
                head = tail = null;
                size--;
        } else {
            System.out.println(head.data.nama + " telah selesai divaksinasi.");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
}

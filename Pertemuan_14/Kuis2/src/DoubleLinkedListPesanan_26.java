public class DoubleLinkedListPesanan_26 {
    NodePesanan_26 head;
    int size;

    DoubleLinkedListPesanan_26() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(Pesanan_26 item) {
        if (isEmpty()) {
            head = new NodePesanan_26(null, item, null);
        } else {
            NodePesanan_26 newNode = new NodePesanan_26(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(Pesanan_26 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            NodePesanan_26 current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodePesanan_26 newNode = new NodePesanan_26(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    public void print() {
        if (!isEmpty()) {
            NodePesanan_26 tmp = head;
            System.out.println("No.\t\t|Nama Pesanan\t\t|Harga");
            while (tmp != null) {
                System.out.println("|" + tmp.data.kodePesanan + "\t\t|" + tmp.data.namaPesanan + "\t\t|" + tmp.data.harga);
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void sortByNama() {
        NodePesanan_26 current, index;
        Pesanan_26 tmp;
        if (isEmpty()) {
            System.out.println("Data Linked list kosong");
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.data.namaPesanan.compareTo(index.data.namaPesanan) > 0) {
                        tmp = current.data;
                        current.data = index.data;
                        index.data = tmp;
                    }
                }
            }
        }
        print();
    }

    public int totalPendapatan() {
        int total = 0;
        if (!isEmpty()) {
            NodePesanan_26 tmp = head;
            while (tmp != null) {
                total += tmp.data.harga;
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
        return total;
    }
}

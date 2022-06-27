public class DoubleLinkedList_26 {
    Node_26 head;
    NodePesanan_26 headPesanan;
    int size;

    DoubleLinkedList_26() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Pembeli_26 item) {
        if (isEmpty()) {
            head = new Node_26(null, item, null);
        } else {
            Node_26 newNode = new Node_26(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(Pembeli_26 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node_26 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node_26 newNode = new Node_26(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    public void print() {
        if (!isEmpty()) {
            Node_26 tmp = head;
            System.out.println("No.\t\t|Nama Customer\t\t|No HP");
            while (tmp != null) {
                System.out.println("|" + tmp.data.antrian + "\t\t|" + tmp.data.namaPembeli + "\t\t|" + tmp.data.NoHP);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            System.out.println(head.data.namaPembeli + " telah memesan Menu");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node_26 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

}

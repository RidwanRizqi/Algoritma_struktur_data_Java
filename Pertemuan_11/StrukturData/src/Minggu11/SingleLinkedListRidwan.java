package Minggu11;

public class SingleLinkedListRidwan {
    NodeRidwan head; // posisi awal linked list
    NodeRidwan tail; // posisi akhir linked list

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeRidwan tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input) {
        NodeRidwan ndinput = new NodeRidwan(input, null);
        if (isEmpty()) {
            head = ndinput;
            tail = ndinput;
        } else {
            ndinput.next = head;
            head = ndinput;
        }
    }

    public void addLast (int input) {
        NodeRidwan ndinput = new NodeRidwan(input, null);
        if (isEmpty()) {
            head = ndinput;
        } else {
            tail.next = ndinput;
        }
        tail = ndinput;
    }

    public void insertBefore(int key, int input) {
        NodeRidwan ndinput = new NodeRidwan(input, null);
        NodeRidwan temp = head;
        do {
            if (temp.data == key) {
                ndinput.next = temp;
                head = ndinput;
            }
            else if (temp.next.data == key) {
                ndinput.next = temp.next;
                temp.next = ndinput;
                break;
            }
            temp = temp.next;
        } while (temp.next != null);
    }

    public void insertAfter (int key, int input) {
        NodeRidwan ndinput = new NodeRidwan(input, null);
        NodeRidwan temp = head;
        do {
            if (temp.data == key) {
                ndinput.next = temp.next;
                temp.next = ndinput;
                if (ndinput.next == null) tail = ndinput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeRidwan temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeRidwan(input, temp.next);
            if (temp.next.next == null) tail = temp.next;
        }
    }

    public int getData(int index) {
        NodeRidwan tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int indexOf(int key) {
        NodeRidwan tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus1");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeRidwan temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus1");
        } else {
            NodeRidwan temp = head;
            while (temp != null) {
                if ((temp.data == key) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeRidwan temp = head;
            for (int i = 0;i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}

package Tugas2dan3;

public class SingleLinkedListRidwanSoal2 {
    NodeRidwanSoal2 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            NodeRidwanSoal2 temp = head;
            System.out.println("Isi Linked List:\t");
            while (temp != null) {
                System.out.println(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void addFirst(String input) {
        NodeRidwanSoal2 ndinput = new NodeRidwanSoal2(input, null);
        if (isEmpty()) {
            head = tail = ndinput;
        } else {
            ndinput.next = head;
            head = ndinput;
        }
    }

    public void addLast (String input) {
        NodeRidwanSoal2 ndinput = new NodeRidwanSoal2(input, null);
        if (isEmpty()) {
            head = tail = ndinput;
        } else {
            tail.next = ndinput;
            tail = ndinput;
        }
    }

    public void insertAfter (String key, String input) {
        NodeRidwanSoal2 ndinput = new NodeRidwanSoal2(input, null);
        NodeRidwanSoal2 temp = head;
        do {
            if (temp.data.equals(key)) {
                ndinput.next = temp.next;
                temp.next = ndinput;
                if (ndinput.next == null) tail = ndinput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, String input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeRidwanSoal2 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeRidwanSoal2(input, temp.next);
            if (temp.next.next == null) tail = temp.next;
        }
    }

    public void insertBefore(String  key, String input) {
        NodeRidwanSoal2 ndinput = new NodeRidwanSoal2(input, null);
        NodeRidwanSoal2 temp = head;
        do {
            if (temp.data.equals(key)) {
                ndinput.next = temp;
                head = ndinput;
            }
            else if (temp.next.data.equals(key)) {
                ndinput.next = temp.next;
                temp.next = ndinput;
                break;
            }
            temp = temp.next;
        } while (temp.next != null);
    }
}

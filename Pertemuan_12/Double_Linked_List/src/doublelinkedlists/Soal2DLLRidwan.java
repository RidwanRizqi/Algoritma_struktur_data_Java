package doublelinkedlists;

public class Soal2DLLRidwan {
    Soal2NodeRidwan head;
    int size;

    Soal2DLLRidwan() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Soal2DataFilm data) {
        if (isEmpty()) {
            head = new Soal2NodeRidwan(null, data, null);
        } else {
            Soal2NodeRidwan newNode = new Soal2NodeRidwan(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Soal2DataFilm data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Soal2NodeRidwan current = head;
            while (current.next != null) {
                current = current.next;
            }
            Soal2NodeRidwan newNode = new Soal2NodeRidwan(current, data, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Soal2DataFilm data, int index) throws Exception {
        if (isEmpty()) {
            addFirst(data);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Soal2NodeRidwan current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Soal2NodeRidwan newNode = new Soal2NodeRidwan(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Soal2NodeRidwan newNode = new Soal2NodeRidwan(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            dataFilmdiHapus(head);
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            dataFilmdiHapus(head);
            head = null;
            size--;
            return;
        }
        Soal2NodeRidwan current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        dataFilmdiHapus(current.next);
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Soal2NodeRidwan current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                dataFilmdiHapus(current);
                current.prev.next = null;
            } else if (current.prev == null) {
                dataFilmdiHapus(current);
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                dataFilmdiHapus(current);
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void dataFilmdiHapus(Soal2NodeRidwan data) {
        System.out.println("Data Film yang dihapus : ");
        System.out.println("ID : " + data.data.id);
        System.out.println("\tJudul Film : " + data.data.judul);
        System.out.println("\tipk : " + data.data.rating);
    }

    public void print() {
        if (!isEmpty()) {
            Soal2NodeRidwan tmp = head;
            while (tmp != null) {
                System.out.println("ID: " + tmp.data.id);
                System.out.println("\tJudul Film: " + tmp.data.judul);
                System.out.println("\tipk: " + tmp.data.rating);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void searchID(int id) {
        Soal2NodeRidwan current = head;
        int i = 1;
        while (current != null) {
            if (current.data.id == id) {
                System.out.println("Data ID Film " + id + " berada di node ke- " +i);
                System.out.println("IDENTITAS");
                System.out.println("ID : " + current.data.id);
                System.out.println("\tJudul Film : " + current.data.judul);
                System.out.println("\tIMDB Rating : " + current.data.rating);
                break;
            }
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
        }
    }

    public void sortbyNama() {
        Soal2NodeRidwan current, index;
        Soal2DataFilm tmp;
        if (isEmpty()) {
            System.out.println("Data Linked list kosong");
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.data.rating < index.data.rating) {
                        tmp = current.data;
                        current.data = index.data;
                        index.data = tmp;
                    }
                }
            }
        }
        System.out.println("Data diurutkan berdasarkan Rating tertinggi");
        print();
    }
}

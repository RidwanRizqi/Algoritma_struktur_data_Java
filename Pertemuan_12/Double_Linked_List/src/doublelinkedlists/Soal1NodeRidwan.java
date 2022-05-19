package doublelinkedlists;

public class Soal1NodeRidwan {
    Soal1DataAntrian data;
    Soal1NodeRidwan next, prev;

    Soal1NodeRidwan(Soal1NodeRidwan prev, Soal1DataAntrian data, Soal1NodeRidwan next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

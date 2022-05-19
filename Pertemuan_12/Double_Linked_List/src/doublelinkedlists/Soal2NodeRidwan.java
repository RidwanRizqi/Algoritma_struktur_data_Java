package doublelinkedlists;

public class Soal2NodeRidwan {
    Soal2NodeRidwan prev, next;
    Soal2DataFilm data;

    Soal2NodeRidwan(Soal2NodeRidwan prev, Soal2DataFilm data, Soal2NodeRidwan next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

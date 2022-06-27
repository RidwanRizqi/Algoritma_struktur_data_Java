public class NodePesanan_26 {
    Pesanan_26 data;
    NodePesanan_26 prev, next;

    NodePesanan_26(NodePesanan_26 prev, Pesanan_26 data, NodePesanan_26 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

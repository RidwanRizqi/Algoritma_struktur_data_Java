package doublelinkedlists;

public class NodeRidwan {
    int data;
    NodeRidwan prev, next;

    NodeRidwan(NodeRidwan prev, int data, NodeRidwan next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

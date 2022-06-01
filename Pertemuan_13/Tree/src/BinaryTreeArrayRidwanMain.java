public class BinaryTreeArrayRidwanMain {
    public static void main(String[] args) {
        BinaryTreeArrayRidwan bta = new BinaryTreeArrayRidwan();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);
    }
}

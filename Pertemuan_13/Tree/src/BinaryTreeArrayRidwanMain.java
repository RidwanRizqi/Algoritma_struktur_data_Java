public class BinaryTreeArrayRidwanMain {
    public static void main(String[] args) {
        BinaryTreeArrayRidwan bta = new BinaryTreeArrayRidwan();
//        int[] data = {6,4,8,3,5,7,9,0,0,0};
//        int idxLast = 6;
//        bta.populateData(data, idxLast);
//        bta.traverseInOrder(0);
        bta.add(6);
        bta.add(4);
        bta.add(8);
        bta.add(3);
        bta.add(5);
        bta.add(7);
        bta.add(9);
        System.out.print("InOrder\n");
        bta.traverseInOrder(0);
        System.out.println();
        System.out.print("PreOrder\n");
        bta.traversePreOrder(0);
        System.out.println();
        System.out.print("PostOrder\n");
        bta.traversePostOrder(0);
    }
}

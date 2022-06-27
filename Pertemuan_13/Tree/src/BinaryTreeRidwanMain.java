public class BinaryTreeRidwanMain {
    public static void main(String[] args) {
        BinaryTreeRidwan bt = new BinaryTreeRidwan();

        bt.add(6, bt.root);
        bt.add(4, bt.root);
        bt.add(8, bt.root);
        bt.add(3, bt.root);
        bt.add(5, bt.root);
        bt.add(7, bt.root);
        bt.add(9, bt.root);
        bt.add(10, bt.root);
        bt.add(15, bt.root);

        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find " + bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        int[] minMax = bt.findMinMax();
        if (minMax[0] == Integer.MIN_VALUE || minMax[1] == Integer.MAX_VALUE) {
            System.out.println("Tree kosong");
        } else {
            System.out.println("Nilai minimum pada Tree : " + minMax[0]);
            System.out.println("Nilai maximum pada Tree : " + minMax[1]);
        }
        System.out.println("print data pada leaf");
        bt.printLeaf(bt.root);
        System.out.println();
        System.out.println("Jumlah leaf : " + bt.countLeaf(bt.root));
    }
}

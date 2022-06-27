public class BinaryTreeArrayRidwan {
    int[] data;
    int idxLast = 0;

    public BinaryTreeArrayRidwan() {
        data = new int[10];
    }
    void populateData(int[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2*idxStart+2);
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2*idxStart+1);
            traversePreOrder(2*idxStart+2);
        }
    }
    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2*idxStart+1);
            traversePostOrder(2*idxStart+2);
            System.out.print(data[idxStart] + " ");
        }
    }

    void add(int input) {
        if (data[0] == 0 && data[data.length-1] == 0) {
            data[0] = input;
        } else {
            int current = 0;
            while (true) {
                if (input < data[current]) {
                    if (data[2*current+1] != 0) {
                        current = 2*current+1;
                    } else {
                        data[2*current+1] = input;
                        idxLast++;
                        break;
                    }
                } else if (input > data[current]) {
                    if (data[2*current+2] != 0) {
                        current = 2*current+2;
                    } else {
                        data[2*current+2] = input;
                        idxLast++;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
}

import org.w3c.dom.Node;

public class BinaryTreeRidwan {
    NodeRidwan root;

    public BinaryTreeRidwan() {
        root = null;
    }
    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new NodeRidwan(data);
        } else {
            NodeRidwan current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new NodeRidwan(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new NodeRidwan(data);
                        break;
                    }
                } else { // data sudah ada
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean hasil = false;
        NodeRidwan current = root;
        while (current != null) {
            if (current.data == data) {
                hasil = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }

    void traversePreOrder(NodeRidwan node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(NodeRidwan node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(NodeRidwan node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    NodeRidwan getSuccessor(NodeRidwan del) {
        NodeRidwan successor = del.right;
        NodeRidwan successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        NodeRidwan parent = root;
        NodeRidwan current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        // proses hapus
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            // jika tidak memiliki child
          if (current.left == null && current.right == null) {
              if (current == root) {
                  root = null;
              } else {
                  if (isLeftChild) {
                      parent.left = null;
                  } else {
                      parent.right = null;
                  }
              }
          } else if (current.left == null) { // 1 child right
              if (current == root) {
                  root = current.right;
              } else {
                  if (isLeftChild) {
                      parent.left = current.right;
                  } else {
                      parent.right = current.right;
                  }
              }
          } else if (current.right == null) { // 1 child left
              if (current == root) {
                  root = current.left;
              } else {
                  if (isLeftChild) {
                      parent.left = current.left;
                  } else {
                      parent.right = current.left;
                  }
              }
          } else { // memiliki dua child
              NodeRidwan successor = getSuccessor(current);
              if (current == root) {
                  root = successor;
              } else {
                  if (isLeftChild) {
                      parent.left = successor;
                  } else {
                      parent.right = successor;
                  }
                  successor.left = current.left;
              }
          }
        }
    }
}

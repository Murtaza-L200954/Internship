package Exercise13;

public class BST {
    Node root;

    public BST() {
        root = null;
    }

    public void insert(int number) {
        root = insertRec(root, number);
    }

    private Node insertRec(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        else if (value < current.data) {
            current.left = insertRec(current.left, value);
        }

        else if (value > current.data) {
            current.right = insertRec(current.right, value);
        }

        return current;
    }

    private void inOrderRec(Node current) {
        if (current != null) {
            inOrderRec(current.left);
            System.out.println(current.data + " ");
            inOrderRec(current.right);
        }
    }

    public void inOrderTraversal() {
        inOrderRec(root);
        System.out.println();
    }

    private boolean searchRec(Node current, int number) {
        if (current == null) {
            return false;
        }

        if (number == current.data) {
            return true;
        }

        else if (number < current.data) {
            return searchRec(current.left, number);
        } else if (number > current.data) {
            return searchRec(current.right, number);
        }
    }

    public boolean search(int number) {
        return searchRec(root, number);
    }

}

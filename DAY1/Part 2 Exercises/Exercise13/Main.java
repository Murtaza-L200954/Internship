//exercise 13 + 14 + 15

package Exercise13;

public class Main {

    public static void main(String[] args) {

        BST tree = new BST();

        int reservations[] = { 50, 30, 70, 20, 40, 60, 80 };

        for (int num : reservations) {
            tree.insert(num);
        }

        System.out.println("Reservation numbers in sorted order");
        tree.inOrderTraversal();
    }

}

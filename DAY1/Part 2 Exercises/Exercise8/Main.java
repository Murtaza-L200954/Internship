package Exercise8;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Room> cleaningQueue = new LinkedList<>();

        cleaningQueue.add(new Room(101, "Deluxe", false));
        cleaningQueue.add(new Room(102, "Standard", true));
        cleaningQueue.add(new Room(103, "Suite", false));

        System.out.println("Rooms to be cleaned:");
        for (Room r : cleaningQueue) {
            System.out.println(r);
        }

        System.out.println("\nStarting cleaning process...\n");

        while (!cleaningQueue.isEmpty()) {
            Room current = cleaningQueue.poll();
            System.out.println("Cleaning " + current);
        }

        System.out.println("\nAll rooms have been cleaned!");
    }
}

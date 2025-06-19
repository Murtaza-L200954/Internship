package Exercise10;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Guest> roomDirectory = new HashMap<>();

        roomDirectory.put(101, new Guest("Alice", 28, "G001"));
        roomDirectory.put(102, new Guest("Bob", 35, "G002"));
        roomDirectory.put(103, new Guest("Charlie", 30, "G003"));

        findGuestInRoom(roomDirectory, 102); // Should find Bob
        findGuestInRoom(roomDirectory, 105); // No guest
    }

    public static void findGuestInRoom(HashMap<Integer, Guest> directory, int roomNumber) {
        Guest guest = directory.get(roomNumber);

        if (guest != null) {
            System.out.println("Room " + roomNumber + " is occupied by:");
            guest.displayInfo();
        } else {
            System.out.println("Room " + roomNumber + " is not occupied.");
        }
    }
}

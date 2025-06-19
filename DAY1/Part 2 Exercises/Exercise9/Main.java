package Exercise9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Guest> guestList = new ArrayList<>();

        guestList.add(new Guest("Alice", 28, "G001"));
        guestList.add(new Guest("Bob", 35, "G002"));
        guestList.add(new Guest("Charlie", 30, "G003"));
        guestList.add(new Guest("Diana", 25, "G004"));
        guestList.add(new Guest("Ethan", 40, "G005"));

        guestList.remove(1);

        System.out.println("Remaining guests:");
        for (Guest guest : guestList) {
            guest.displayInfo();
        }
    }
}

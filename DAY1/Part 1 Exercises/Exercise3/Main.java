package Exercise3;

public class Main {
    public static void main(String[] args) {
        Guest newGuest = new Guest("Murtaza", 24);
        Guest newGuest2 = new Guest("Talal", 23);
        Room newRoom = new Room(4, "single", false);
        Room newRoom2 = new Room(5, "suite", false);

        newRoom.assignGuest(newGuest);
        System.out.println();
        newRoom2.assignGuest(newGuest2, 3);
    }

}

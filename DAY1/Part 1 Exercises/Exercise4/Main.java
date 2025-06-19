package Exercise4;

public class Main {
    public static void main(String[] args) {
        Guest newGuest = new Guest("Murtaza", 24);
        Room newRoom = new Room(4, "single", false);

        newGuest.displayDetails();
        System.out.println();

        newRoom.DisplayStatus();
        System.out.println();

        System.out.println("Updating the Guest and Room details");
        System.out.println();

        newGuest.setname("Mustafa");
        newGuest.setage(23);

        newRoom.setNumber(1);
        newRoom.setType("suite");
        newRoom.setOccupancy(true);

        newGuest.displayDetails();
        System.out.println();

        newRoom.DisplayStatus();
        System.out.println();

    }

}

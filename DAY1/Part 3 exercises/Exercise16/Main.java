//exercise 16 + 17 + 18 + 19 
package Exercise16;

public class Main {
    public static void main(String[] args) throws RoomNotAvailableException {
        // this is PROBLEM 16

        Hotel hotel = new Hotel(3);

        hotel.checkIn(new Guest("Talal"));
        hotel.checkIn(new Guest("Murtaza"));
        hotel.checkIn(new Guest("Abdullah"));
        hotel.checkIn(new Guest("Ali"));

        System.out.println("\nCurrent Room Status:");
        hotel.showRoomStatus();
        System.out.println();

        hotel.showWaitlist(); // part of problem 20

        // THIS IS PROBLEM 18

        // Guest g1 = new Guest("Ali");
        // Guest g2 = new Guest("Ali");
        // Guest g3 = new Guest("Zara");

        // System.out.println("g1.equals(g2): " + g1.equals(g2));
        // System.out.println("g1.equals(g3): " + g1.equals(g3));

        // System.out.println("g1.hashCode(): " + g1.hashCode());
        // System.out.println("g2.hashCode(): " + g2.hashCode());
        // System.out.println("g3.hashCode(): " + g3.hashCode());

    }
}
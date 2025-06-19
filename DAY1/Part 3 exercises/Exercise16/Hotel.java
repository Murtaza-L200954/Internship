package Exercise16;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hotel {
    ArrayList<Room> rooms;
    LinkedList<Guest> waitlist;

    public Hotel(int numberOfRooms) {
        rooms = new ArrayList<>();
        waitlist = new LinkedList<>();
        for (int i = 1; i <= numberOfRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    public void checkIn(Guest guest) throws RoomNotAvailableException {

        // first two if statements are part of problem 17

        if (guest == null) {
            System.out.println("Invalid guest. Cannot check in a null guest.");
            return;
        }

        if (rooms == null || rooms.isEmpty()) {
            System.out.println("Hotel is full.");
            return;
        }

        // System.out.println("Attempting to check in " + guest.name);

        for (Room room : rooms) {
            // System.out.println("Checking room " + room.roomNumber);

            if (!room.isOccupied) {
                room.isOccupied = true;
                room.guest = guest;

                System.out.println(guest.name + " has checked into the room number " + room.roomNumber);
                return;
            }

        }
        // throw new RoomNotAvailableException("Hotel is full. " + guest.name + " cannot
        // be checked in.");
        System.out.println("Hotel is full, " + guest.name + " cannot be checked in. ");
        waitlist.add(guest);
    }

    public void showRoomStatus() {
        for (Room room : rooms) {
            System.out.println("Room " + room.roomNumber + " - " +
                    (room.isOccupied ? "Occupied by " + room.guest.name : "Available"));
        }
    }

    public void showWaitlist() {
        System.out.println("\nCurrent Waitlist:");
        if (waitlist.isEmpty()) {
            System.out.println("No guests in waitlist.");
        } else {
            for (Guest g : waitlist) {
                System.out.println("- " + g.name);
            }
        }
    }
}

package Exercise8;

public class Room {
    private int roomNumber;
    private String roomType;
    private boolean isOccupied;

    public Room(int roomNumber, String roomType, boolean isOccupied) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isOccupied = isOccupied;
    }

    public String toString() {
        return "Room " + roomNumber + " (" + roomType + ")";
    }
}

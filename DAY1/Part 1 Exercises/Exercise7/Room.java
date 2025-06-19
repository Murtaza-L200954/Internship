package Exercise7;

public class Room implements Bookable {
    private int roomNumber;
    private String roomType;
    private boolean isOccupied;

    public Room(int num, String type, boolean occupy) {
        this.roomNumber = num;
        this.roomType = type;
        this.isOccupied = occupy;
    }

    @Override
    public boolean isAvailable() {
        return !isOccupied;
    }

    public void displayInfo() {
        System.out.println("Room " + roomNumber + " (" + roomType + ") - Available: " + isAvailable());
    }
}

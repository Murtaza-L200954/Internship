package Exercise16;

public class Room {
    public int roomNumber;
    public boolean isOccupied;
    Guest guest;

    public Room(int number) {
        this.roomNumber = number;
        this.isOccupied = false;
        this.guest = null;
    }

}

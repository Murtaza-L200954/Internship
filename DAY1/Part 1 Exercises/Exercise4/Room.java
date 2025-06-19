package Exercise4;

public class Room {
    private int roomNumber;
    private String roomType;
    private boolean isOccupied;

    public Room(int num, String type, boolean occupy) {
        this.roomNumber = num;
        this.roomType = type;
        this.isOccupied = occupy;
    }

    public void setNumber(int num) {
        this.roomNumber = num;
    }

    public void setType(String type) {
        this.roomType = type;
    }

    public void setOccupancy(boolean flag) {
        this.isOccupied = flag;
    }

    public void DisplayStatus() {
        System.out.println("Room Number : " + roomNumber);
        System.out.println("Room Type : " + roomType);

        if (isOccupied == true) {
            System.out.println("The Room is currently occupied.");
        } else {
            System.out.println("The Room is unoccupied.");
        }
    }

}
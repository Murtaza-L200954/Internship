public class Room {
    public int roomNumber;
    public String roomType;
    public boolean isOccupied;

    public Room(int num, String type, boolean occupy) {
        this.roomNumber = num;
        this.roomType = type;
        this.isOccupied = occupy;
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

    public static void main(String[] args) {
        Room newroom = new Room(7, "suite", false);
        newroom.DisplayStatus();
    }

}
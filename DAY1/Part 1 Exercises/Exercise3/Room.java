package Exercise3;

// Method Overloading: In your Room class, create two assignGuest methods.
// One should just take a Guest object. 
//The other should take a Guest object and an int for the number of nights.

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

    public void assignGuest(Guest obj) {
        System.out.println(" The room number " + this.roomNumber + " has been assigned to " + obj.Name);
        this.isOccupied = true;
    }

    public void assignGuest(Guest obj, int nights) {
        System.out.println(
                "The room number " + this.roomNumber + " has been assigned to " + obj.Name + " for " + nights
                        + " nights");
        this.isOccupied = true;
    }

}
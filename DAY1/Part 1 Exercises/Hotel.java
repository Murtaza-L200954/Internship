//Exercise 2: Hotel Static Properties: Create a Hotel class. 
//Use static variables for hotelName and address. 
//Add a static method to print these details without creating an instance of the class.

public class Hotel {
    static String hotelName = "Pearl Continental Hotel";
    static String address = "123-xyz society,Lahore";

    public static void display() {
        System.out.println(hotelName);
        System.out.println(address);
    }

    public static void main(String[] args) {
        Hotel.display();
    }
}

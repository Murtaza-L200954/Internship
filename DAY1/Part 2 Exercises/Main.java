//Exercise 11

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> amenities = new HashSet<>();

        amenities.add("Free WiFi");
        amenities.add("Swimming Pool");
        amenities.add("Gym");
        amenities.add("Free Parking");
        amenities.add("Breakfast Buffet");
        amenities.add("Gym");
        amenities.add("Free WiFi");
        amenities.add("Spa");

        System.out.println("Hotel Amenities:");
        for (String amenity : amenities) {
            System.out.println("- " + amenity);
        }
    }
}

//Exercise 12

import java.util.Stack;

public class Main1 {

    public static void main(String[] args) {
        Stack<String> luggage = new Stack<>();

        luggage.push("Talal");
        luggage.push("Murtaza");
        luggage.push("Abdullah");

        System.out.println("Top to bottom");
        for (int i = luggage.size() - 1; i >= 0; i--) {
            System.out.println(luggage.get(i));
        }
        System.out.println();

        System.out.println("Popping the top element");
        luggage.pop();
        System.out.println();

        System.out.println("After popping top element");
        for (int i = luggage.size() - 1; i >= 0; i--) {
            System.out.println(luggage.get(i));
        }

    }

}

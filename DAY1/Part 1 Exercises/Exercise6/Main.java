package Exercise6;

public class Main {

    public static void main(String[] args) {
        Person g = new Guest("Usman");
        Person s = new Staff("Ali");

        System.out.println("The person named : " + g.getName() + " is a " + g.getRole());
        System.out.println("The person named : " + s.getName() + " is a " + s.getRole());
    }

}

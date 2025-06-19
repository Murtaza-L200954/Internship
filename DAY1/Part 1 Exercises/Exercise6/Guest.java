package Exercise6;

public class Guest extends Person {
    public Guest(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Guest";
    }
}

package Exercise5;

public class VIPGuest extends Guest {
    public String MembershipLevel;

    public VIPGuest(String name, int age, String level) {
        super(name, age);
        this.MembershipLevel = level;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name : " + this.Name);
        System.out.println("Age: " + this.Age);
        System.out.println("MemberShip Level: " + this.MembershipLevel);
    }

}

package Exercise10;

public class Guest {
    private String name;
    private int age;
    private String id;

    public Guest(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Guest Name: " + name + ", Age: " + age + ", ID: " + id);
    }
}
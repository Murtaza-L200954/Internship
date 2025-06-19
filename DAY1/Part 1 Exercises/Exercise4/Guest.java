package Exercise4;

public class Guest {
    private String Name;
    private int Age;

    public Guest(String name, int age) {
        this.Name = name;
        this.Age = age;
    }

    public void setname(String name) {
        this.Name = name;
    }

    public void setage(int age) {
        this.Age = age;
    }

    public void displayDetails() {
        System.out.println("Name : " + this.Name + " , Age: " + this.Age);
    }
}
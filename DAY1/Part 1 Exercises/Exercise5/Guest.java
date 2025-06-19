package Exercise5;

public class Guest {
    protected String Name;
    protected int Age;

    public Guest(String name, int age) {
        this.Name = name;
        this.Age = age;
    }

    public void displayDetails() {
        System.out.println("Name : " + this.Name + " , Age: " + this.Age);
    }
}

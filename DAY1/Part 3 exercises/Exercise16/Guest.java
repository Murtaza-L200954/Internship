package Exercise16;

public class Guest {
    String name;

    public Guest(String name) {
        this.name = name;
    }

    // overridden functions are part of exercise 18

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Guest other = (Guest) obj;
        return name != null && name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

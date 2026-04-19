import java.util.Objects;

public class Actor extends Person {
    private double height;

    public Actor(String firstName, String lastName, Gender gender, double height) {
        super(firstName, lastName, gender);
        this.height = height;
    }


    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return super.toString() + ", рост " + height + "см";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Actor)) return false;

        Actor other = (Actor) obj;

        return
                getFirstName().equals(other.getFirstName()) &&
                        getLastName().equals(other.getLastName()) &&
                        height == other.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), height);
    }
}

import java.util.Objects;

public class Actor extends Person {
    private double height;

    public Actor (String name, String surname, Gender gender, double height) {
        super (name, surname, gender);
        this.height = height;
    }

    public void printHeight() {
        System.out.println(height);
    }


    @Override
    public String toString() {
        return super.toString() + "height=" + height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Double.compare(height, actor.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(height);
    }
}

public class Actor extends Person {
    double height;

    public Actor (String name, String surname, Gender gender, double height) {
        super (name, surname, gender);
        this.height = height;
    }

    public void printHeight() {
        System.out.println(height);
    }


    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                '}';
    }

}

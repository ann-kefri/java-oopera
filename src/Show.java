import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show (String title, int duration, Director director,ArrayList<Actor> listOfActors){
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        for (Actor actor : this.listOfActors){
            System.out.println(actor.toString());
        }
    }

    public void addNewActor (Actor newActor){
        for (Actor actor : this.listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println("Актер уже участвует в спектакле.");
                return;
            }
        }
        this.listOfActors.add(newActor);
        System.out.println("Актер добавлен.");
    }

    public void replaceActor(Actor newActor, String oldSurname) {
        for (int i = 0; i < this.listOfActors.size(); i++){
            Actor actor = this.listOfActors.get(i);
            if (actor.surname.equals(oldSurname)){
                this.listOfActors.set(i, newActor);
                System.out.println("Актер заменен.");
                return;
            }
        }
        System.out.println("Актёр с такой фамилией отсутствует.");
    }

    public void printDirector() {
         director.toString();
    }

}

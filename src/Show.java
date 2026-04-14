import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show (String title, int duration, Director director,ArrayList<Actor> listOfActors){
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors(ArrayList<Actor> listOfActors) {
        for (Actor actor : listOfActors){
            System.out.println(actor.toString());
        }
    }

    public void addNewActor (ArrayList<Actor> listOfActors, Actor newActor){
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println("Актер уже учавствует в спектакле.");
                return;
            }
        }
        listOfActors.add(newActor);
        System.out.println("Актер добавлен.");
    }

    public void replaceActor(ArrayList<Actor> listOfActors, Actor newActor, String oldSurname) {
        for (int i = 0; i < listOfActors.size(); i++){
            Actor actor = listOfActors.get(i);
            if (actor.surname.equals(oldSurname)){
                listOfActors.set(i, newActor);
                System.out.println("Актер заменен.");
                return;
            }
        }
        System.out.println("Актёр с такой фамилией отсутствует.");
    }

}

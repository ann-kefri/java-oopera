import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Виктор", "Викторенко", Gender.MALE, 185 );
        Actor actor2 = new Actor("Виталий", "Виталенко", Gender.MALE, 186 );
        Actor actor3 = new Actor("Владик", "Владиленко", Gender.MALE, 187 );
        ArrayList<Actor> listOfActors = new ArrayList<>();

        Director director1 = new Director("Ваня", "Ваниненко", Gender.MALE, 10 );
        Director director2 = new Director("Вадим", "Вадименко", Gender.MALE, 11 );

        Person musicAuthor = new Person("Влада", "Владиленко", Gender.FEMALE);
        Person choreographer = new Person("Влас", "Власиленко", Gender.MALE);;

        Show usialShow = new Show("Обычное шоу", 99, director1, listOfActors);
        Opera operaShow = new Opera("Опера", 99, director1, listOfActors, musicAuthor, "Поем", 7);
        Ballet balletShow = new Ballet("Балет", 99, director2, listOfActors, musicAuthor, "Танцуем", choreographer);

        System.out.println("Добавляем актеров в обычное шоу");
        ArrayList<Actor> listOfActorsOfUsialShow = new ArrayList<>();
        usialShow.addNewActor(listOfActorsOfUsialShow, actor1);
        usialShow.addNewActor(listOfActorsOfUsialShow, actor2);

        System.out.println("Добавляем актеров в оперу");
        ArrayList<Actor> listOfActorsOfOpera = new ArrayList<>();
        operaShow.addNewActor(listOfActorsOfOpera, actor2);
        operaShow.addNewActor(listOfActorsOfOpera, actor3);

        System.out.println("Добавляем актеров в балет");
        ArrayList<Actor> listOfActorsOfBallet = new ArrayList<>();
        balletShow.addNewActor(listOfActorsOfBallet, actor1);
        balletShow.addNewActor(listOfActorsOfBallet, actor3);

        System.out.println("Список актеров обычного шоу:");
        usialShow.printActors(listOfActorsOfUsialShow);
        System.out.println("Список актеров оперы:");
        operaShow.printActors(listOfActorsOfOpera);
        System.out.println("Список актеров балета:");
        balletShow.printActors(listOfActorsOfBallet);

        System.out.println("Замена существующего актера в обычном шоу:");
        usialShow.replaceActor(listOfActorsOfUsialShow, actor3, "Викторенко");
        System.out.println("Список актеров обычного шоу после замены:");
        usialShow.printActors(listOfActorsOfUsialShow);

        System.out.println("Замена не существующего актера в обычном шоу:");
        operaShow.replaceActor(listOfActorsOfUsialShow, actor1, "Стратчетенко");

        System.out.println("Текст либретто для оперы: " + operaShow.librettoText);
        System.out.println("Текст либретто для балета: " + balletShow.librettoText);


    }

}

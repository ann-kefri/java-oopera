import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Виктор", "Викторенко", Gender.MALE, 185 );
        Actor actor2 = new Actor("Виталий", "Виталенко", Gender.MALE, 186 );
        Actor actor3 = new Actor("Владик", "Владиленко", Gender.MALE, 187 );

        Director director1 = new Director("Ваня", "Ваниненко", Gender.MALE, 10 );
        Director director2 = new Director("Вадим", "Вадименко", Gender.MALE, 11 );

        Person musicAuthor = new Person("Влада", "Владиленко", Gender.FEMALE);
        Person choreographer = new Person("Влас", "Власиленко", Gender.MALE);;

        Show usualShow = new Show("Обычное шоу", 99, director1, new ArrayList<>());
        Opera operaShow = new Opera("Опера", 99, director1, new ArrayList<>(), musicAuthor, "Поем", 7);
        Ballet balletShow = new Ballet("Балет", 99, director2, new ArrayList<>(), musicAuthor, "Танцуем", choreographer);

        System.out.println("Добавляем актеров в обычное шоу");
        usualShow.addNewActor(actor1);
        usualShow.addNewActor(actor2);

        System.out.println("Добавляем актеров в оперу");
        operaShow.addNewActor(actor2);
        operaShow.addNewActor(actor3);

        System.out.println("Добавляем актеров в балет");
        balletShow.addNewActor(actor1);
        balletShow.addNewActor(actor3);

        System.out.println("Список актеров обычного шоу:");
        usualShow.printActors();
        System.out.println("Список актеров оперы:");
        operaShow.printActors();
        System.out.println("Список актеров балета:");
        balletShow.printActors();

        System.out.println("Замена существующего актера в обычном шоу:");
        usualShow.replaceActor(actor3, "Викторенко");
        System.out.println("Список актеров обычного шоу после замены:");
        usualShow.printActors();

        System.out.println("Замена не существующего актера в обычном шоу:");
        operaShow.replaceActor(actor1, "Стратчетенко");

        System.out.println("Текст либретто для оперы: ");
        operaShow.printLibrettoText();
        System.out.println("Текст либретто для балета: ");
        balletShow.printLibrettoText();


    }

}

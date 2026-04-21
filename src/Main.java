public class Main {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Анна", "Смирнова", Gender.FEMALE, 170.0);
        Actor actor2 = new Actor("Александр", "Иванов", Gender.MALE, 185.0);
        Actor actor3 = new Actor("Мария", "Петрова", Gender.FEMALE, 165.0);

        Director director1 = new Director("Иван", "Петров", Gender.MALE, 10);
        Director director2 = new Director("Сергей", "Васильев", Gender.MALE, 8);

        Person musicAuthor = new Person("Сергей", "Прокофьев", Gender.MALE);
        Person choreographer = new Person("Юрий", "Григорович", Gender.MALE);

        Show show = new Show("Гамлет", 180, director1);
        Opera opera = new Opera("Ромео и Джульетта", 210, director2,
                "Сергей Прокофьев", "Текст либретто оперы", 40);
        Ballet ballet = new Ballet("Щелкунчик", 120, director1,
                "Пётр Чайковский", "Текст либретто балета", "Юрий Григорович");

        show.addActor(actor1);
        show.addActor(actor3);
        opera.addActor(actor2);
        ballet.addActor(actor3);

        show.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();

        show.removeActor(actor3);
        show.addActor(actor2);

        System.out.println("Обновлённый список актёров в спектакле 'Гамлет' после замены: ");
        show.printListOfActors();

        Actor nonExistingActor = new Actor("Виктор", "Соколов", Gender.MALE, 190.0);
        show.replaceActor(new Actor("Новый", "Актёр", Gender.MALE, 180.0), nonExistingActor.getLastName());


        opera.printLibretto();
        System.out.println();
        ballet.printLibretto();
    }
}

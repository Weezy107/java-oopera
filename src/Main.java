public class Main {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Анна", "Смирнова", Gender.ЖЕНСКИЙ, 170.0);
        Actor actor2 = new Actor("Александр", "Иванов", Gender.МУЖСКОЙ, 185.0);
        Actor actor3 = new Actor("Мария", "Петрова", Gender.ЖЕНСКИЙ, 165.0);

        Director director1 = new Director("Иван", "Петров", Gender.МУЖСКОЙ, 10);
        Director director2 = new Director("Сергей", "Васильев", Gender.МУЖСКОЙ, 8);

        Person musicAuthor = new Person("Сергей", "Прокофьев", Gender.МУЖСКОЙ);
        Person choreographer = new Person("Юрий", "Григорович", Gender.МУЖСКОЙ);

        Show show = new Show("Гамлет", 180, director1);
        Opera opera = new Opera("Ромео и Джульетта", 210, director2,
                "Сергей Прокофьев", "Текст либретто оперы", 40);
        Ballet ballet = new Ballet("Щелкунчик", 120, director1,
                "Пётр Чайковский", "Текст либретто балета", "Юрий Григорович");

        show.addActor(actor1);
        show.addActor(actor3);
        opera.addActor(actor2);
        ballet.addActor(actor3);

        System.out.println("Список актёров в спектакле 'Гамлет': " + show.getListOfActors());
        System.out.println("Список актёров в опере 'Ромео и Джульетта': " + opera.getListOfActors());
        System.out.println("Список актёров в балете 'Щелкунчик': " + ballet.getListOfActors());

        show.removeActor(actor3);
        show.addActor(actor2);

        System.out.println("Обновлённый список актёров в спектакле 'Гамлет' после замены: " + show.getListOfActors());

        Actor nonExistingActor = new Actor("Виктор", "Соколов", Gender.МУЖСКОЙ, 190.0);
        if (!show.replaceActor(nonExistingActor, new Actor("Новый", "Актёр", Gender.МУЖСКОЙ, 180.0))) {
            System.out.println("Актёр с фамилией Соколов не найден в списке.");
        }

        opera.printLibretto();
        System.out.println();
        ballet.printLibretto();
    }
}

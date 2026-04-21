import java.util.ArrayList;
import java.util.List;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor.getFirstName() + " "
                    + actor.getLastName() + " уже участвует в спектакле.");
        } else {
            listOfActors.add(actor);
        }
    }

    public boolean removeActor(Actor actor) {
        return listOfActors.remove(actor);
    }

    public void replaceActor(Actor newActor, String previousActorSurname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.getLastName().equals(previousActorSurname)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр успешно заменён.");
                return;
            }
        }
        System.out.println("Актёр с фамилией " + previousActorSurname + " не найден.");
    }


    public void printListOfActors() {
        if (listOfActors.isEmpty()) {
            System.out.println("В спектакле нет актёров.");
            return;
        }

        System.out.println("Список актёров спектакля '" + title + "':");
        for (Actor actor : listOfActors) {
            System.out.println("- " + actor.toString());
        }
    }

    public void printDirector() {
        System.out.println(director.getFirstName() + director.getLastName());
    }


    @Override
    public String toString() {
        String actorsList = "";
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            actorsList += actor.getFirstName() + " " + actor.getLastName();
            if (i < listOfActors.size() - 1) {
                actorsList += ", ";
            }
        }

        return "Спектакль: " + title + "; " +
                "Длительность: " + duration + " минут; " +
                "Режиссёр: " + director + "; " +
                "Список актёров: [" + actorsList + "]";
    }

}

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

    public boolean addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor.getFirstName() + " "
                    + actor.getLastName() + " уже участвует в спектакле.");
            return false;
        } else {
            listOfActors.add(actor);
            return true;
        }
    }

    public boolean removeActor(Actor actor) {
        return listOfActors.remove(actor);
    }

    public boolean replaceActor(Actor oldActor, Actor newActor) {
        int index = listOfActors.indexOf(oldActor);
        if (index != -1) {
            listOfActors.set(index, newActor);
            return true;
        }
        return false;
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

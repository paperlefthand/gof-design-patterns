package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Generator {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer ob) {
        observers.add(ob);
    }

    public void removeObserver(Observer ob) {
        observers.remove(ob);
    }

    public void notifyObservers() {
        observers.stream()
            .forEach((Observer ob) -> ob.update(this));
    }

}

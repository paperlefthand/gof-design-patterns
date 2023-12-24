package pattern.observer.study;

import java.util.ArrayList;
import java.util.List;

public abstract class Generator {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer ob) {
        observers.add(ob);
    }

    public void addObservers(List<Observer> obs) {
        observers.addAll(obs);
    }

    public void removeObserver(Observer ob) {
        observers.remove(ob);
    }

    public void removeAllObservers() {
        observers.clear();
    }

    public void notifyObserver(Observer ob) {
        ob.update(this);
    }

    public void notifyObservers() {
        observers.stream()
                .forEach((Observer ob) -> ob.update(this));
    }

}

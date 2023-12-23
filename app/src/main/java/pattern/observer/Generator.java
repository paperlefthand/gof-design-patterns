package pattern.observer;

import java.util.ArrayList;
import java.util.List;

import pattern.observer.study.Teacher;

public abstract class Generator {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer ob) {
        observers.add(ob);
    }

    public void addObservers(List<Teacher> teachers) {
        observers.addAll(teachers);
    }

    public void removeObserver(Observer ob) {
        observers.remove(ob);
    }

    public void removeAllObservers() {
        observers.clear();
    }

    public void notifyObservers() {
        observers.stream()
                .forEach((Observer ob) -> ob.update(this));
    }

}

package pattern.observer.school;

import java.util.Iterator;
import java.util.Vector;

public abstract class NumberGenerator {
    private Vector observers = new Vector();
    public void addObserver(Observer ob) {
        observers.add(ob);
    }
    public void deleteObserver(Observer ob) {
        observers.remove(ob);
    }
    public void notifyObservers() {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer ob = (Observer)it.next();
            ob.update(this);
        }
    }
    public abstract int getNumber();
    public abstract void execute();

}

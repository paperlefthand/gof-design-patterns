package pattern.observer.school;

public class ObserverSchoolMain {
    public void execute() {
        // observer setting
        // thread ?? notify per 3sec
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        generator.addObserver(observer1);
        generator.execute();
    }
}

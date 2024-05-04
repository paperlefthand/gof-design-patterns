package pattern.observer.digit;

import pattern.observer.Generator;
import pattern.observer.Observer;
// import pattern.observer.study.Student;

public class DigitObserver implements Observer {
    public void update(Generator generator) {
        System.out.println("DigitObserver:");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

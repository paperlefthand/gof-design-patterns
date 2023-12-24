package pattern.observer;

import pattern.observer.study.Generator;
import pattern.observer.study.Observer;
import pattern.observer.study.Student;

public class DigitObserver implements Observer {
    public void update(Generator generator) {
        System.out.println("DigitObserver:"+((Student)generator).getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

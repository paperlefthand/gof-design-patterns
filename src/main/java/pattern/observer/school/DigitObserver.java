package pattern.observer.school;

import pattern.observer.Generator;
import pattern.observer.Observer;

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

package pattern.observer.school;

public class DigitObserver implements Observer {
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:"+generator.getNumber());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

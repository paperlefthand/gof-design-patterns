package pattern.strategy.janken;

public class Main implements Runnable {

    @Override
    public void run() {
        Person alice = new Person("Alice", 18, 150.0f, 45.0f);
        Person bob = new Person("Bob", 20, 170.0f, 60.0f);
        Comparator ac = new BMIComparator();
        System.out.println(ac.compare(alice, bob));
    }
    
}

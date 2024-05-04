package pattern.strategy.human;

public class Main {

    public static void main() {
        Human alice = new Human("Alice", 18, 150.0f, 45.0f);
        Human bob = new Human("Bob", 20, 170.0f, 60.0f);
        Comparator ac = new AgeComparator();
        System.out.println(ac.compare(alice, bob));
    }

}

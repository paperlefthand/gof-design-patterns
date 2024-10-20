package pattern.strategy.health;

public class BMIComparator implements Comparator {

    @Override
    public int compare(Person h1, Person h2) {
        float b1 = h1.getBMI();
        float b2 = h2.getBMI();
        return Float.compare(b1, b2);
    }

}

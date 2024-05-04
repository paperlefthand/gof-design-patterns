package pattern.strategy.health;

public class BMIComparator implements Comparator {

    @Override
    public int compare(Person h1, Person h2) {
        float b1 = h1.getBMI();
        float b2 = h2.getBMI();
        if (b1 > b2) {
            return 1;
        } else if (b1 == b2) {
            return 0;
        } else {
            return -1;
        }
    }

}

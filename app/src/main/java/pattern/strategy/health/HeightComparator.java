package pattern.strategy.health;

public class HeightComparator implements Comparator {
    @Override
    public int compare(Person h1, Person h2) {
        float hei1 = h1.getHeight();
        float hei2 = h2.getHeight();
        if (hei1 > hei2) {
            return 1;
        } else if (hei1 == hei2) {
            return 0;
        } else {
            return -1;
        }
    }
}

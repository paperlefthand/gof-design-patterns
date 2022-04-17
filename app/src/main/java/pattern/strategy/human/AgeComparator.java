package pattern.strategy.human;

public class AgeComparator implements Comparator {

    @Override
    public int compare(Human h1, Human h2) {
        int a1 = h1.getAge();
        int a2 = h2.getAge();
        if (a1 > a2) {
            return 1;
        } else if (a1 == a2) {
            return 0;
        } else {
            return -1;
        }
    }
    
}

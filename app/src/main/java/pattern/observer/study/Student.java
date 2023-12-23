package pattern.observer.study;

import java.util.Random;

import lombok.Getter;

public class Student extends pattern.observer.Generator {

    public Student(String name) {
        this.name = name;
    }

    private Random random = new Random();
    private int mathScore;
    private int englishScore;
    private int phisicsScore;
    @Getter
    private String name;

    public void work() {
        mathScore = random.nextInt(100);
        englishScore = random.nextInt(100);
        phisicsScore = random.nextInt(100);
        notifyObservers();
    };

    public int getScore(Subject subject) {
        switch (subject) {
            case Math:
                return mathScore;
            case English:
                return englishScore;
            case Phisics:
                return phisicsScore;
            default:
                return 0;
        }
    }

}

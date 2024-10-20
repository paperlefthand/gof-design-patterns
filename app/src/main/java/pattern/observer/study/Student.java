package pattern.observer.study;

import java.util.Random;

import lombok.Getter;
import pattern.observer.study.Generator;

public class Student extends pattern.observer.study.Generator {

    public Student(String name) {
        this.name = name;
    }

    private Random random = new Random();
    @Getter
    private int mathScore;
    @Getter
    private int englishScore;
    @Getter
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
            case MATH:
                return mathScore;
            case ENGLISH:
                return englishScore;
            case PHISICS:
                return phisicsScore;
            default:
                return 0;
        }
    }

}

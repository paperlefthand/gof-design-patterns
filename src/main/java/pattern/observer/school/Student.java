package pattern.observer.school;

import java.util.Random;

import pattern.observer.Generator;

public class Student extends Generator {
    public Student(String name) {
        this.name = name;
    }
    private Random random = new Random();
    private int mathScore;
    private int langScore;
    private int sociScore;
    private String name;

    public String getName() {
        return name;
    }

    public int getScore(Subject subject) {
        return mathScore;
    }
    
    public void work() {
        mathScore = random.nextInt(100);
        langScore = random.nextInt(100);
        sociScore = random.nextInt(100);
        notifyObservers();
    }

}

package pattern.observer.study;

import java.util.Random;

import lombok.Getter;

public abstract class Student{

    public Student(String name) {
        this.name = name;
    }

    private Random random = new Random();
    private int mathScore;
    private int englishScore;
    private int phisicsScore;
    @Getter
    private String name;

    abstract void notifyObservers();

}

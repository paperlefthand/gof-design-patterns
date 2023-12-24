package pattern.observer.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main() {

        List<Observer> teachers = new ArrayList<Observer>(Arrays.asList(
                new GraphTeacher(),
                new ScoreTeacher()));

        List<Generator> students = new ArrayList<Generator>(Arrays.asList(
                new Student("StudentA"),
                new Student("StudentB"),
                new Student("StudentC"),
                new Student("StudentD")));

        for (Generator student : students) {
            student.addObservers(teachers);
        }

        for (Generator student : students) {
            ((Student) student).work();
        }
    }

}
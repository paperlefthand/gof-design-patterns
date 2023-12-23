package pattern.observer.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObserverSchoolMain {
    public static void main() {

        List<Teacher> teachers = new ArrayList<Teacher>(Arrays.asList(
                new Teacher("MathTeacher", Subject.Math),
                new Teacher("LangTeacher", Subject.English),
                new Teacher("SociTeacher", Subject.Phisics)));

        // TODO thread ?? notify per 3sec
        List<Student> students = new ArrayList<Student>(Arrays.asList(
                new Student("StudentA"),
                new Student("StudentB"),
                new Student("StudentC"),
                new Student("StudentD")));

        for (Student student : students) {
            student.addObservers((ArrayList<Teacher>) teachers);
        }

        for (Student student : students) {
            student.work();
        }

    }
}

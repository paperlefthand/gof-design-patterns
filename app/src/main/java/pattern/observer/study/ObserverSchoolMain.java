package pattern.observer.study;

public class ObserverSchoolMain {
    public static void execute() {
        // TODO thread ?? notify per 3sec
        Student students[] = {
            new Student("StudentA"),
            new Student("StudentB"),
            new Student("StudentC"),
            new Student("StudentD"),
        };

        Teacher teachers[] =  {
            new Teacher("MathTeacher", Subject.Mathematics),
            new Teacher("LangTeacher", Subject.Language),
            new Teacher("SociTeacher", Subject.Society),
        };

        students[0].addObserver(teachers[0]);
        students[0].addObserver(teachers[1]);
        students[0].work();
    }
}

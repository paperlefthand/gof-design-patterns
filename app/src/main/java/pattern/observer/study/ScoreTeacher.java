package pattern.observer.study;

public class ScoreTeacher implements Observer {

    @Override
    public void update(Generator generator) {
        Student student = (Student) generator;
        for (Subject subject : Subject.values()) {
            int score = student.getScore(subject);
            System.out.println(student.getName() + " " + subject + "***");
        }
    }

}

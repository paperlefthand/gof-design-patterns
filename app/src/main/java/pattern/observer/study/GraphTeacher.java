package pattern.observer.study;

public class GraphTeacher implements Observer {

    @Override
    public void update(Generator generator) {
        Student student = (Student) generator;
        for (Subject subject : Subject.values()) {
            System.out.println(student.getName() + " " + subject + " " + student.getScore(subject));
        }
    }

}

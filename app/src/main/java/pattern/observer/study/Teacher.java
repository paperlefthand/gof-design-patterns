package pattern.observer.study;


import pattern.observer.Generator;
import pattern.observer.Observer;

public class Teacher implements Observer {
    private Subject subject;

    public Teacher(String name, Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(Generator generator) {
        Student student = (Student) generator;
        System.out.println(student.getName() + " " + subject + " " + student.getScore(subject));
    }

}

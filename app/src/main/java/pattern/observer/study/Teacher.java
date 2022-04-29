package pattern.observer.study;

import pattern.observer.Generator;
import pattern.observer.Observer;

public class Teacher implements Observer {
    private String name;
    private Subject subject;

    public Teacher(String n, Subject s) {
        name = n;
        subject = s;
    }
    
    public void update(Generator student) {
        Student s = (Student)student;
        System.out.println(s.getName()+" "+subject+" "+s.getScore(subject));
    }

}

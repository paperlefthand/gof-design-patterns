package pattern;

import pattern.observer.school.ObserverSchoolMain;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose number:");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    ObserverSchoolMain.execute();
                    break;
                case 2:
                    // Command.execute();
                default:
                    break;
            }
            sc.close();

        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        

    }
}
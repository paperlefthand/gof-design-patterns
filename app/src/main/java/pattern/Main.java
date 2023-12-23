package pattern;

import java.util.Scanner;

import pattern.observer.study.ObserverSchoolMain;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose number:");
        System.out.println("1. a");
        System.out.println("2. b");
        System.out.println("3. c");

        try {
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 3) {
                switch (choice) {
                    case 1:
                        ObserverSchoolMain.main();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
            } else {
                System.out.println("Invalid input");
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            scanner.close();
        }

    }
}
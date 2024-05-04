package pattern;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose number:");
        System.out.println("1. Observer Pattern");
        System.out.println("2. Factory Method Pattern");
        System.out.println("3. Strategy Pattern");

        try {
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 3) {
                switch (choice) {
                    case 1:
                        pattern.observer.study.Main.main();
                        break;
                    case 2:
                        pattern.factory_method.idcard.Main.main();
                        break;
                    case 3:
                        pattern.strategy.human.Main.main();
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
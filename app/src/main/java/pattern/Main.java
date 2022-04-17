package pattern;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
// import pattern.observer.school.ObserverSchoolMain;
// import java.util.InputMismatchException;
// import java.util.Scanner;
import javafx.stage.Stage;
import pattern.strategy.human.StrategyHumanMain;


public class Main extends Application {

    @Override
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(l), 640, 480);
        stage.setScene(scene);
        stage.show();

        Runnable shm = new StrategyHumanMain();
        shm.run();

        /*
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
       */
    }

    public static void main(String[] args) {
        launch();
    }

}
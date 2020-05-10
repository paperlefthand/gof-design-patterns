package pattern.command.experiment;

import java.util.ArrayList;
import java.util.List;

public class MakeSaturatedSaltWaterCommand extends Command {

    private List<Command> commands = new ArrayList<>();

    public void execute() {
        for (Command c : commands) {
            c.execute();
        }
        System.out.println("食塩水を作り、それに食塩を1gずつ加えて飽和食塩水を作る実験");
        beaker.note();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }
}

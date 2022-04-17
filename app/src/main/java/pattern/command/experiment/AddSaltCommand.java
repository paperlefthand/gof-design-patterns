package pattern.command.experiment;

public class AddSaltCommand extends Command {
    public void execute() {
        while (beaker.isMelted()) {
            beaker.addSalt(1); //食塩を1g入れる
            beaker.mix(); //かき混ぜる
        }
        System.out.println("食塩を1gずつ加える実験");
        beaker.note();
    }

}

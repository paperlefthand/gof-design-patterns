package pattern.command.experiment;

public class AddWaterCommand extends Command {
    public void execute() {
        while (!beaker.isMelted()) {
            beaker.addWater(10); //水を10g入れる
            beaker.mix(); //かき混ぜる
        }
        System.out.println("水を10gずつ加えて飽和食塩水を作る実験");
        beaker.note();
    }
}

package pattern.builder.saltwater;

public class AddWaterCommand extends Command {
    public void execute() {
        //水を10gずつ加えて飽和食塩水を作る実験をする場合
        //溶け残っている間は水を加える
        while (!beaker.isMelted()) {
            beaker.addWater(10); //水を10g入れる
            beaker.mix(); //かき混ぜる
        }
        //実験結果をノートに記述する
        System.out.println("水を10gずつ加える実験");
        beaker.note();
    }
}

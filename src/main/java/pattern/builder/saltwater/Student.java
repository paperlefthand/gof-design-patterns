package pattern.builder.saltwater;

public class Student {
    public static void main(String[] args) {
        //実験内容(コマンドオブジェクト)を用意する
        Command addSalt = new AddSaltCommand();
        Command makeSaltWater = new MakeSaltWaterCommand();
        MakeSaturatedSaltWaterCommand makeSaturatedSaltWater = new MakeSaturatedSaltWaterCommand();

        Beaker beaker = new Beaker(90,10);

        addSalt.setBeaker(beaker);
        makeSaltWater.setBeaker(beaker);
        makeSaturatedSaltWater.setBeaker(beaker);

        //実験を行う
        makeSaturatedSaltWater.addCommand(makeSaltWater);
        makeSaturatedSaltWater.addCommand(addSalt);
        makeSaturatedSaltWater.execute();

        double salt = makeSaturatedSaltWater.beaker.getSalt();
        double water = makeSaturatedSaltWater.beaker.getWater();

    }
}

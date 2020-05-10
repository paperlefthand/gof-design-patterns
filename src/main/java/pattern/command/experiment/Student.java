package pattern.command.experiment;

public class Student {
    public void experiment() {
        Command addSalt = new AddSaltCommand();
        addSalt.setBeaker(new Beaker(100,0));
        addSalt.execute();

        Command addWater = new AddWaterCommand();
        addWater.setBeaker(new Beaker(0,10));
        addWater.execute();

        Command makeSaltWater = new MakeSaltWaterCommand();
        makeSaltWater.setBeaker(new Beaker(90,10));
        makeSaltWater.execute();

        MakeSaturatedSaltWaterCommand makeSaturatedSaltWater = new MakeSaturatedSaltWaterCommand();
        Beaker beaker = new Beaker(90,10);
        makeSaltWater.setBeaker(beaker); // command1
        addSalt.setBeaker(beaker); // command2
        makeSaturatedSaltWater.setBeaker(beaker);
        makeSaturatedSaltWater.addCommand(makeSaltWater);
        makeSaturatedSaltWater.addCommand(addSalt);
        makeSaturatedSaltWater.execute();

    }
}

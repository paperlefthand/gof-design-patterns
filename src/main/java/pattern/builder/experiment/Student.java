package pattern.builder.experiment;

// Objectの動的生成
// Builder=>構成物,Director=>作り方

public class Student {
    public void experiment() {
        Builder builder = new SaltWaterBuilder();
        Director dir = new Director(builder);
        dir.constract();
        SaltWater saltWater = (SaltWater) builder.getResult();
        System.out.println("食塩水を作る実験");
        System.out.println(String.format("食塩:%.2fg 水:%.2fg", saltWater.salt, saltWater.water));
    }
}

package pattern.builder.experiment;

public class SaltWaterBuilder implements Builder{
    private SaltWater saltWater;
    public SaltWaterBuilder(){
        this.saltWater = new SaltWater(0,0);
    }
    public void addSolute(double saltAmount){
        saltWater.salt += saltAmount;
    }
    public void addSolvent(double waterAmount){
        saltWater.water += waterAmount;
    }
    public void abandonSolution(double saltWaterAmount){
        double saltDelta = saltWaterAmount *
                (saltWater.salt / (saltWater.salt + saltWater.water));
        double waterDelta = saltWaterAmount *
                (saltWater.water / (saltWater.salt + saltWater.water));
        saltWater.salt -= saltDelta;
        saltWater.water -= waterDelta;
    }
    public Object getResult(){
        return this.saltWater;
    }
}

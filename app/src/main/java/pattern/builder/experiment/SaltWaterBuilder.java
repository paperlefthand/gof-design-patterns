package pattern.builder.experiment;

public class SaltWaterBuilder implements Builder {
    private SaltWater saltWater;

    public SaltWaterBuilder() {
        this.saltWater = new SaltWater(0, 0);
    }

    public void addSolute(float saltAmount) {
        saltWater.salt += saltAmount;
    }

    public void addSolvent(float waterAmount) {
        saltWater.water += waterAmount;
    }

    public void abandonSolution(float saltWaterAmount) {
        float saltDelta = saltWaterAmount *
                (saltWater.salt / (saltWater.salt + saltWater.water));
        float waterDelta = saltWaterAmount *
                (saltWater.water / (saltWater.salt + saltWater.water));
        saltWater.salt -= saltDelta;
        saltWater.water -= waterDelta;
    }

    public Object getResult() {
        return this.saltWater;
    }
}

package pattern.command.experiment;

// 実験セット
public class Beaker {
    private double water = 0; //水
    private double salt = 0; //食塩
    private boolean melted = true; //食塩がすべて溶けたときtrue、溶け残ったときfalse

    // 食塩水の溶解度(常温)
    private double solubility = 26.4;

    public Beaker(double water, double salt) {
        this.water = water;
        this.salt = salt;
        this.mix(); //かき混ぜる
    }

    public void addWater(double water) {
        this.water += water;
    }
    public void addSalt(double salt) {
        this.salt += salt;
    }

    public void mix() {
        if((this.salt/(this.salt+this.water))*100 < solubility){
            melted = true;
        }else{
            melted = false;
        }
    }

    public double getSalt() {
        return salt;
    }
    public double getWater() {
        return water;
    }
    public boolean isMelted() {
        return melted;
    }

    public void note() {
        System.out.print("水" + water + "g ");
        System.out.print("食塩" + salt + "g ");
        System.out.println(String.format("濃度%.2f%%", salt/(water+salt)*100));
    }
}

package pattern.builder.saltwater;

public class Beaker {
    private double water = 0; //水
    private double salt = 0; //食塩
    private boolean melted = true; //食塩がすべて溶けたときtrue、溶け残ったときfalse

    //コンストラクタ
    public Beaker(double water, double salt) {
        this.water = water;
        this.salt = salt;
        this.mix();//かき混ぜる
    }

    public void addWater(double water) {
        this.water += water;
    }

    //ビーカーに食塩を入れるメソッド
    public void addSalt(double salt) {
        this.salt += salt;
    }

    // かき混ぜるメソッド
    // meltednに状態を格納
    public void mix() {
        //溶液をかき混ぜる
        //溶けたか溶け残ったかをセットする
        //常温での飽和食塩水の濃度は約26.4%
        if((this.salt / (this.salt+this.water))*100 < 26.4){
            melted = true;
        }else{
            melted = false;
        }
    }
    //食塩の量を返すメソッド
    public double getSalt() {
        return salt;
    }
    //水の量を返すメソッド
    public double getWater() {
        return water;
    }
    //溶けたか溶け残ったか調べるメソッド
    public boolean isMelted() {
        return melted;
    }
    //実験結果をノートに記録する
    public void note() {
        System.out.println("水：" + water + "g");
        System.out.println("食塩：" + salt + "g");
        System.out.println("濃度：" + (salt / (water + salt))*100 + "%");
    }
}

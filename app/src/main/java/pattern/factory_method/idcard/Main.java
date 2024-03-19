package pattern.factory_method.idcard;

public class Main {

    public static void main() {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("alice");
        Product card2 = factory.create("bob");
        Product card3 = factory.create("charlie");
        card1.use();
        card2.use();
        card3.use();
    }

}

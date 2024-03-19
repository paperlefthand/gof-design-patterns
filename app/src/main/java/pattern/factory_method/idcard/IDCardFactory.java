package pattern.factory_method.idcard;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

public class IDCardFactory extends Factory {

    @Getter
    private Map<Integer, String> database = new HashMap<>();
    private int serial = 100;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        database.put(card.getSerial(), card.getOwner());

    }
}

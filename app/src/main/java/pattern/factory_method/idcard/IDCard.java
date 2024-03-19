package pattern.factory_method.idcard;

import lombok.Getter;

public class IDCard extends Product {

    @Getter
    private String owner;
    @Getter
    private int serial;

    IDCard(String owner, int serial) {
        System.out.println(String.format("%sのカード(id=%d)を発行します.", owner, serial));
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println(String.format("%sのカード(id=%d)を使用します.", owner, serial));
    }

}

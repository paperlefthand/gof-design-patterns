package pattern.strategy.janken;

import lombok.Getter;

public enum Hand {
    STONE(0),
    SCISSORS(1),
    PAPER(2);

    @Getter
    private final int value;

    Hand(int value) {
        this.value = value;
    }
    
}

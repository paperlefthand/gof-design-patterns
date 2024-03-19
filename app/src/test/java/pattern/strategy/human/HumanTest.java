package pattern.strategy.human;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class HumanTest {

    @Test
    @DisplayName("A is taller than B")
    void compareHeight() {
        Human a = new Human("A", 20, 170.0f, 58.0f);
        Human b = new Human("B", 21, 168.0f, 60.0f);
        HeightComparator hc = new HeightComparator();
        assertEquals(1, hc.compare(a, b), "A should be taller than B");

        // Main classUnderTest = new Main();
        // assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

}

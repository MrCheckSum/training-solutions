package algorithmsmax.integers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class IntegerMaxCalculatorTest {

    @Test
    public void testMax() {
        List<Integer> integers = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            integers.add(i % 30);
        }
        IntegerMaxCalculator test = new IntegerMaxCalculator();

        Assertions.assertEquals(29, test.max(integers));
    }
}

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftOperandTests {

    @ParameterizedTest
    @CsvSource({"2, 1, One", "2, 2, Two", "2, 3, Three"})
    public void leftOperandWithPattern2(int pattern, int operand, String expected) {
        LeftOperand actual = new LeftOperand(pattern, operand);
        assertEquals(expected, actual.toString());
    }
}

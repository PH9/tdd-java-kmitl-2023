import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RightOperandTests {
    @ParameterizedTest
    @CsvSource({"2, 1, 1", "2, 2, 2", "2, 3, 3"})
    public void rightOperandWithPattern2(int pattern, int operand, String expected) {
        RightOperand actual = new RightOperand(pattern, operand);
        assertEquals(expected, actual.toString());
    }

    @ParameterizedTest
    @CsvSource({"2, 1, One", "2, 2, Two", "2, 3, Three"})
    public void rightOperandWithPattern1(int pattern, int operand, String expected) {
        RightOperand actual = new RightOperand(pattern, operand);
        assertEquals(expected, actual.toString());
    }
}

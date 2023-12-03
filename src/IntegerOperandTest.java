import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class IntegerOperandTest {
    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "3, 3"})
    void integerOperand_toString_shouldReturnNumber(int operand, String expected) {
        IntegerOperand sut = new IntegerOperand(operand);

        assertEquals(expected, sut.toString());
    }
}
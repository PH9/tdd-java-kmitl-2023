import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OperandFactoryTests {
    @Test
    void createLeftOperand_whenPatternIs1_shouldReturnIntegerOperand() {
        Operand operand = OperandFactory.createLeftOperand(1, 1);

        assertTrue(operand instanceof IntegerOperand);
        assertEquals("1", operand.toString());
    }

    @Test
    void createLeftOperand_whenPatternIs2_shouldReturnStringOperand() {
        Operand operand = OperandFactory.createLeftOperand(2, 1);

        assertTrue(operand instanceof StringOperand);
        assertEquals("One", operand.toString());
    }
}

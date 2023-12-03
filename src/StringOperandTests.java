import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringOperandTests {
    @ParameterizedTest
    @CsvSource({"1, One", "2, Two", "3, Three"})
    void stringOperand_toString_shouldReturnText(int operand, String expected){
        StringOperand actual = new StringOperand(operand);

        Assertions.assertEquals(expected, actual.toString());
    }
}

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CaptchaTests {
    @Test
    void TestCaptchaAndItsMinions() {
        Captcha sut = new Captcha(1, 1, 1, 1);

        assertEquals("1", sut.getLeftOperand());
        assertEquals("One", sut.getRightOperand());
        assertEquals("+", sut.getOperator());
        assertEquals("1 + One", sut.toString());
    }

    @Test
    void getLeftOperand_leftOperand_toString_shouldCalledOnce() {
        Captcha sut = new Captcha(1, 1, 1, 1);
        OperandSpy spy = new OperandSpy();
        sut.leftOperand = spy;

        sut.getLeftOperand();

        assertEquals(1, spy.toStringCalledCount);
    }

    private static class OperandSpy implements Operand {
        public int toStringCalledCount;

        @Override
        public String toString() {
            toStringCalledCount += 1;
            return super.toString();
        }
    }
}

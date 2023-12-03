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
}

import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaptchaFactoryTests {
    @Test
    void createCaptcha_shouldCallRandomFourth() {
        SecureRandomSpy spy = new SecureRandomSpy();
        CaptchaFactory sut = new CaptchaFactory(spy);

        sut.createCaptcha();

        assertEquals(4, spy.nextIntWithOriginAndBoundCount);
    }

    private class SecureRandomSpy implements IntegerRandomizer{
        public int nextIntWithOriginAndBoundCount;

        @Override
        public int nextInt(int origin , int bound) {
            nextIntWithOriginAndBoundCount += 1;
            return -1;
        }
    }
}

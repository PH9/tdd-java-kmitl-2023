import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaptchaFactoryTests {
    @Test
    void createCaptcha_shouldCallRandomFourth() {
        SecureRandomSpy spy = new SecureRandomSpy();
        CaptchaFactory sut = new CaptchaFactory(spy);

        sut.createCaptcha();

        assertEquals(4, spy.nextIntWithOriginAndBoundCount);

        assertEquals(new ArrayList<>(Arrays.asList(1, 1, 1, 1)), spy.nextIntOriginParams);
        assertEquals(new ArrayList<>(Arrays.asList(3, 10, 4, 10)), spy.nextIntBoundParams);
    }

    private static class SecureRandomSpy implements IntegerRandomizer{
        public int nextIntWithOriginAndBoundCount;
        public ArrayList<Integer> nextIntOriginParams = new ArrayList<>();
        public ArrayList<Integer> nextIntBoundParams = new ArrayList<>();

        @Override
        public int nextInt(int origin , int bound) {
            nextIntWithOriginAndBoundCount += 1;
            nextIntOriginParams.add(origin);
            nextIntBoundParams.add(bound);
            return -1;
        }
    }
}

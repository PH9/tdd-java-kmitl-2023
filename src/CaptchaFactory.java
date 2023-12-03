public class CaptchaFactory {

    private final IntegerRandomizer spy;

    public CaptchaFactory(IntegerRandomizer spy) {
        this.spy = spy;
    }

    public Captcha createCaptcha() {
        return new Captcha(spy.nextInt(1,3), spy.nextInt(1,10), spy.nextInt(1,4), spy.nextInt(1,10));
    }
}

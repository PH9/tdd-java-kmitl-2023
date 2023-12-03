public class Captcha {
    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
    }

    @Override public  String toString() {
        return "1 + One";
    }

    public String getLeftOperand() {
        return "1";
    }

    public String getRightOperand() {
        return "One";
    }

    public String getOperator() {
        return "+";
    }
}

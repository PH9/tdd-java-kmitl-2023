public class Captcha {
    LeftOperand leftOperand;
    RightOperand rightOperand;
    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.leftOperand = new LeftOperand(pattern, leftOperand);
        this.rightOperand = new RightOperand(pattern, rightOperand);
    }

    @Override public  String toString() {
        return getLeftOperand() + " " + getOperator() + " " + getRightOperand();
    }

    public String getLeftOperand() {
        return leftOperand.toString();
    }

    public String getRightOperand() {
        return rightOperand.toString();
    }

    public String getOperator() {
        return "+";
    }
}

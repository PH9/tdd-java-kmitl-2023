public class Captcha {
    Operand leftOperand;
    Operand rightOperand;
    int operator;
    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.leftOperand = OperandFactory.createLeftOperand(pattern, leftOperand);
        this.operator = operator;
        this.rightOperand = OperandFactory.createRightOperand(pattern, rightOperand);
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
        if (operator == 2) {
            return "-";
        }
        if (operator == 3) {
            return "/";
        }
        return "+";
    }
}

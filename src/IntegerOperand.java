public class IntegerOperand implements Operand {
    int operand;
    public IntegerOperand(int operand) {
        this.operand = operand;
    }

    @Override
    public String toString() {
        return "" + operand;
    }
}

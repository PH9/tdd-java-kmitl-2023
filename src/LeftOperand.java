public class LeftOperand implements Operand {

    int pattern;
    int operand;
    public LeftOperand(int pattern, int operand) {
        this.pattern = pattern;
        this.operand = operand;
    }

    @Override public String toString() {
        if (pattern == 2) {
            String[] operands = {"One", "Two", "Three"};
            return operands[operand-1];
        }
        return "" + operand;
    }
}

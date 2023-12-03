public class RightOperand {
    int pattern;
    int operand;
    public RightOperand(int pattern, int operand) {
        this.pattern = pattern;
        this.operand = operand;
    }
    @Override public String toString() {
        if (pattern == 2) {
            return "" + operand;
        }
        String[] operands = {"One", "Two", "Three"};
        return operands[operand-1];
    }
}

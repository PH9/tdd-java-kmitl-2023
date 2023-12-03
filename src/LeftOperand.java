public class LeftOperand {

    int pattern;
    int operand;
    public LeftOperand(int pattern, int operand) {
        this.pattern = pattern;
        this.operand = operand;
    }

    @Override public String toString() {
        String[] operands = {"One", "Two", "Three"};
        return operands[operand-1];
    }
}

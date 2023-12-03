public class OperandFactory {
    public static Operand createLeftOperand(int pattern, int operand) {
        if(pattern == 2) {
            return new StringOperand(operand);
        }
        return new IntegerOperand(operand);
    }

    public static Operand createRightOperand(int pattern, int operand) {
        if(pattern == 1) {
            return new StringOperand(operand);
        }
        return new IntegerOperand(operand);
    }
}

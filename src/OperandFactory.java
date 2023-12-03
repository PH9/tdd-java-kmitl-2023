public class OperandFactory {
    public static Operand createLeftOperand(int pattern, int operand) {
        if(pattern == 2) {
            return new StringOperand(operand);
        }
        return new IntegerOperand(operand);
    }
}

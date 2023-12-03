public class StringOperand implements Operand{

    int operand;

    public StringOperand(int operand) {
        this.operand = operand;
    }

    @Override
    public String toString() {
        String[] strings = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return strings[operand - 1];
    }
}

package Part4.operation.checked;

import Part4.exceptions.ArithmeticParserException;
import Part4.expression.TripleExpression;
import Part4.operation.BinaryOperation;

public class CheckedAdd extends BinaryOperation {
    public CheckedAdd(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        if (right > 0 ? left > Integer.MAX_VALUE - right
                : left < Integer.MIN_VALUE - right) {
            throw new ArithmeticParserException("Overflow exception : " + left + " + " + right);
        }
        return left + right;
    }
}

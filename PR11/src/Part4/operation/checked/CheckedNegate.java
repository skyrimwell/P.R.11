package Part4.operation.checked;

import Part4.exceptions.ArithmeticParserException;
import Part4.expression.TripleExpression;
import Part4.operation.UnaryOperation;

public class CheckedNegate extends UnaryOperation {
    public CheckedNegate(TripleExpression object) {
        super(object);
    }

    protected int evaluate(int object) {
        if (object == Integer.MIN_VALUE)
            throw new ArithmeticParserException("Overflow exception : -(" + object + ")");
        return -object;
    }
}

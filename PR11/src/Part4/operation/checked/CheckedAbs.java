package Part4.operation.checked;

import Part4.exceptions.ArithmeticParserException;
import Part4.expression.TripleExpression;
import Part4.operation.UnaryOperation;

public class CheckedAbs extends UnaryOperation {
    public CheckedAbs(TripleExpression object) {
        super(object);
    }

    protected int evaluate(int object) {
        if (object == Integer.MIN_VALUE) {
            throw new ArithmeticParserException("Overflow exception : abs(" + object + ")");
        }
        return object < 0 ? -object : object;
    }

}

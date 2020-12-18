package Part4.operation.unchecked;

import Part4.expression.TripleExpression;
import Part4.operation.Operation;

public class Multiply extends Operation {

    public Multiply(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left * right;
    }

    protected double evaluate(double left, double right) {
        return left * right;
    }

}

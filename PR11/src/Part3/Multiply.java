package Part3;

public class Multiply extends Operation {

    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left * right;
    }
}

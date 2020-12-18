package Part4;

import Part4.exceptions.ArithmeticParserException;
import Part4.exceptions.FormatParserException;
import Part4.expression.TripleExpression;
import Part4.parser.ExpressionParser;

public class ExpParseRun {
    public static void main(String[] args) throws FormatParserException {
        ExpressionParser ep = new ExpressionParser();
        TripleExpression a = ep.parse("1000000*x*x*x*x*x/(x-1)");

        System.out.println("x\tf");
        for(int i = 0; i < 11; i++) {
            try {
                System.out.println(i + "\t" + a.evaluate(i, 0, 0));
            }
            catch (ArithmeticParserException e) {
                System.out.println(i + "\t" + e.getMessage());
            }
        }
    }
}

package Part4.parser;

import Part4.exceptions.FormatParserException;
import Part4.expression.TripleExpression;

public interface Parser {
    TripleExpression parse(String expression) throws FormatParserException;
}
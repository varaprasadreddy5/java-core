package com.learning.core.day4session1andsession2.Stacks;

import static com.learning.core.day4session1andsession2.Stacks.ExpressionEvaluator.evaluateExpression;

public class ExpressionEvaluatorTest {
    public static void main(String[] args) {
        ExpressionEvaluator evaluate = new ExpressionEvaluator();
        String expression = "10+2*6";
        System.out.println(evaluate.evaluateExpression(expression));

    }
}

package lambdas.binary;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {

        // BinaryOperator
        // Receives two values of the same type and returns a value of the same type

        // Example 1:
        BinaryOperator<Integer> binaryOperator1 = (a, b) -> {
            return a + b;
        };
        int result1 = binaryOperator1.apply(10, 15);
        System.out.println(result1);

        // Example 2:
        BinaryOperator<Integer> binaryOperator2 = (a, b) -> a - b;
        int result2 = binaryOperator2.apply(15, 10);
        System.out.println(result2);
    }
}


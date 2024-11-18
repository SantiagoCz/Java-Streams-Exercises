package lambdas.unary;

import java.util.function.UnaryOperator;

public class UnaryExample {
    public static void main(String[] args) {

        // UnaryOperator
        // Receives one value and returns a value of the same type

        // Example 1:
        UnaryOperator<Integer> unaryOperator1 = (a) -> {
            return a + a;
        };
        int result1 = unaryOperator1.apply(10);
        System.out.println(result1);

        // Example 2:
        UnaryOperator<Integer> unaryOperator2 = a -> a * a;
        int result2 = unaryOperator2.apply(12);
        System.out.println(result2);
    }
}

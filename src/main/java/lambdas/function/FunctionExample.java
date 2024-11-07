package lambdas.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args){

        // Function
        // Receives a value and returns a result.

        // Example 1:
        Function<Integer, String> function1 = (number) -> {
            return "This is function No. " + number;
        };
        String result1 = function1.apply(1);
        System.out.println(result1);

        // Example 2:
        Function<Integer, String> function2 = (number) -> "This is function No. " + number;
        String result2 = function2.apply(2);
        System.out.println(result2);
    }
}


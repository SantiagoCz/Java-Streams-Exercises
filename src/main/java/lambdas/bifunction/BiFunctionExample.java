package lambdas.bifunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args){

        // BiFunction
        // Receives 2 values and returns a result
        // Example 1:
        BiFunction<Integer, Integer, Integer> biFunction1 = (a, b) ->{
            return a + b;
        };
        int result = biFunction1.apply(10, 5);
        System.out.println("The result of 10 + 5 = " + result);

        // Example 2:
        BiFunction<Integer, Integer, String> biFunction2 = (a, b) -> "The result of 11 + 4 is = " + (a + b);
        System.out.println(biFunction2.apply(11, 4));
    }
}


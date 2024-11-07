package lambdas.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args){

        // BiPredicate
        // Receives two values and returns a boolean

        // Example 1:
        BiPredicate<Integer, Integer> biPredicate1 = (a, b) -> {
            return a > b;
        };
        boolean result1 = biPredicate1.test(3, 5);
        System.out.println(result1);

        // Example 2:
        BiPredicate<Integer, Integer> biPredicate2 = (a, b) -> a > b;
        boolean result = biPredicate2.test(3, 5);
        System.out.println(result);
    }
}

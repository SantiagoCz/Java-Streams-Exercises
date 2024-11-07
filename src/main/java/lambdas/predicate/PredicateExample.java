package lambdas.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args){

        // Predicate
        // Receives a value and returns a boolean (true or false)
        // Example 1:
        Predicate<String> predicate1 = (str) -> {
            return str.length() > 5;
        };
        boolean result1 = predicate1.test("Hello world");
        System.out.println(result1);

        // Example 2:
        Predicate<String> predicate2 = (str) -> str.length() > 5;
        boolean result2 = predicate2.test("Hello");
        System.out.println(result2);

    }
}


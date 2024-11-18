package lambdas.callable;

import java.util.concurrent.Callable;

public class CallableExample {
    public static void main(String[] args){

        // Callable
        // Does not receive values but returns a result and can throw an exception

        // Example 1:
        Callable<String> callable = () -> {
            return "Task result";
        };

        try {
            String result = callable.call();
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Example 2:
        Callable<Integer> callable1 = () -> 5 / 0; // This operation will throw an exception

        try {
            Integer result = callable1.call();
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

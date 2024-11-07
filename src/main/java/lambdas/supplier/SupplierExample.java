package lambdas.supplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args){
        // Supplier
        // Does not receive any value, but returns a result.

        // Example 1:
        Supplier<String> supplier1 = () -> {
            return "I am supplier No. 1";
        };
        String result = supplier1.get();
        System.out.println(result);

        // Example 2:
        Supplier<String> supplier2 = () -> "I am supplier No. 2";
        System.out.println(supplier2.get());
    }
}


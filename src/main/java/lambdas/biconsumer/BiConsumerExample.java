package lambdas.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        // BiConsumer
        // Receives two values and does not return anything
        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println(a + ", " + b);
        };
        biConsumer.accept("Hello", "world");
    }
}


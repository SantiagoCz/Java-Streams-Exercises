package lambdas.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args){

        // Consumer:
        // Receives a value and does not return anything
        Consumer<String> consumer = System.out::println;
        consumer.accept("Santiago");
    }
}


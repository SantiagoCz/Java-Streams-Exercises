package lambdas.runnable;

public class RunnableExample {
    public static void main(String[] args) {

        // Runnable
        // Does not receive values and does not return anything, it only executes a task

        // Example 1
        Runnable runnable = () -> {
            System.out.println("Executing task...");
        };
        runnable.run();

        // Example 2
        Runnable runnable1 = () -> System.out.println("Executing another task...");
        runnable1.run();
    }
}


package streams;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] arg) {

        //What is a Stream?

        //It is a flow of data that passes through like an assembly line.
        //You can work with the elements passing through the assembly line,
        //modifying, filtering, etc.

        //It is also important to highlight the types of operators that exist, including:
        //Final Operators: These are operators that terminate the stream, meaning that after this operator, no further operations can be performed.
        //Non-Final Operators: After using this operator, the stream can continue to be processed.


        //Example:
        List<String> names = Arrays.asList("Hanna", "John", "Charles", "Mary", "Chris", "Joe", "Max");

        System.out.println("ForEach------------------------------------------------------");
        // forEach(): a simple function that allows iterating over the elements of the list
        names.stream()
                .forEach(System.out::println); // this forEach is a final operator
        // It uses the lambda expression CONSUMER, so it takes a value and does not return anything.



        System.out.println("Filter-------------------------------------------------------");
        // filter(): Filters the elements that meet a condition.
        names.stream()
                .filter((name) -> { // filter uses the PREDICATE lambda expression, so it takes a value and returns a boolean
                    return name.length() > 4;
                }) // filter is a non-final operator, and we need to finish the function with a final operator, so we will use forEach.
                .forEach(System.out::println);



        System.out.println("Map----------------------------------------------------------");
        // map(): Transforms the elements by applying a function.
        names.stream()
                .map((name) -> { // map uses the FUNCTION lambda expression, so it takes a value and returns a result.
                    return name.toUpperCase();
                }) // map is a non-final operator, and we need to finish the function with a final operator, so we will use forEach.
                .forEach(System.out::println);



        System.out.println("Sorted-------------------------------------------------------");
        // sorted(): Sorts the elements in the stream
        names.stream()
                .sorted() // sorted uses the COMPARATOR expression (custom sorting filters can be created)
                .forEach(System.out::println);



        // We can also concatenate functions; this is an example of how to use the previous 4 together
        System.out.println("ForEach, Filter, Map, Sorted---------------------------------");
        names.stream()
                .filter((name) -> name.startsWith("Ma"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }
}

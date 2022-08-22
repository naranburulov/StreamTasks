package introToStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);
        //list.forEach(System.out::println);


        //Filtering a Stream
        System.out.println("Filter");
        list.stream()
                .filter(i -> i%2==0)
                .forEach(System.out::println);


        //Distinct
        System.out.println("Distinct");
        Stream<Integer> stream = list.stream()
                .filter(i -> i%2 ==0)
                .distinct();

        stream.forEach(System.out::println);  //Stream is closed

        //Truncating a Stream
        System.out.println("Limit");
        list.stream()
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);

        //Skipping Elements
        System.out.println("Skip");
        list.stream()
                .filter(i -> i%2==0)
                .skip(1)
                .forEach(System.out::println);

        //Mapping
        System.out.println("Mapping");
        list.stream()
                .map(number -> number*2)
                .filter(i-> i%3==0)
                .forEach(System.out::println);













    }
}

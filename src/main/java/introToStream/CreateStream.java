package introToStream;

import java.util.*;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {

        //Creating Stream from Array
        String[] courses = {"Java", "Spring", "Agile"};

        Stream<String> courseStream = Arrays.stream(courses);


        //Create Stream from Collection
        List<String> courseList = Arrays.asList("Java", "Spring", "Agile");


        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("DS", 101),
                new Course("MS", 102)
        );


        Stream<Course> myCourseStream = myCourses.stream();

        System.out.println("-----------------------------");

        //Creating Stream Values
        Stream<Integer> stream = Stream.of(1,2,3,4);
        Stream<Course> stream1 = Stream.of(new Course("Java", 100), new Course("DS", 101));








    }
}

package EmployeeTask;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Naran", "n@gmail.com", Arrays.asList("2406421163", "2675217879")),
                new Employee(101,"John", "j@gmail.com", Arrays.asList("2406551423", "2678787179")),
                new Employee(102,"Mike", "m@gmail.com", Arrays.asList("2402429000", "2676004017"))

        );
    }
}

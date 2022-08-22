package employeeTask;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println("Print all employee emails:");

        EmployeeData.readAll()
                .map(employee -> employee.getEmpEmail())
                .forEach(System.out::println);

        System.out.println("Print all phone numbers:");

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);


        System.out.println("Print all phone numbers with double colon operator");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);







    }
}

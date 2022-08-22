package employeeTask;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Employee {

    private int empId;
    private String empName;
    private String empEmail;
    private List<String> empPhoneNumbers;
}

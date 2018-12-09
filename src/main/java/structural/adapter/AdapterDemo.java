package structural.adapter;

import java.util.ArrayList;
import java.util.List;
public class AdapterDemo {
    public static void main(String[] args) {
        List<IEmployee> employeeList = new ArrayList<>();
        Employee e = new Employee("1", "Md. Maheraj", "Uddin", "maheraj.cse@gmail.com");
        employeeList.add(e);

        EmployeeLDP eidp = new EmployeeLDP("2", "Tasnim", "Ahmed", "tasnim.cse@gmail.com");
        employeeList.add(new EmployeeAdapterLDP(eidp));

        System.out.println(employeeList);

    }
}

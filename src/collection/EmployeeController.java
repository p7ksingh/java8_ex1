package collection;

import java.util.*;

import collectionlambda.Employee;

public class EmployeeController {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        Employee emp1 = new Employee(111, "Pankaj", "New Delhi");
        Employee emp2 = new Employee(222, "Dhiraj", "Assam");
        Employee emp3 = new Employee(999, "Niraj", "Bihar");
        Employee emp4 = new Employee(777, "Alex", "US");
        Employee emp5 = new Employee(555, "Rob", "US");
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        // System.out.println(employees);

        // sort the employee details based on employee id
        // Collections.sort(employees, new EmployeeIdComparator());
        // System.out.println("after sorting empId : " + employees);

        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println("name sortings : " + employees);
    }
}

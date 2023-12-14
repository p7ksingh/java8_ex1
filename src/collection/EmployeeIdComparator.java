package collection;

import java.util.Comparator;

import collectionlambda.Employee;

public class EmployeeIdComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee employee1 = (Employee) o1;
        Employee employee2 = (Employee) o2;
        if (employee1.getEmpId() == employee2.getEmpId()) {
            return 0;

        } else if (employee1.getEmpId() > employee2.getEmpId()) {
            return -1;
        } else {
            return 1;
        }
    }

}

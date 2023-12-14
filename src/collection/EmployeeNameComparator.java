package collection;

import java.util.Comparator;

import collectionlambda.Employee;

public class EmployeeNameComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        // return e1.getEmpAddress().compareTo(e2.getEmpAddress());
        return e1.getName().compareTo(e2.getName());
    }

}

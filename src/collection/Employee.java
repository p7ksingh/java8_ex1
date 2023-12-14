package collection;

public class Employee {
    private int empId;
    private String name;
    private String empAddress;

    public String getName() {
        return name;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + ", empAddress=" + empAddress + "]";
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Employee(int empId, String name, String empAddress) {
        this.empId = empId;
        this.name = name;
        this.empAddress = empAddress;
    }

}

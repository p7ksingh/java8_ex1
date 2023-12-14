package lambdaex;
@FunctionalInterface
interface emp {
    // public void empName();
    public void empSalary();

    default void empName() {
        System.out.println("i'm default method");
    }

    public static void empName1() {
        System.out.println("i'm static method");
    }
}

public class LambdaExprission1 {

    public static void main(String[] args) throws Exception {
        emp e = () -> System.out.println("5000");
        e.empSalary();
        emp.empName1();
    }
}

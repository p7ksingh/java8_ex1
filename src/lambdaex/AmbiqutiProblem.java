package lambdaex;
@FunctionalInterface
interface A {
    void m1();

    default void m11() {
        System.out.println("from A");
    }
}

@FunctionalInterface
interface B {
    void m1();

    default void m11() {
        System.out.println("from B");
    }
}

public class AmbiqutiProblem implements A, B {

    @Override
    public void m1() {

    }

    public void m11() {
        B.super.m11();
    }

    public static void main(String[] args) {
        AmbiqutiProblem ap = new AmbiqutiProblem();
        ap.m11();
    }

}

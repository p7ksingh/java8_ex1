package lambdaex;
public class DefaultMethod {
    interface IDefult {
        public void m1();

        default void m2() {
            System.out.println("from m2 default");
        }
    }

    public static void main(String[] args) {
        IDefult iDefult = () -> System.out.println("from sam");
        iDefult.m1();
        iDefult.m2();
    }
}

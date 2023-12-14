import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = List.of(100, 2, 3, 4, 5, 6, 7);
        Integer temp = -1;
        for (Integer i : numbers) {
            if (i >= temp) {
                temp = i;

            }
        }
        System.out.println(temp);




    }
}

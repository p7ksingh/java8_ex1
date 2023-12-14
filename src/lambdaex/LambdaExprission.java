package lambdaex;

interface School {
    public void student();
}

interface Add {
    public void add(int a, int b);

}

interface Count {
    public int con(String str);

}

interface StringCount {
    public void count(String str1, String str2);
}

interface StringCount1 {
    public String count1(String str3, String str4);

    
}

public class LambdaExprission {
    public static void main(String[] args) throws Exception {
        School student = () -> System.out.println("Hi i'm a student");
        student.student();

        Add add1 = (a, b) -> System.out.println(a + b);
        add1.add(10, 20);

        Count count1 = str -> str.length();
        int con = count1.con("pankaj");
        System.out.println(con);

        StringCount count2 = (str1, str2) -> {
            System.out.println(str1 + str2);
        };
        count2.count("pankaj", " singh");

        StringCount1 count3 = (str3, str4) -> {
            System.out.println(str3 + str4);
            return str3;

        };

    }
}

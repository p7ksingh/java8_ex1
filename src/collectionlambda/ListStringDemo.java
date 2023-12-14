package collectionlambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListStringDemo {
    public static void main(String[] args) {
      //  List<String> str = List.of("hello", "world", "India", "Japan", "France");
       
       List<String> st = new ArrayList<String>();
       st.add("Pankaj");
       st.add("Alamat");
       st.add("Xe");
       st.add("Gopal");
        Collections.sort(st, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Acending Order : "+st);

         Collections.sort(st, (s1, s2) -> s2.compareTo(s1));
        System.out.println("Decinding order : "+st);
        

    }
}

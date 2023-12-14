package collectionlambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        // primative
        List list = new ArrayList();
        list.add(100);
        list.add(500);
        list.add(300);
        list.add(400);
        list.add(200);
         System.out.println(list);
       // Collections.sort(list);
        // Collections.sort(list, (e1, e2) -> ((Integer) e1).compareTo((Integer)e2));
        Collections.sort(list, (Integer e1, Integer e2) -> (e1 > e2) ? 1 : (e1 < e2) ? -1 : 0);
        System.out.println(list);
        Collections.sort(list, (Integer e1, Integer e2) -> (e1 > e2) ? -1 : (e1 < e2) ? 1 : 0);
        System.out.println(list);
    }
}

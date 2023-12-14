package collection;
import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List list = List.of("Alex", "Bob", "Leaf", "Rob", "Xe", "Yn");
        System.out.println(list);
        Set set = new HashSet();
        set.add("Alex");
        set.add("Bob");
        set.add("Leaf");
        set.add("Rob");
        set.add("Rob");
        System.out.println(set);

        Map<String, String> map = new HashMap<String, String>();
        map.put("111", "pankaj");
        map.put("222", "Alex");
        map.put("333", "Rob");
        map.put("444", "Rob");
        map.put(null, "Rob");
        map.put(null, "Xe");
        System.out.println(map);
    }
}

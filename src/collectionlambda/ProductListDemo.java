package collectionlambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductListDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product();
        product1.setPid("111");
        product1.setName("fan");
        product1.setDesc("usha");

        Product product2 = new Product();
        product2.setPid("222");
        product2.setName("phone");
        product2.setDesc("apple");

        Product product3 = new Product();
        product3.setPid("444");
        product3.setName("gym");
        product3.setDesc("tata");

        Product product4 = new Product();
        product4.setPid("333");
        product4.setName("desktop");
        product4.setDesc("sony");

        Product product5 = new Product();
        product5.setPid("555");
        product5.setName("byke");
        product5.setDesc("bajaj");
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        System.out.println(products);

        Collections.sort(products, (p1, p2) -> (p1.getName().compareTo(p2.getName())));
        System.out.println(products);

        Collections.sort(products, (p1, p2) -> (p2.getName().compareTo(p1.getName())));
        System.out.println(products);

        Collections.sort(products, (p1, p2) -> (p1.getPid().compareTo(p2.getPid())));
        System.out.println(products);
        
    }

}

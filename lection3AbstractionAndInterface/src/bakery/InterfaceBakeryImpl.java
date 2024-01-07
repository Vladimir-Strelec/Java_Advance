package bakery;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class InterfaceBakeryImpl implements InterfaceBakery{
    @Override
    public void createProduct(Class clazz) {

        if (clazz.getClass().isInstance(Bread.class)) {
            Bread bread = new Bread("f;our", "sfsd", "bdds", "gfdf");
            System.out.println(bread);
        }
    }


}

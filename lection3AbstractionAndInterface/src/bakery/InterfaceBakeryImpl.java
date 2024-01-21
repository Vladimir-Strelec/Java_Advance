package bakery;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class InterfaceBakeryImpl implements InterfaceBakery{

    @Override
    public void createProduct(LinkedHashMap<Class, LinkedList<String>> map) {
        if (map.containsKey(Bread.class)) {
            Bread bread = new Bread(map.get(Bread.class).get(0), map.get(Bread.class).get(1), map.get(Bread.class).get(2), map.get(Bread.class).get(3));
        }
    }

    @Override
    public void info(Class info) {

    }

}

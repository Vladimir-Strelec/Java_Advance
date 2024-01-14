package bakery;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Objects;

public class MainBakery {
    public static void main(String[] args) {
        LinkedList<String> bread = new LinkedList<>();
        bread.add("Flour");
        bread.add("Salt");
        bread.add("Oil");
        bread.add("Gluten");

        LinkedHashMap<Class, LinkedList<String>> map = new LinkedHashMap<>();
        map.put(Bread.class, bread);
        InterfaceBakery interfaceBakery = new InterfaceBakeryImpl();


        interfaceBakery.createProduct(map);
    }
}

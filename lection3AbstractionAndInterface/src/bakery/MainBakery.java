package bakery;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class MainBakery {
    public static void main(String[] args) {
        Bread bread = new Bread("Muka", "Solt", "Maslo", "Gluten");
        Bread bread2 = new Bread("Muka", "Solt", "Maslo", "Gluten", "Garlic");

        InterfaceBakeryImpl interfaceBakery = new InterfaceBakeryImpl();

        interfaceBakery.createProduct(Bread.class);
    }
}

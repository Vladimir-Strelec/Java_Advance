package bakery;

public class MainBakery {
    public static void main(String[] args) {
        Bread bread = new Bread("Muka", "Solt", "Maslo", "Gluten");
        Bread bread2 = new Bread("Muka", "Solt", "Maslo", "Gluten", "Garlic");
        System.out.println(bread2.getProductsMap());
    }
}

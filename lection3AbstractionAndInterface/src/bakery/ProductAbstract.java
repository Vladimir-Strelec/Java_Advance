package bakery;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public abstract class ProductAbstract {
    private String flour;
    private String salt;
    private String garlic;
    private LinkedHashMap<Class, LinkedList<String>> productsAndIngredients = new LinkedHashMap<>();

    public ProductAbstract(String flour, String salt) {
        this.flour = flour;
        this.salt = salt;

    }

    public ProductAbstract(String flour, String salt, String garlic) {
        this.flour = flour;
        this.salt = salt;
        this.garlic = garlic;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getGarlic() {
        return garlic;
    }

    public void setGarlic(String garlic) {
        this.garlic = garlic;
    }

    public LinkedHashMap<Class, LinkedList<String>> getProductsAndIngredients() {
        return productsAndIngredients;
    }

    public void setProductsAndIngredients(LinkedHashMap<Class, LinkedList<String>> productsAndIngredients) {
        this.productsAndIngredients = productsAndIngredients;
    }
}

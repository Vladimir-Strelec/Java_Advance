package bakery;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public abstract class ProductAbstract {
    private String flour;
    private String salt;
    private String garlic;
    private LinkedHashMap<String, LinkedList<String>> ingredients;

    public ProductAbstract(String flour, String salt) {
        this.flour = flour;
        this.salt = salt;
    }

    public ProductAbstract(String flour, String salt, String garlic) {
        this.flour = flour;
        this.salt = salt;
        this.garlic = garlic;
    }

    public void addMap(String key, LinkedList<String> value) {
        this.ingredients.put(key, value);
    }
    public LinkedHashMap<String, LinkedList<String>> getProductsMap() {

        return ingredients;
    }

    public void setProductsMap(LinkedHashMap<String, LinkedList<String>> productsMap) {
        this.ingredients = productsMap;
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
}

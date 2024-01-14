package bakery;

import java.lang.invoke.TypeDescriptor;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Bread extends ProductAbstract{
    private String oil;
    private String gluten;

    public Bread(String flour, String salt, String oil, String gluten) {
        super(flour, salt);
        this.oil = oil;
        this.gluten = gluten;

    }

}

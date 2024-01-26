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
    public String printInfo() {
        return this.getFlour() +" "+this.getSalt()+" "+this.oil+" "+this.gluten;
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public String getGluten() {
        return gluten;
    }

    public void setGluten(String gluten) {
        this.gluten = gluten;
    }
}

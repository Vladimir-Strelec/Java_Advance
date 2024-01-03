package bakery;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Bread extends ProductAbstract{
    private String butter;
    private String gluten;

    public Bread(String flour, String salt, String butter, String gluten) {
        super(flour, salt);
        this.butter = butter;
        this.gluten = gluten;

    }

    public Bread(String flour, String salt, String butter, String gluten, String garlic) {
        super(flour, salt, garlic);
        this.butter = butter;
        this.gluten = gluten;
    }


    public String getButter() {
        return butter;
    }

    public void setButter(String butter) {
        this.butter = butter;
    }

    public String getGluten() {
        return gluten;
    }

    public void setGluten(String gluten) {
        this.gluten = gluten;
    }
}

package bakery;

public class Tort extends ProductAbstract{
    private String sugar;
    protected Tort(String flour, String salt, String sugar) {
        super(flour, salt);
        this.sugar = sugar;
    }

    protected Tort(String flour, String salt, String sugar, String garlic) {
        super(flour, salt, garlic);
        this.sugar = sugar;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }
}

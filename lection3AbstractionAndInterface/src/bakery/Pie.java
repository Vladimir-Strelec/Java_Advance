package bakery;

public class Pie extends ProductAbstract{
    private String eggs;
    private String cheese;
    protected Pie(String flour, String salt, String cheese) {
        super(flour, salt);
        this.cheese = cheese;
    }

    protected Pie(String flour, String salt, String cheese, String garlic) {
        super(flour, salt, garlic);
        this.cheese = cheese;
    }
    public String getEggs() {
        return eggs;
    }

    public void setEggs(String eggs) {
        this.eggs = eggs;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }
}

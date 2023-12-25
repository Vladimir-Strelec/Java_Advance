package persons;

public class Developer extends Person {
    private int countLanguage;

    public Developer(String name, Double salary, boolean holiday, int countLanguage) {
        super(name, salary, holiday);
        this.countLanguage = countLanguage;
    }

    public int getCountLanguage() {
        return countLanguage;
    }

    public void setCountLanguage(int countLanguage) {
        this.countLanguage = countLanguage;
    }

    protected void checkPeopleAndChangeSalary() {
        if(this.countLanguage > 2){
            this.changeSalary();
        }
    }
}
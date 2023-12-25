package persons;

public class Manager extends Person{
    private int countPeople;

    public Manager(String name, Double salary, boolean holiday, int countPeople) {
        super(name, salary, holiday);
        this.countPeople = countPeople;
    }


    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public void checkPeopleAndChangeSalary() {
        if(this.countPeople > 10){
            this.changeSalary();
        }
    }
}

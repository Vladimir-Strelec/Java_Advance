package persons;

import java.util.Arrays;
import java.util.List;

public class Person {
    private String name;
    private Double salary;
    private boolean holiday;

    public Person(String name, Double salary, boolean holiday) {
        this.name = name;
        this.salary = salary;
        this.holiday = holiday;
    }

    protected void changeSalary() {
        if(this.holiday){
            this.salary += 150;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public boolean isHoliday() {
        return holiday;
    }

    public void setHoliday(boolean holiday) {
        this.holiday = holiday;
    }



}

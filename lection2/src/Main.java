import com.technoShop.Computer;
import com.technoShop.Laptop;
import com.technoShop.Smartphone;
import persons.Developer;
import persons.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Vova", 10., true, 11);
        System.out.println(manager.getSalary());
        System.out.println(manager.getTotalMoney());
        manager.checkPeopleAndChangeSalary();
        System.out.println(manager.getSalary());
        System.out.println(manager.getTotalMoney());

        Developer developer = new Developer("Vladi", 20., true, 3);
        System.out.println(developer.getSalary());
        System.out.println(developer.getTotalMoney());

    }
}
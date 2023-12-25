import com.technoShop.Computer;
import com.technoShop.Laptop;
import com.technoShop.Smartphone;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Pentium 4", 1989, 434, "Dell");
        computer1.printComputerInfo();

        Laptop laptop1 = new Laptop("Asus", 2003, 999.00, 8, true);
        laptop1.printLaptopInfo();

        Smartphone smartphone1 = new Smartphone("Samsung", 2010, 500, 3);
        smartphone1.printSmartphoneInfo();
    }
}
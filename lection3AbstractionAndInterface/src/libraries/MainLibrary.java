package libraries;

public class MainLibrary {
        public static void main(String[] args) {
            Music music = new Music("Jizn", "Matrang", 3);
            Book book = new Book("Alien", "Stivin King", 100);

            WorkInterface workInterface = new WorkInterfaceImpl();
            workInterface.printInfo(music);
            workInterface.printInfo(book);

            workInterface.addMinutes(music, 3);
            workInterface.addPages(book, 100);
            System.out.println("---------------------");

            workInterface.printInfo(music);
            workInterface.printInfo(book);
    }
}

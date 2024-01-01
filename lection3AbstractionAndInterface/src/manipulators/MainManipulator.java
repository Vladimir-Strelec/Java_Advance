package manipulators;

public class MainManipulator {
    public static void main(String[] args) {
        String line = "lower";
        ManipulatorInterface manipulatorInterface = new ManipulatorInterfaceImpl();
        System.out.println(manipulatorInterface.getIndexAndChr(line));
    }
}

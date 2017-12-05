import MainInterface.AbstractInterface;
import MainInterface.UserInterfaceImpl;

/**
 * Created by easonjackson on 12/4/17.
 */
public class App {

    public static void main (String[] args) {
        AbstractInterface screen = new UserInterfaceImpl();
        screen.generateInterface();
    }
}

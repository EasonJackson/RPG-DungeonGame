package Utility;

import GraphicInterface.CharacterInterface.CharacterInterfaceImpl;
import GraphicInterface.ControllerInterface.ControllerInterfaceImpl;
import GraphicInterface.MainInterface.MainFrame;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by easonjackson on 12/5/17.
 */
public class DungeonGame {

    private ExecutorService executors = Executors.newFixedThreadPool(5);

    public void play() {

        MainFrame mainFrame = MainFrame.genMainFrame();

        CharacterInterfaceImpl characterInterface = new CharacterInterfaceImpl(mainFrame);
        ControllerInterfaceImpl controllerInterface = new ControllerInterfaceImpl(mainFrame);

    }
}

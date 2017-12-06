package Utility;

import GraphicInterface.CharacterInterface.CharacterInterfaceImpl;
import GraphicInterface.ActionStatusMenu.ActionStatusMenu;
import GraphicInterface.MainContainer.MainFrame;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by easonjackson on 12/5/17.
 */
public class DungeonGame {

    private MainFrame mainFrame;
    private Controller controller;

    private void initiate() throws Exception{
        this.mainFrame = MainFrame.genMainFrame();
        preLoadGameMachanism();
        instatiateEntities();
        chooseCharacter();
        loadMap();
        play();
    }

    private void play() throws Exception{

    }

    private void save() {

    }

    private void exit() {

    }

    public void start() {
        try {
            this.initiate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

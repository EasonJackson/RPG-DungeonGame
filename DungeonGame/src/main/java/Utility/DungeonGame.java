package Utility;

import GraphicInterface.MainContainer.MainFrame;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

/**
 * Created by easonjackson on 12/5/17.
 */
public class DungeonGame {

    private MainFrame mainFrame;
    private Handler handler;
    private KeyListener keyListener;
    private MouseListener mouseListener;
    private GameMode mode;
    private Map<String, GameScene> GameMap;
    private Character character;

    private void initiate() throws Exception{
        this.mainFrame = MainFrame.genMainFrame(keyListener, mouseListener);

        handler = new Handler();

        preLoadGameMachanism();
        instatiateEntities();
        chooseCharacter();
        GameMap = loadMap();
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

    private void instatiateEntities() {

    }

    private void chooseCharacter() {

    }
}

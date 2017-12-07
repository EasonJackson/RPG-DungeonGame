package Game;

import GraphicInterface.MainContainer.MainFrame;
import Scene.GameScene;
import Utility.Handler;
import Utility.KeyManager;
import Utility.MouseManager;
import Utility.Tickable;

import java.util.Map;

/**
 * Created by easonjackson on 12/5/17.
 */
public class DungeonGame implements Tickable, Runnable{

    private MainFrame mainFrame;
    private Handler handler;
    private KeyManager keyListener;
    private MouseManager mouseListener;
    private GameMode mode;
    private Map<String, GameScene> GameMap;
    private Character character;

    private void initiate() throws Exception{
        keyListener = new KeyManager();
        mouseListener = new MouseManager();
        this.mainFrame = new MainFrame(keyListener, mouseListener);

        handler = new Handler();
        instantiateEntities();
        this.mode = GameMode.LOGIN;

        mainFrame.loadState();
    }

    private void play() throws Exception{

    }

    private void save() {

    }

    private void exit() {

    }

    private void instantiateEntities() {

    }

    private void chooseCharacter() {

    }

    @Override
    public void tick() {

        keyListener.tick();
        mouseListener.tick();
    }

    @Override
    public void run() {

    }

    private enum GameMode {
        LOGIN, BIGWORLD, FUBEN

    }
}

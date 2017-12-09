package Game;

import GraphicInterface.MainContainer.MainFrame;
import Dungeon.GameScene;
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
    private Map<String, GameScene> GameMap;
    private Character character;

    synchronized private void initiate() throws Exception{
        keyListener = new KeyManager();
        mouseListener = new MouseManager();
        this.mainFrame = new MainFrame(keyListener, mouseListener);
        handler = new Handler();
        instantiateEntities();
        mainFrame.loadState(GameMode.LOGIN);
    }

    synchronized private void play() throws Exception{

        mainFrame.loadState(GameMode.BIGWORLD);
    }

    synchronized private void save() {

    }

    synchronized private void exit() {

    }

    private void instantiateEntities() {

    }

    @Override
    public void tick() {
        keyListener.tick();
        mouseListener.tick();
    }

    @Override
    public void run() {
        try {
            this.initiate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public enum GameMode {
        LOGIN, BIGWORLD, FUBEN

    }
}

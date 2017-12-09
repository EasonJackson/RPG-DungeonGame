package GraphicInterface.MainContainer;

import Game.DungeonGame;
import GraphicInterface.ActionStatusMenu.ActionStatusMenu;
import GraphicInterface.CharacterInterface.CharacterInteractionScreen;
import GraphicInterface.DungeonInterface.DungeonInteractionScreen;
import GraphicInterface.InitialLoginMenu.LoginStatusMenu;
import Utility.KeyManager;
import Utility.MouseManager;
import Utility.Tickable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

/**
 * Created by easonjackson on 12/5/17.
 */
public class MainFrame extends JFrame implements ActionListener, Tickable{

    private static final int FRAME_SIZE_WIDTH = 800;
    private static final int FRAME_SIZE_HEIGHT = 600;

    private KeyManager keyManager;
    private MouseManager mouseManager;
    private DungeonGame.GameMode mode;
    private static LoginStatusMenu loginStatusMenu = null;
    private static ActionStatusMenu actionStatusMenu = null;
    private static CharacterInteractionScreen characterInteractionScreen = null;
    private static DungeonInteractionScreen dungeonInteractionScreen = null;

    public MainFrame (KeyManager keyManager, MouseManager mouseManager) {
        this.keyManager = keyManager;
        this.mouseManager = mouseManager;
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(FRAME_SIZE_WIDTH, FRAME_SIZE_HEIGHT);
        this.setResizable(false);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        //System.out.println("Frame width " + instance.getX() + " " + instance.getWidth() +
        //                    "Frame height " + instance.getY() + " " + instance.getHeight());

    }

    public void actionPerformed(ActionEvent e) {

    }

    public KeyManager getKeyManager() {
        return keyManager;
    }

    public MouseManager getMouseManager() {
        return mouseManager;
    }

    @Override
    public void tick() {
        switch (mode) {
            case LOGIN: mouseManager.tick();
            case BIGWORLD: keyManager.tick();
            case FUBEN: keyManager.tick();
        }
    }

    // Render image
    private void render() {


    }

    public void loadState(DungeonGame.GameMode mode) {
        switch (mode) {
            case LOGIN: loadLogin(this);
            case BIGWORLD: loadBigWorld(this);
            case FUBEN: loadDungeon(this);
        }

        render();
    }

    private void loadLogin(MainFrame mainFrame) {
        if (loginStatusMenu == null) {
            loginStatusMenu = new LoginStatusMenu(mainFrame);
        }
    }

    private void loadBigWorld(MainFrame mainFrame) {
        if (actionStatusMenu == null) {
            actionStatusMenu = new ActionStatusMenu(mainFrame);
        }

        if (characterInteractionScreen == null) {
            characterInteractionScreen = new CharacterInteractionScreen(mainFrame);
        }
    }

    private void loadDungeon(MainFrame mainFrame) {
        if (actionStatusMenu == null) {
            actionStatusMenu = new ActionStatusMenu(mainFrame);
        }

        if (dungeonInteractionScreen == null) {
            dungeonInteractionScreen = new DungeonInteractionScreen(mainFrame);
        }
    }
}

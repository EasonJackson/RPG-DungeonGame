package GraphicInterface.MainContainer;

import Game.DungeonGame;
import GraphicInterface.ActionStatusMenu.ActionStatusMenu;
import GraphicInterface.CharacterInterface.CharacterInteractionScreen;
import GraphicInterface.DungeonInterface.DungeonInteractionScreen;
import GraphicInterface.InitialLoginMenu.LoginStatusMenu;
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
    private KeyListener keyListener;
    private MouseListener mouseListener;

    private LoginStatusMenu loginStatusMenu = null;
    private ActionStatusMenu actionStatusMenu = null;
    private CharacterInteractionScreen characterInteractionScreen = null;
    private DungeonInteractionScreen dungeonInteractionScreen = null;

    public MainFrame() {

    }

    public MainFrame (KeyListener keyListener, MouseListener mouseListener) {
        this();
        this.keyListener = keyListener;
        this.mouseListener = mouseListener;
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

    public KeyListener getKeyListener() {
        return keyListener;
    }

    public MouseListener getMouseListener() {
        return mouseListener;
    }

    @Override
    public void tick() {

    }

    public void loadState(DungeonGame.GameMode mode) {
        switch (mode) {
            case LOGIN: loadLogin(this);
            case BIGWORLD: ;
            case FUBEN: ;
        }
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

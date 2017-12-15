package Utility;

import GraphicInterface.MainContainer.MainFrame;

/**
 * Created by easonjackson on 12/7/17.
 */
public class Handler {
    private KeyManager keyManager;
    private MouseManager mouseManager;
    private MainFrame mainFrame;

    public Handler (KeyManager keyManager,
             MouseManager mouseManager,
             MainFrame mainFrame) {
        this.keyManager = keyManager;
        this.mouseManager = mouseManager;
        this.mainFrame = mainFrame;
    }

    public KeyManager getKeyManager() {
        return keyManager;
    }

    public MouseManager getMouseManager() {
        return mouseManager;
    }

    public MainFrame getMainFrame() {
        return mainFrame;
    }
}

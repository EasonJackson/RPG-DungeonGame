package GraphicInterface.MainContainer;

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

    public void loadState() {

    }
}

package GraphicInterface.MainContainer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

/**
 * Created by easonjackson on 12/5/17.
 */
public class MainFrame extends JFrame implements ActionListener{

    private static final int FRAME_SIZE_WIDTH = 800;
    private static final int FRAME_SIZE_HEIGHT = 600;

    private static MainFrame instance;

    private MainFrame() {

    }

    public static MainFrame genMainFrame(KeyListener keyListener, MouseListener mouseListener) {
        instance = new MainFrame();
        instance.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        instance.setSize(FRAME_SIZE_WIDTH, FRAME_SIZE_HEIGHT);
        instance.setResizable(false);
        instance.setVisible(true);
        instance.setLayout(new FlowLayout());
        //System.out.println("Frame width " + instance.getX() + " " + instance.getWidth() +
        //                    "Frame height " + instance.getY() + " " + instance.getHeight());


        Canvas canvas = new Canvas();
        canvas.setBackground(Color.white);
        canvas.setFocusable(false);
        canvas.addKeyListener(keyListener);
        canvas.addMouseListener(mouseListener);
        canvas.setSize(instance.getSize());
        instance.add(canvas);
        instance.pack();

        return instance;
    }

    public void actionPerformed(ActionEvent e) {

    }
}

package GraphicInterface.MainContainer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by easonjackson on 12/5/17.
 */
public class MainFrame extends JFrame implements ActionListener{

    private static final int FRAME_SIZE_WIDTH = 800;
    private static final int FRAME_SIZE_HEIGHT = 600;

    private static MainFrame instance = new MainFrame();

    private MainFrame() {

    }

    public static MainFrame genMainFrame() {
        instance.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        instance.setSize(FRAME_SIZE_WIDTH, FRAME_SIZE_HEIGHT);
        instance.setResizable(false);
        instance.setVisible(true);
        instance.setLayout(new FlowLayout());
        //System.out.println("Frame width " + instance.getX() + " " + instance.getWidth() +
        //                    "Frame height " + instance.getY() + " " + instance.getHeight());

        return instance;
    }

    public void actionPerformed(ActionEvent e) {

    }
}

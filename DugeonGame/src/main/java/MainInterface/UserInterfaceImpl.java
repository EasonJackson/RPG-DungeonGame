package MainInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * Created by easonjackson on 12/4/17.
 */
public class UserInterfaceImpl implements AbstractInterface {

    public void generateInterface() {

        JFrame frame = new JFrame();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setSize(400,400);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        panel.setVisible(true);
        frame.add(panel);
        frame.setBackground(Color.cyan);
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

package GraphicInterface.ControllerInterface;

import GraphicInterface.AbstractInterface;
import GraphicInterface.MainInterface.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by easonjackson on 12/5/17.
 */
public class ControllerInterfaceImpl implements AbstractInterface, ActionListener {

    private JPanel content;

    public ControllerInterfaceImpl(MainFrame frame) {
        generateUI(frame);
    }

    @Override
    public void generateUI(MainFrame frame) {

        this.content = new JPanel();

        int panelWidth = frame.getWidth();
        int panelHeight = frame.getHeight() /3;

        content.setVisible(true);
        content.setSize(panelWidth, panelHeight);
        content.setLocation(frame.getX(), frame.getHeight() - panelHeight);
        System.out.println(content.getY() + " " + content.getHeight());

        content.setBackground(Color.YELLOW);

        frame.add(content);
        frame.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

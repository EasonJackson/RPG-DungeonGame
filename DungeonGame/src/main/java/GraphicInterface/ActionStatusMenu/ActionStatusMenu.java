package GraphicInterface.ActionStatusMenu;

import GraphicInterface.AbstractContainer;
import GraphicInterface.MainContainer.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by easonjackson on 12/5/17.
 */
public class ActionStatusMenu implements AbstractContainer, ActionListener {
    public ActionStatusMenu(MainFrame frame) {
        generateUI(frame);
    }

    @Override
    public void generateUI(MainFrame frame) {

        JPanel content = new JPanel();

        int panelWidth = frame.getWidth();
        int panelHeight = frame.getHeight() /3;

        content.setVisible(true);
        content.setSize(panelWidth, panelHeight);
        content.setLocation(frame.getX(), frame.getHeight() - panelHeight);
        //System.out.println(content.getY() + " " + content.getHeight());
        content.setBackground(Color.YELLOW);
        content.add(new JLabel("This is controlling menu section"));

        frame.add(content);
        frame.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

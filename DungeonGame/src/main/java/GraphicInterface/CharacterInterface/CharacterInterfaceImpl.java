package GraphicInterface.CharacterInterface;

import GraphicInterface.AbstractInterface;
import GraphicInterface.MainInterface.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by easonjackson on 12/4/17.
 */
public class CharacterInterfaceImpl implements AbstractInterface, ActionListener {

    private JPanel content;

    public CharacterInterfaceImpl(MainFrame frame) {
        generateUI(frame);
    }

    public void generateUI(MainFrame frame) {

        this.content = new JPanel();

        int panelWidth = frame.getWidth();
        int panelHeight = frame.getHeight() * 2/3;

        content.setVisible(true);
        content.setSize(panelWidth, panelHeight);

        content.setBackground(Color.WHITE);

        frame.add(content);
        frame.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

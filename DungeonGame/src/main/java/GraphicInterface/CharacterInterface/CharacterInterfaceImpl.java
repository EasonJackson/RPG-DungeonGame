package GraphicInterface.CharacterInterface;

import GraphicInterface.MainContainer.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by easonjackson on 12/4/17.
 */
public class CharacterInterfaceImpl implements ActionListener {

    public CharacterInterfaceImpl(MainFrame frame) {
        generateUI(frame);
    }

    public void generateUI(MainFrame frame) {

        JPanel content = new JPanel();

        int panelWidth = frame.getWidth();
        int panelHeight = frame.getHeight() * 2/3;

        content.setVisible(true);
        content.setSize(panelWidth, panelHeight);
        content.setBackground(Color.WHITE);

        Canvas canvas = new Canvas();
        canvas.setVisible(true);
        canvas.setBackground(Color.white);
        canvas.setFocusable(false);
        canvas.addKeyListener(frame.getKeyListener());
        canvas.addMouseListener(frame.getMouseListener());
        canvas.setSize(content.getSize());
        content.add(canvas);

        frame.add(content);
        frame.pack();
        frame.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

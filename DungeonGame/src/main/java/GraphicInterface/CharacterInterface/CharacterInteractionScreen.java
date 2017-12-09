package GraphicInterface.CharacterInterface;

import GraphicInterface.MainContainer.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by easonjackson on 12/4/17.
 * Character moves behaves ...
 */

 public class CharacterInteractionScreen implements ActionListener {

    public CharacterInteractionScreen(MainFrame frame) {
        generateUI(frame);
    }

    private void generateUI(MainFrame frame) {

        Canvas canvas = new Canvas();
        canvas.setVisible(true);
        canvas.setBackground(Color.white);
        canvas.setFocusable(false);
        canvas.addKeyListener(frame.getKeyManager());
        canvas.addMouseListener(frame.getMouseManager());
        canvas.setSize(frame.getSize());

        JPanel content = new JPanel();
        int panelWidth = frame.getWidth();
        int panelHeight = frame.getHeight() * 2/3;
        content.setVisible(true);
        content.setSize(panelWidth, panelHeight);
        content.setBackground(Color.WHITE);

        frame.add(canvas);
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

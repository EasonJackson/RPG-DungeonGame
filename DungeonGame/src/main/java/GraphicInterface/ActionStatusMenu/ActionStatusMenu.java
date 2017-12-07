package GraphicInterface.ActionStatusMenu;

import GraphicInterface.MainContainer.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by easonjackson on 12/5/17.
 */
public class ActionStatusMenu implements ActionListener {

    public ActionStatusMenu(MainFrame frame) {
        generateUI(frame);
    }

    public void generateUI(MainFrame frame) {

        JPanel content = new JPanel();

        int panelWidth = frame.getWidth();
        int panelHeight = frame.getHeight() /3;

        content.setVisible(true);
        content.setSize(panelWidth, panelHeight);
        content.setLocation(frame.getX(), frame.getHeight() - panelHeight);
        //System.out.println(content.getY() + " " + content.getHeight());
        content.setBackground(Color.WHITE);

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.white);
        canvas.setVisible(true);
        canvas.setFocusable(false);
        canvas.addKeyListener(frame.getKeyListener());
        canvas.addMouseListener(frame.getMouseListener());
        canvas.setSize(content.getSize());
        content.add(canvas);

        frame.add(content);
        frame.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

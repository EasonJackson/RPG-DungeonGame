package GraphicInterface.ActionStatusMenu;

import GraphicInterface.MainContainer.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by easonjackson on 12/5/17.
 *
 * Character action menu (lower bar menu)
 */
public class ActionStatusMenu implements ActionListener {

    public ActionStatusMenu(MainFrame frame) {
        generateUI(frame);
    }

    private void generateUI(MainFrame frame) {

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.white);
        canvas.setVisible(true);
        canvas.setFocusable(false);
        canvas.addKeyListener(frame.getKeyManager());
        canvas.addMouseListener(frame.getMouseManager());
        canvas.setSize(frame.getSize());

        JPanel content = new JPanel();
        int panelWidth = frame.getWidth();
        int panelHeight = frame.getHeight() /3;
        content.setVisible(true);
        content.setSize(panelWidth, panelHeight);
        content.setLocation(frame.getX(), frame.getHeight() - panelHeight);
        //System.out.println(content.getY() + " " + content.getHeight());
        content.setBackground(Color.WHITE);

        frame.add(canvas);
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void render() {

    }
}

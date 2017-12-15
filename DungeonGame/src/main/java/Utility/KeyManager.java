package Utility;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by easonjackson on 12/7/17.
 */
public class KeyManager implements KeyListener, Tickable{
    private boolean[] keys = new boolean[256];
    private boolean up, down, left, right, select, cancel;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;

    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    @Override
    public void tick() {
        up = keys[KeyEvent.VK_W] || keys[KeyEvent.VK_UP];
        down = keys[KeyEvent.VK_S] || keys[KeyEvent.VK_DOWN];
        left = keys[KeyEvent.VK_A] || keys[KeyEvent.VK_LEFT];
        right = keys[KeyEvent.VK_D] || keys[KeyEvent.VK_RIGHT];
        select = keys[KeyEvent.VK_J];
        cancel = keys[KeyEvent.VK_K];
    }

    public boolean isUp() {
        return up;
    }

    public boolean isDown() {
        return down;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }

    public boolean isSelect() {
        return select;
    }

    public boolean isCancel() {
        return cancel;
    }
}

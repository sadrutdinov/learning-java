package pro.chapter24;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleKey extends Frame implements KeyListener {

    String msg = "";
    String keyState = "";
    String line = "x";
    int x = 10;
    int y = 10;

    public SimpleKey() {
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    @Override
    // обработчик события от ввода с клавиатуры
    public void keyTyped(KeyEvent e) {
        msg += e.getKeyChar();
        repaint();
    }

    @Override
    // обработчик события от нажатия клавиши
    public void keyPressed(KeyEvent e) {
        keyState = "кнопка нажата";

        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                msg = "up";
                y--;
                break;
            case KeyEvent.VK_DOWN:
                msg = "down";
                y++;
                break;
            case KeyEvent.VK_LEFT:
                msg = "left";
                x--;
                break;
            case KeyEvent.VK_RIGHT:
                msg = "right";
                x++;
                break;
        }
        repaint();
    }

    @Override
    // обработчик события от отпускания клавиши
    public void keyReleased(KeyEvent e) {
        keyState = "кнопка отпущена";
        repaint();
    }

    // отобразить нажатия клавиш
    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
        g.drawString(keyState, 20, 50);
        g.drawString(line, x, y);
    }

    public static void main(String[] args) {
        SimpleKey appwin = new SimpleKey();

        appwin.setSize(new Dimension(300, 300));
        appwin.setTitle("SimpleKey");
        appwin.setVisible(true);
    }

}

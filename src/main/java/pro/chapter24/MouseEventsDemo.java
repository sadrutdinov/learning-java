package pro.chapter24;

import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends Frame implements MouseMotionListener, MouseListener {

    String msg = "";
    int mouseX = 0;
    int mouseY = 0;

    public MouseEventsDemo() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    // обработать событие от щелчка мыши
    @Override
    public void mouseClicked(MouseEvent e) {
        msg = msg + " - - click received";
    }

    // обработать событие нажатия кнопки мыши
    @Override
    public void mousePressed(MouseEvent e) {
        mouseY = e.getY();
        mouseX = e.getX();

        msg = "Button down";
        repaint();
    }

    // обработать событие отпускания кнопки мыши
    @Override
    public void mouseReleased(MouseEvent e) {
        mouseY = e.getY();
        mouseX = e.getX();

        msg = "Button released";
        repaint();
    }

    // обработать событие наведения курсора мыши
    @Override
    public void mouseEntered(MouseEvent e) {
        mouseX = 100;
        mouseY = 100;

        msg = "mouse entered";
        repaint();
    }

    // обработать событие отведения курсора мыши
    @Override
    public void mouseExited(MouseEvent e) {
        mouseX = 100;
        mouseY = 100;

        msg = "mouse exited";
        repaint();

    }

    // обработать событие перетаскивания курсора мыши (с зажатием)
    @Override
    public void mouseDragged(MouseEvent e) {
        mouseY = e.getY();
        mouseX = e.getX();

        msg = "*" + "mouse at " + mouseX + ", " + mouseY;
        repaint();
    }

    // обработать событие перемещения мыши
    @Override
    public void mouseMoved(MouseEvent e) {
        msg = "moving mouse at " + e.getX() + ", " + e.getY();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }

    public static void main(String[] args) {
        MouseEventsDemo appwim = new MouseEventsDemo();
        appwim.setSize(new Dimension(300, 300));
        appwim.setTitle("MouseEventsDemo");
        appwim.setVisible(true);
    }

}

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

/** 933
 *  **/
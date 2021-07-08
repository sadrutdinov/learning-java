package pro.chapter24;


// здесь внутренний класс не применяется

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class MousePressedDemo extends Frame {
    String msg = "";

    public MousePressedDemo() {
        addMouseListener(new MyMouseAdapter2(this));
        addWindowListener(new MyWindowAdapter());
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
    }

    public static void main(String[] args) {
        MousePressedDemo appwin = new MousePressedDemo();

        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("MousePressedDemo");
        appwin.setVisible(true);
    }

}

class MyMouseAdapter2 extends MouseAdapter {
    MousePressedDemo mousePressedDemo;

    public MyMouseAdapter2(MousePressedDemo mousePressedDemo) {
        this.mousePressedDemo = mousePressedDemo;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mousePressedDemo.msg = "mouse pressed";
        mousePressedDemo.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mousePressedDemo.msg = "mouse released";
        mousePressedDemo.repaint();
    }


}
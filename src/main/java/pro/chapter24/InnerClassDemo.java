package pro.chapter24;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerClassDemo extends Frame {
    String msg = "";

    public InnerClassDemo() {
        addMouseListener(new MyMouseAdapter3());
        addWindowListener(new MyWindowAdapter2());
    }

    class MyMouseAdapter3 extends MouseAdapter {
        @Override
        public void mouseReleased(MouseEvent e) {
            msg = "mouseReleased";
            repaint();
        }
        @Override
        public void mousePressed(MouseEvent e) {
            msg = "mousePressed";
            repaint();
        }
    }

    class MyWindowAdapter2 extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
    }

    public static void main(String[] args) {

        InnerClassDemo appwin = new InnerClassDemo();

        appwin.setSize(new Dimension(300, 300));
        appwin.setTitle("InnerClassDemo");
        appwin.setVisible(true);

    }


}

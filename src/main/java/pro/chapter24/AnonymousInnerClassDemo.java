package pro.chapter24;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnonymousInnerClassDemo extends Frame {
    String msg = "";


    public AnonymousInnerClassDemo() {
        // анонимный внутренний класс для обработки событий от нажатия кнопок мыши
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                msg = "mouse pressed, x = "+ e.getX() + ", y = " + e.getY();
                repaint();
            }
        });
        // анонимный внутренний класс для обработки событий при закрытии окна прикладной программы
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 80);
    }

    public static void main(String[] args) {
        AnonymousInnerClassDemo appwin = new AnonymousInnerClassDemo();
        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("AnonymousInnerClassDemo");
        appwin.setVisible(true);
    }
}

package pro.chapter24;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class AdapterDemo extends Frame {
    String msg = "";

    public AdapterDemo() {
        addMouseListener(new MyMouseAdapter(this));
        addMouseListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter());
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 80);
    }

    public static void main(String[] args) {
        AdapterDemo appwin = new AdapterDemo();

        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("AdapterDemo");
        appwin.setVisible(true);
    }

}

// обработать только события от щелчков кнопками мыши и перепещения мыши
class MyMouseAdapter extends MouseAdapter {
    AdapterDemo adapterDemo;

    public MyMouseAdapter(AdapterDemo adapterDemo) {
        this.adapterDemo = adapterDemo;
    }

    // обработка события щелчка мыши
    public void mouseClicked(MouseEvent me) {
        adapterDemo.msg = "клик мыши";
        adapterDemo.repaint();
    }

    // обработка события от перемещения
    public void mouseDragged(MouseEvent me) {
        adapterDemo.msg = "мышь перемещается";
        adapterDemo.repaint();
    }
}

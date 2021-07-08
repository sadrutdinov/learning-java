package pro.chapter24;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapterDemo extends Frame {
    String msg = "";


    public KeyAdapterDemo() {
        addKeyListener(new MyKeyAdapter(this));
        addWindowListener(new MyWindowAdapter());
    }


    public void print(Graphics g) {
        g.drawString(msg, 200, 200);
    }

    public static void main(String[] args) {
        KeyAdapterDemo keyAdapterDemo = new KeyAdapterDemo();
        keyAdapterDemo.setSize(new Dimension(1000, 1000));
        keyAdapterDemo.setTitle("TEST");
        keyAdapterDemo.setVisible(true);
    }




}


class MyKeyAdapter extends KeyAdapter {
    KeyAdapterDemo keyAdapterDemo;

    public MyKeyAdapter(KeyAdapterDemo keyAdapterDemo) {
        this.keyAdapterDemo = keyAdapterDemo;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                keyAdapterDemo.msg = "up";

                break;
            case KeyEvent.VK_DOWN:
                keyAdapterDemo.msg = "down";
                break;
        }
        keyAdapterDemo.repaint();

        //keyAdapterDemo.repaint();
    }
}

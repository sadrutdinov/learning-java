package pro.chapter27;

import pro.chapter24.AnonymousInnerClassDemo;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

public class SimpleImageLoad extends Frame {
    Image image;

    public SimpleImageLoad() {
        try {
            File imageFile = new File("src/main/resources/img.png");
            image = ImageIO.read(imageFile);
        }
        catch (IOException e) {
            System.out.println("не фортануло");
            System.exit(0);
        }

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.drawImage(image, getInsets().left, getInsets().top, null);
    }

    public static void main(String[] args) {
        SimpleImageLoad appwin = new SimpleImageLoad();
        appwin.setSize(new Dimension(400, 365));
        appwin.setTitle("SimpleImageLoad");
        appwin.setVisible(true);
    }
}

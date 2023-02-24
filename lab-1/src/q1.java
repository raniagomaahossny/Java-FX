import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.text.AttributedCharacterIterator;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class q1 {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("hallo ich Rania");
        Panel p = new Panel();
        f.setContentPane(p);
        f.setSize(400, 200);
        f.setVisible(true);

    }
}

class Panel extends JPanel implements Runnable {

    public Panel() {
        this.setBackground(Color.RED);
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.repaint();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString((AttributedCharacterIterator) new Date(), 100, 100);
    }
}
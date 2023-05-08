
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/*
 * IG : i_am_bnkt
 */
/**
 *
 * @author BNKT
 */
public class MyFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyClock clock = new MyClock();
//        CountTime time = new CountTime();
        Thread thread = new Thread(clock);
//        Thread thread = new Thread(time);
        thread.start();
        frame.setSize(450, 150);
//        frame.add(clock, BorderLayout.NORTH);
//        frame.add(time, BorderLayout.NORTH);
        frame.add(clock, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

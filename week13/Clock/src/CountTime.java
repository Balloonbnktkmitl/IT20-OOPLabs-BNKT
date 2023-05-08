
import javax.swing.JLabel;

/*
 * IG : i_am_bnkt
 */
/**
 *
 * @author BNKT
 */
public class CountTime extends JLabel implements Runnable {

    private int time;
    private static final long serialVersionUID = 7221938502976302688L;

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            int sec = time % 60;
            int min = (time / 60) % 60;
            int hour = (time / 3600) % 24;
            setFont(new java.awt.Font("Tahoma", 1, 85));
            setText(String.format("%02d:%02d:%02d", hour, min, sec));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            time++;
        }
    }
}

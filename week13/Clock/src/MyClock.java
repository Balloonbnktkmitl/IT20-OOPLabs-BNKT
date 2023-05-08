
import java.util.Calendar;
import javax.swing.JLabel;

/*
 * IG : i_am_bnkt
 */
/**
 *
 * @author BNKT
 */
public class MyClock extends JLabel implements Runnable {

    /**
     *
     */
    private static final long serialVersionUID = 7221938502976302688L;

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
            setFont(new java.awt.Font("Tahoma", 1, 85));
            setText(hour + ":" + min + ":" + sec);
            try {
                Thread.sleep(555555555);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

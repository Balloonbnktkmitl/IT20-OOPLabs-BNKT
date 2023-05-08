
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/*
 * IG : i_am_bnkt
 */
/**
 *
 * @author BNKT
 */
public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {
            new MDIFromGUI();
        });
    }
}

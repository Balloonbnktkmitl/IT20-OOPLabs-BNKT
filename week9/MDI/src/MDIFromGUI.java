/*
 * IG : i_am_bnkt
 */
import java.awt.*;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.*;

/**
 *
 * @author BNKT
 */
public class MDIFromGUI {

    private JFrame fr;
    private JDesktopPane dp;
    private JInternalFrame f1;
    private JInternalFrame f2;
    private JInternalFrame f3;
    private JMenuBar mb;
    private JMenu m1;
    private JMenu m2;
    private JMenu m3;
    private JMenu mi1;
    private JMenuItem mi2;
    private JMenuItem mi3;
    private JMenuItem mi4;
    private JMenuItem smi1;
    private JMenuItem smi2;
    private JLabel la1;
    private JLabel la2;
    private JLabel la3;

    public MDIFromGUI() {

        fr = new JFrame("SubMenuItem Demo");
        dp = new JDesktopPane();
        f1 = new JInternalFrame("Application 01", true, true, true, true);
        f2 = new JInternalFrame("Application 02", true, true, true, true);
        f3 = new JInternalFrame("Application 03", true, true, true, true);
        la1 = new JLabel();
        la2 = new JLabel();
        la3 = new JLabel();
        mb = new JMenuBar();

        m1 = new JMenu("File");

        mi1 = new JMenu("New");
        smi1 = new JMenuItem("Window");
        smi2 = new JMenuItem("Message");

        mi1.add(smi1);
        mi1.addSeparator();
        mi1.add(smi2);

        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");

        m1.add(mi1);
        m1.addSeparator();
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        m1.addSeparator();

        m2 = new JMenu("Edit");
        m3 = new JMenu("View");

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        fr.setJMenuBar(mb);

        f1.add(la1);
        f1.setSize(300, 300);
        f1.setLocation(200, 400);
        f1.setVisible(true);

        f2.add(la2);
        f2.setSize(300, 300);
        f2.setLocation(600, 200);
        f2.setVisible(true);

        f3.add(la3);
        f3.setSize(300, 300);
        f3.setLocation(1200, 400);
        f3.setVisible(true);

        dp.add(f1);
        dp.add(f2);
        dp.add(f3);

        dp.setBackground(Color.black);
        fr.add(dp, BorderLayout.CENTER);
        fr.setExtendedState(MAXIMIZED_BOTH);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}

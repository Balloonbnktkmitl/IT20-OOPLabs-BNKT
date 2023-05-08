
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

/*
 * IG : i_am_bnkt
 */
/**
 *
 * @author BNKT
 */
public class ChatDemo implements ActionListener, WindowListener {

    private JFrame fr;
    private JTextArea ta;
    private JTextField tf;
    private JButton btn1, btn2;
    private JPanel panel;
    private File file;

    public ChatDemo() {
        fr = new JFrame();
        ta = new JTextArea(20, 45);
        tf = new JTextField(45);
        btn1 = new JButton("Submit");
        btn2 = new JButton("Reset");

        fr.setLayout(new BorderLayout());
        ta.setEditable(false);
        fr.add(ta, BorderLayout.NORTH);
        fr.add(tf, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.add(btn1);
        panel.add(btn2);
        fr.add(panel, BorderLayout.SOUTH);
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);

        //File
        file = new File("ChatDemo.dat");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        fr.addWindowListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object sc = e.getSource();
        if (sc.equals(btn1)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss : ");
            ta.setText(ta.getText() + "\n" + dtf.format(LocalDateTime.now()) + tf.getText());
        } else if (sc.equals(btn2)) {
            ta.setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        String txt = "";
        try ( FileReader fr = new FileReader(file)) {
//            char[] txt = new char[(int) file.length()];
//            fr.read(txt);
//            ta.setText(new String(txt));
            int tmp;
            while ((tmp = fr.read()) != -1) {
                txt += (char) tmp;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        ta.setText(txt);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try ( FileWriter fw = new FileWriter(file)) {
            fw.write(ta.getText());
        } catch (IOException exx) {
            exx.printStackTrace();
        }
    }

    @Override
    public void windowClosed(WindowEvent e
    ) {
    }

    @Override
    public void windowActivated(WindowEvent e
    ) {
    }

    @Override
    public void windowDeactivated(WindowEvent e
    ) {
    }

    @Override
    public void windowDeiconified(WindowEvent e
    ) {
    }

    @Override
    public void windowIconified(WindowEvent e
    ) {
    }

}

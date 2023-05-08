/*
 * IG : i_am_bnkt
 */
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author BNKT
 */
public class CalculatorOneGUI {

    private JFrame fr;
    private JTextField text1;
    private JTextField text2;
    private JTextField text3;
    private JPanel panel;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;

    public CalculatorOneGUI() {
        fr = new JFrame("เครื่องคิดลข");
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        panel = new JPanel();
        btn1 = new JButton("plus");
        btn2 = new JButton("minus");
        btn3 = new JButton("multioly");
        btn4 = new JButton("divide");

        fr.setLayout(new GridLayout(4, 0));

        fr.add(text1);
        fr.add(text2);

        panel.setLayout(new FlowLayout());
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);

        fr.add(panel);
        fr.add(text3);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}

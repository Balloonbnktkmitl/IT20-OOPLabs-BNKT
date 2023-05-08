/*
 * IG : i_am_bnkt
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author BNKT
 */
public class CalculatorOneGUI implements ActionListener {

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
        text3.setEditable(false);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        double num1 = Double.parseDouble(text1.getText());
        double num2 = Double.parseDouble(text2.getText());
        double num3 = 0;
        if (ae.getSource().equals(btn1)) {
            num3 = num1 + num2;
        } else if (ae.getSource().equals(btn2)) {
            num3 = num1 - num2;
        } else if (ae.getSource().equals(btn3)) {
            num3 = num1 * num2;
        } else if (ae.getSource().equals(btn4)) {
            if (num1 == 0 && num2 == 0) {
                num3 = 0;
            } else {
                num3 = num1 / num2;
            }
        }
        text3.setText(String.valueOf(num3));
    }

}

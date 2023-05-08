/*
 * IG : i_am_bnkt
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import javax.swing.*;

/**
 *
 * @author BNKT
 */
public class CalculatorTwoGUI {
    
    private JFrame fr;
    private TextField tx1;
    private JPanel pa1;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn10;
    private JButton btn11;
    private JButton btn12;
    private JButton btn13;
    private JButton btn14;
    private JButton btn15;
    private JButton btn16;
    
    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        tx1 = new TextField();
        pa1 = new JPanel();
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn10 = new JButton("0");
        btn11 = new JButton("+");
        btn12 = new JButton("-");
        btn13 = new JButton("x");
        btn14 = new JButton("/");
        btn15 = new JButton("c");
        btn16 = new JButton("=");
        
        fr.setLayout(new BorderLayout());
        
        fr.add(tx1, BorderLayout.NORTH);
        
        pa1.setLayout(new GridLayout(4, 4));
        
        pa1.add(btn7);
        pa1.add(btn8);
        pa1.add(btn9);
        pa1.add(btn11);
        
        pa1.add(btn4);
        pa1.add(btn5);
        pa1.add(btn6);
        pa1.add(btn12);
        
        pa1.add(btn1);
        pa1.add(btn2);
        pa1.add(btn3);
        pa1.add(btn13);
        
        pa1.add(btn10);
        pa1.add(btn15);
        pa1.add(btn16);
        pa1.add(btn14);
        
        fr.add(pa1);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(500, 500);
        fr.setVisible(true);
    }
}

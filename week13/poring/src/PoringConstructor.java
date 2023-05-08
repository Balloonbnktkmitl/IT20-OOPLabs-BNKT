
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/*
 * IG : i_am_bnkt
 */
/**
 *
 * @author BNKT
 */
public class PoringConstructor implements ActionListener {

    private JFrame fr;
    private JButton btn;
    private ArrayList<Poring> poring;

    public PoringConstructor() {
        fr = new JFrame();
        btn = new JButton("Add");
        poring = new ArrayList<>();

        fr.setLayout(new FlowLayout());
        fr.add(btn);

        btn.addActionListener(this);

        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn)) {
            poring.add(new Poring(poring.size() + 1));
        }
    }

}

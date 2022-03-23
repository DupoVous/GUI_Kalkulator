import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator {
    private JPanel MainPanel;
    private JPanel topPanel;
    private JPanel buttonPanel;
    private JLabel prvniCislo;
    private JTextField prvni1Field;
    private JLabel dalsiCislo;
    private JLabel vysledneCislo;
    private JButton ADDButton;
    private JButton MODButton;
    private JButton VYMAZATButton;
    private JTextField dalsi2Field;
    private JTextField vysledek3Field;


    public Kalkulator() {
        ADDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String prvni1 = prvni1Field.getText().trim();
                String dalsi2 = dalsi2Field.getText().trim();
                double vysledek3 = Double.parseDouble(prvni1) + Double.parseDouble(dalsi2);
                vysledek3Field.setText(vysledek3 + "");

            }
        });

        MODButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String prvni1 = prvni1Field.getText().trim();
                String dalsi2 = dalsi2Field.getText().trim();
                double vysledek3 = Double.parseDouble(prvni1) % Double.parseDouble(dalsi2);
                vysledek3Field.setText(vysledek3 + "");

            }
        });


        VYMAZATButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prvni1Field.setText("");
                dalsi2Field.setText("");
                vysledek3Field.setText("");

            }
        });
    } // konec konstruktoru

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator");
        frame.setContentPane(new Kalkulator().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}    // konec prorgramu
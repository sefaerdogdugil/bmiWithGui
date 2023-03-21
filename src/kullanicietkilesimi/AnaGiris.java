package kullanicietkilesimi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnaGiris extends JFrame {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton hesaplaButton;
    private JTextField textField2;
    private JLabel weight;
    private JTextField resultField;
    private JLabel height;
    private JLabel bmiField;

    public AnaGiris() {
        setContentPane(mainPanel);

        hesaplaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double height = Double.parseDouble(textField1.getText());
                double weight = Double.parseDouble(textField2.getText());
                double bmi = weight / Math.pow(height / 100.0, 2);
                bmiField.setText(String.format("Vücut kitle endeksiniz: %.2f", bmi));
            }
        });
    }

    public static void main(String[] args) {
        AnaGiris frame = new AnaGiris();
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

package InterfaceGrafica.Calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {
    private JButton button1;
    private JTextField textField1;
    private float n1;
    private float n2;
    private JTextField textField2;
    private JComboBox comboBox1;
    private int comboIndex;
    private JPanel Calculadora;
    private JTextField textField3;

    public Calc() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                comboIndex = comboBox1.getSelectedIndex();
                float n1 = Float.parseFloat(textField1.getText());
                float n2 = Float.parseFloat(textField2.getText());
                float res;
                switch (comboIndex) {
                    case 1: res = n1 + n2;break;
                    case 2: res = n1 - n2;break;
                    case 3: res = n1 * n2;break;
                    case 4: res = n1 / n2;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + comboIndex);
                }
                textField3.setText(res+"");
            }
        });
    }

    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setContentPane(new Calc().Calculadora);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);
    }

    public void setData(Calc data) {
    }

    public void getData(Calc data) {
    }

    public boolean isModified(Calc data) {
        return false;
    }
}

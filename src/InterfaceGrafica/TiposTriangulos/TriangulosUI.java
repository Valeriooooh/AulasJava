package InterfaceGrafica.TiposTriangulos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TriangulosUI {
    private JPanel Triangulos;
    private JTextField lado1;
    private JButton calcularButton;
    private JTextField lado2;
    private JTextField lado3;

    public TriangulosUI() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                float l1 = Integer.parseInt(lado1.getText());

                float l2 = Integer.parseInt(lado2.getText());

                float l3 = Integer.parseInt(lado3.getText());

                if (l1 == l2 && l2 == l3) {
                    JOptionPane.showMessageDialog(null, "Triangulo Equilatero");
                } else if (l1 == l2 || l2 == l3) {
                    JOptionPane.showMessageDialog(null, "Triangulo Isosceles");
                } else {
                    JOptionPane.showMessageDialog(null, "Triangulo Escaleno");
                }

            }
        });

    }

    public static void main(String[] args) {
        try {
            JFrame janela = new JFrame();
            janela.setContentPane(new TriangulosUI().Triangulos);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.pack();
            janela.setVisible(true);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void setData(TriangulosCode data) {
    }

    public void getData(TriangulosCode data) {
    }

    public boolean isModified(TriangulosCode data) {
        return false;
    }
}

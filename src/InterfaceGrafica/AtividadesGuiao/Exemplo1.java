package InterfaceGrafica.AtividadesGuiao;

import javax.swing.JFrame;

public class Exemplo1 {
    public static void main(String[] args) {
        try {
            JFrame janela = new JFrame();
            janela.setTitle("Janela");
            // Point center =
            // GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
            int tamanhoX = 500;
            int tamanhoY = 500;
            janela.setSize(tamanhoX, tamanhoY);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // janela.setLocation(center.x - tamanhoX, center.y - tamanhoY);
            janela.setLocationRelativeTo(null);
            janela.setVisible(true);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            e.printStackTrace();
        }
    }
}

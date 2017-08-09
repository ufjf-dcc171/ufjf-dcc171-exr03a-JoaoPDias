package exercicio01;

import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] args) {
        while (true) {
            try {
                Float largura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Largura"));
                Float comprimento = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o Comprimento"));
                Float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Altura"));
                JOptionPane.showMessageDialog(null, "O volume do pacote é:" + largura*comprimento*altura,
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
                break;

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite os valores utilizando números inteiros ou decimais", "Entrada Inválida", JOptionPane.ERROR_MESSAGE);

            }
        }
    }
}

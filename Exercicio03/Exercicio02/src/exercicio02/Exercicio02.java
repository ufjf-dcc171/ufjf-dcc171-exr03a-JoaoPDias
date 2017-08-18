package exercicio02;

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
        Float largura, comprimento, altura;
        while (true) {
            try {
                Integer x1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o X do Ponto 1"));
                Integer y1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite  o Y do Ponto 1"));
                Integer x2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o X do Ponto 2"));
                Integer y2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Y do Ponto 2"));
                Double resultado = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2 - y1,2));
                JOptionPane.showMessageDialog(null, "A distância de um ponto ao outro é: " + resultado,
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite os valores utilizando números inteiros ou decimais", "Entrada Inválida", JOptionPane.ERROR_MESSAGE);

            } catch (NullPointerException ex) {
                break;
            }
        }
    }
}

package br.ufjf.dcc171;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Swing01 extends JApplet {

    public static void main(String[] args) {
        while (true) {
            try {
                Integer n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
                Integer n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));
                JOptionPane.showMessageDialog(null,
                        "A soma de " + n1 + " + " + n2 + " é: " + (n1 + n2),
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
                break;

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite um número inteiro para as duas opções", "Entrada Inválida", JOptionPane.ERROR_MESSAGE);

            }
        }
    }

}

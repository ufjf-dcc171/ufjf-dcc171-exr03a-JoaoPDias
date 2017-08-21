package exercicio03b;

import javax.swing.JFrame;

public class Exercicio03B {

    public static void main(String[] args) {
        JanelaCalculadora janela = new JanelaCalculadora();
        janela.setSize(300,300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}

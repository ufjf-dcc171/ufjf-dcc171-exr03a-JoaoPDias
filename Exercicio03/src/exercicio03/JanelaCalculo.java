package exercicio03;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class JanelaCalculo extends JFrame {

    private final JLabel etiqueta1;
    private final JLabel etiqueta2;
    private final JTextField coef1;
    private final JTextField coef2;
    private final JLabel etiqueta3;
    private final JTextField coef3;
    private final JLabel erro;
    private Double n1, n2, n3;

    public JanelaCalculo() throws HeadlessException {
        super("Equação do 2º Grau");
        this.etiqueta1 = new JLabel("\nCoeficiente 1: ");
        this.etiqueta2 = new JLabel("\nCoeficiente 2: \n");
        this.etiqueta3 = new JLabel("\nCoeficiente 3: \n");
        this.erro = new JLabel("");
        this.coef1 = new JTextField(8);
        this.coef2 = new JTextField(8);
        this.coef3 = new JTextField(8);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(etiqueta1);
        add(coef1);
        add(etiqueta2);
        add(coef2);
        add(etiqueta3);
        add(coef3);
        add(erro);
        coef1.requestFocus();
        coef1.addActionListener(new Coef1Enter());
        coef2.addActionListener(new Coef2Enter());
        coef3.addActionListener(new Equacao());

    }

    private class Coef1Enter implements ActionListener {

        public Coef1Enter() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                n1 = Double.parseDouble(coef1.getText());
                coef2.requestFocus();

            } catch (NumberFormatException ex) {
                erro.setText("Digite um valor válido para a 1ª parcela");
                coef1.requestFocus();
            }
        }
    }

    private static class Equacao implements ActionListener {

        public Equacao() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private class Coef2Enter implements ActionListener {

        public Coef2Enter() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                n1 = Double.parseDouble(coef1.getText());
                coef2.requestFocus();

            } catch (NumberFormatException ex) {
                erro.setText("Digite um valor válido para a 1ª parcela");
                coef1.requestFocus();
            }
        }

    }
}

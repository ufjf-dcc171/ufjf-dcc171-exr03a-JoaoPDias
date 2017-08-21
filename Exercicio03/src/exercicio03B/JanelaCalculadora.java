package exercicio03b;

import exercicio03A.JanelaCalculo;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class JanelaCalculadora extends JFrame {

    private final JLabel etiqueta1;
    private final JLabel etiqueta2;
    private final JTextField coef1;
    private final JTextField coef2;
    private final JButton soma;
    private final JButton multiplicacao;
    private final JButton divisao;
    private final JButton subtracao;
    private final JLabel erro;
    private final JLabel resultado;
    private Double x1, x2;

    public JanelaCalculadora() throws HeadlessException {
        super("Calculadora");
        this.etiqueta1 = new JLabel("Coeficiente 1: ");
        this.etiqueta2 = new JLabel("\nCoeficiente 2: \n");
        this.erro = new JLabel("");
        this.resultado = new JLabel("");
        this.coef1 = new JTextField(8);
        this.coef2 = new JTextField(8);
        this.soma = new JButton("Soma");
        this.multiplicacao = new JButton("Multiplicação");
        this.divisao = new JButton("Divisão");
        this.subtracao = new JButton("Subtração");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(etiqueta1);
        add(coef1);
        add(etiqueta2);
        add(coef2);
        add(soma);
        add(multiplicacao);
        add(divisao);
        add(subtracao);
        add(resultado);
        add(erro);
        coef1.requestFocus();
        coef1.addActionListener(new Coef1Enter());
        coef2.addActionListener(new Coef2Enter());
        Calculadora calc = new Calculadora();
        soma.addActionListener(calc);
        multiplicacao.addActionListener(calc);
        divisao.addActionListener(calc);
        subtracao.addActionListener(calc);

    }

    public class Coef1Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                x1 = Double.parseDouble(coef1.getText());
                coef2.requestFocus();

            } catch (NumberFormatException ex) {
                erro.setText("Digite um valor válido para o 1ª coeficiente");
                coef1.requestFocus();
            }

        }
    }

    public class Coef2Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                x2 = Double.parseDouble(coef2.getText());

            } catch (NumberFormatException ex) {
                erro.setText("Digite um valor válido para o 2ª coeficiente");
                coef2.requestFocus();
            }
        }

    }

    private class Calculadora implements ActionListener {

        public String adicao(Double x1, Double x2) {
            return Double.toString(x1 + x2);
        }

        public String subtracao(Double x1, Double x2) {
            return Double.toString(x1 - x2);
        }

        public String multiplicacao(Double x1, Double x2) {
            return Double.toString(x1 * x2);
        }

        public String divisao(Double x1, Double x2) {
            if (x2 == 0) {
                throw new ArithmeticException("Divisão por Zero!");
            }
            return Double.toString(x1 / x2);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            erro.setText("");
            if (e.getSource() == soma) {
                resultado.setText(this.adicao(x1, x2));
            } else if (e.getSource() == subtracao) {
                resultado.setText(this.subtracao(x1, x2));
            } else if (e.getSource() == multiplicacao) {
                resultado.setText(this.multiplicacao(x1, x2));

            } else if (e.getSource() == divisao) {
                try {
                    resultado.setText(this.divisao(x1, x2));

                } catch (ArithmeticException ex) {
                    erro.setText(ex.getMessage());
                }
            }
        }
    }

}

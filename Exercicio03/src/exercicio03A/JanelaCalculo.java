package exercicio03A;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaCalculo extends JFrame {

    private final JLabel etiqueta1;
    private final JLabel etiqueta2;
    private final JTextField coef1;
    private final JTextField coef2;
    private final JLabel etiqueta3;
    private final JLabel etiqueta4;
    private final JLabel etiqueta5;
    private final JTextField coef3;
    private final JLabel erro;
    private Double n1, n2, n3;

    public JanelaCalculo() throws HeadlessException {
        super("Equação do 2º Grau");
        this.etiqueta1 = new JLabel("Coeficiente 1: ");
        this.etiqueta2 = new JLabel("\nCoeficiente 2: \n");
        this.etiqueta3 = new JLabel("\nCoeficiente 3: \n");
        this.etiqueta4 = new JLabel("");
        this.etiqueta5 = new JLabel("");
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
        add(etiqueta4);
        add(etiqueta5);
        coef1.requestFocus();
        coef1.addActionListener(new Coef1Enter());
        coef2.addActionListener(new Coef2Enter());
        coef3.addActionListener(new Equacao());

    }

    public class Coef1Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                n1 = Double.parseDouble(coef1.getText());
                if(n1<=0){
                    throw new ArithmeticException("O valor do 1º Coeficiente deve ser maior que 0");
                }
                coef2.requestFocus();

            } catch (NumberFormatException ex) {
                erro.setText("Digite um valor válido para o 1ª coeficiente");
                coef1.requestFocus();
            }catch(ArithmeticException ex){
                erro.setText(ex.getMessage());
            }
            
        }
    }

    private class Equacao implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                n3 = Double.parseDouble(coef3.getText());
                try {
                    calcularEquacao();
                } catch (ArithmeticException ex) {
                    erro.setText(ex.getMessage());
                }
            } catch (NumberFormatException ex) {
                erro.setText("Digite um valor válido para o 3ª coeficiente");
                coef3.requestFocus();
            }
        }

        private void calcularEquacao() {
            Double delta, x1, x2;
            delta = (Math.pow(n2, 2) - 4 * n1 * n3);
            if (delta < 0) {
                throw new ArithmeticException("O Delta é negativo");
            }
            x1 = (-n2 + Math.sqrt(delta)) / 2 * n1;
            x2 = (-n2 - Math.sqrt(delta)) / 2 * n1;
            etiqueta4.setText(String.format("O valor do Delta é: %.1f. \n", delta));
            etiqueta5.setText(String.format("As raízes são:\n x1: %.1f\n x2: %.1f", x1, x2));

        }

    }

    public class Coef2Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                n2 = Double.parseDouble(coef2.getText());
                coef3.requestFocus();

            } catch (NumberFormatException ex) {
                erro.setText("Digite um valor válido para o 2ª coeficiente");
                coef2.requestFocus();
            }
        }

    }
}

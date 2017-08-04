
package br.ufjf.dcc171;

import br.ufjf.dcc171.modelo.Pessoa;
import java.util.Scanner;


public class Aula1Exm3 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        p1.setNome(sc.nextLine());
        System.out.println("Digite um ano de nascimento");
        p1.setAnoNascimento(sc.nextInt());
        System.out.println(p1);
    }
}

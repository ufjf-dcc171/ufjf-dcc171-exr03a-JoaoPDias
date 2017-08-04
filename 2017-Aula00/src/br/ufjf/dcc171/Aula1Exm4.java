/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc171;

import br.ufjf.dcc171.modelo.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ice
 */
public class Aula1Exm4 {

    public static void main(String[] args) {

        List<Pessoa> pessoas= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Pessoa p = new Pessoa();
            p.setNome("Pessoa" + i);
            p.setAnoNascimento(1990+i);
            pessoas.add(p);
        }
        pessoas.forEach((pessoa) -> {
            System.out.println(pessoa);
        });

    }
}

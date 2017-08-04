
package br.ufjf.dcc171.modelo;


public class Pessoa {
   String nome;
   Integer AnoNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoNascimento() {
        return AnoNascimento;
    }

    public void setAnoNascimento(Integer AnoNascimento) {
        this.AnoNascimento = AnoNascimento;
    }

    public Pessoa(String nome, Integer AnoNascimento) {
        this.nome = nome;
        this.AnoNascimento = AnoNascimento;
    }

    public Pessoa() {
        this(null,null);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", AnoNascimento=" + AnoNascimento + '}';
    }
    
    
    
   
    
}

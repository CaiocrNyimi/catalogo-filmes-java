package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos) {
        super(nome, anoDeLancamento, duracaoEmMinutos);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
    }

    @Override
    public int getClassificacao() {
        return (int) super.obterMediaDasAvaliacoes();
    }

    @Override
    public String toString() {
        return "Filme: " + super.toString();
    }
}

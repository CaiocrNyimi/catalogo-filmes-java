package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme extraordinario = new Filme("Extraordinário",
                2017, 111);
        Filme milagreCelaSete = new Filme("Milagre na Cela 7",
                2019, 132);
        Filme ACulpaEDasEstrelas = new Filme("A Culpa é das Estrelas",
                2014, 125);


        Serie laCasaDePapel = new Serie("La Casa de Papel",
        2017, 1050);
        laCasaDePapel.setTemporadas(5);
        laCasaDePapel.setEpisodiosPorTemporada(6);
        laCasaDePapel.setMinutosPorEpisodio(35);


        extraordinario.avalia(6.4);
        extraordinario.avalia(6.0);
        extraordinario.avalia(8.0);
        milagreCelaSete.avalia(5.2);
        ACulpaEDasEstrelas.avalia(6.7);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(extraordinario);
        listaDeFilmes.add(milagreCelaSete);
        listaDeFilmes.add(ACulpaEDasEstrelas);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);


    }
}
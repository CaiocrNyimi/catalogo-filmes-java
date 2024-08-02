package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme milagreCelaSete = new Filme("Milagre na Cela 7",
            2019, 132);
        milagreCelaSete.avalia(5.2);
        Filme aCulpaEDasEstrelas = new Filme("A Culpa é das Estrelas",
            2014, 125);
        aCulpaEDasEstrelas.avalia(6.7);
        Filme extraordinario = new Filme("Extraordinário",
                2017, 111);
        extraordinario.avalia(6.1);
        Serie laCasaDePapel = new Serie("La Casa de Papel",
                2017, 1050);





        List<Titulo> lista = new ArrayList<>();
        lista.add(extraordinario);
        lista.add(laCasaDePapel);
        lista.add(milagreCelaSete);
        lista.add(aCulpaEDasEstrelas);
        for (Titulo item : lista) {
            System.out.println(item);
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getSomaDasAvaliacoes));
        System.out.println(lista);
    }
}

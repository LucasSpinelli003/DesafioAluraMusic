package br.com.alura.audioapp.view;

import br.com.alura.audioapp.model.Audio;
import br.com.alura.audioapp.model.Musica;
import br.com.alura.audioapp.model.Podcast;

public class Main {
    public static void main(String[] args) {

        Audio a = new Musica("\"Teto - Minha vida é um filme\"",2.45);
        Musica b = new Musica("\"Matue - Conexões de Máfia\"",3.15);
        Podcast c = new Podcast("\"Podpah #1000 - NeymarJr\"",2000);
        //Testando Musica
        a.reproduzir();
        a.curtir();
        a.curtir();
        a.curtir();
        a.curtir();
        a.exibe();


        //Testando Podcast
        c.curtir();
        c.reproduzir();
        c.exibe();


    }
}

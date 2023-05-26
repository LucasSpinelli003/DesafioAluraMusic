package br.com.alura.audioapp.model;

import metodos.Classificacao;

public class Podcast extends Audio implements Classificacao {


    public Podcast(String titulo, double duracao) {
        super(titulo, duracao);
    }

    @Override
    public void exibe() {
        classifica();
        super.exibe();
    }

    @Override
    public void classifica() {
        if(getCurtidas()<=10){
            System.out.println("Adicione "+ getTitulo() + " a sua lista para ouvir depois.");
        }else if (getCurtidas()<=20){
            System.out.println("O podcast " + getTitulo() + " é recomendado para todos os públicos");
        }else{
            System.out.println("O podcast " + getTitulo() + " está no top 10 Brasil");
        }
    }
}

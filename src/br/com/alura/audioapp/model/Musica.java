package br.com.alura.audioapp.model;

import metodos.Classificacao;

public class Musica extends Audio implements Classificacao {
    public Musica(String titulo, double duracao) {
        super(titulo,duracao);
    }

    @Override
    public void exibe() {
        classifica();
        super.exibe();
    }

    @Override
    public void classifica() {
        if(getTotalReproducoes()<=10) {
            System.out.println("Adicione "+ getTitulo() + " a sua playlist para ouvir depois");
        }else if(getTotalReproducoes()<=20){
            System.out.println("A musica " + getTitulo() + " é recomendada a todos os publicos");
        }else{
            System.out.println("A musica " + getTitulo() + " está no Top 10 Mundo");
        }
    }
}

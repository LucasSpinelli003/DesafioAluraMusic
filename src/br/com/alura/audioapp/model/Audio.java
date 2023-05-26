package br.com.alura.audioapp.model;

import metodos.Classificacao;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;

    public Audio(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }


    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCurtidas() {
        return curtidas;
    }


    public void reproduzir(){
        if (totalReproducoes == 0){
            System.out.println("Você está reproduzindo agora " + titulo);
        }else{
        }
        totalReproducoes++;
    }

    public void curtir(){
        if (curtidas == 0){
            System.out.println("você curtiu " + titulo);
        }else{
        }
        curtidas++;
    }

    public void exibe(){
        System.out.println(titulo + " tem " + curtidas + " curtidas" );
        System.out.println(titulo + " tem " + totalReproducoes + " reproduções");
        System.out.println(titulo + " tem " + duracao + " minutos de duração");
        adicionarFavoritos();
    }

    Scanner leitor = new Scanner(System.in);
    public void adicionarFavoritos(){
        int favoritos = 0 ;
        System.out.println("Digite \"1\" se deseja adicionar aos favoritos: ");
        favoritos = leitor.nextInt();
        if (favoritos == 1){
            System.out.println(titulo + " foi adicionado aos favoritos\n");
        }else{}
    }
}

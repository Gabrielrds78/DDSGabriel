package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.enumeracoes_5_12;

public class Carta {
    private int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }
    public void imprimirCarta(){
        System.out.println("Sou " + numero + " de " + naipe + ".\nE tenho a cor " + naipe.getCor());
    }
}

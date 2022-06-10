package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_24_exercicio_interface_e_polimorfismo;

public class Imovel implements Seguravel{
    private double valorDoImovel;
    private double tamanhoDaContruido;

    public Imovel(double valorDoImovel, double tamanhoDaContruido) {
        this.valorDoImovel = valorDoImovel;
        this.tamanhoDaContruido = tamanhoDaContruido;
    }

    @Override
    public void obterDescricao() {
        System.out.println("Valor do imovel: " + this.valorDoImovel);
        System.out.println("Total da aera construida: " + this.tamanhoDaContruido + "m²");
    }

    @Override
    public double calcularValorApolice() {
        double calculo = this.valorDoImovel * 0.06;
        calculo += (tamanhoDaContruido * 0.2);
        return calculo;
    }
}

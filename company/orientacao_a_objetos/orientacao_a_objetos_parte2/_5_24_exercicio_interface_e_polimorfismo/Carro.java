package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_24_exercicio_interface_e_polimorfismo;

public class Carro implements Seguravel{
    private int anoDeFabricacao;
    private double valorDoModelo;
    private String modelo;

    public Carro(int anoDeFabricacao, double valorDoModelo, String modelo) {
        this.anoDeFabricacao = anoDeFabricacao;
        this.valorDoModelo = valorDoModelo;
        this.modelo = modelo;
    }

    @Override
    public void obterDescricao() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de fabricação: " + this.anoDeFabricacao);
        System.out.println("Valor do modelo: " + this.valorDoModelo);
    }

    @Override
    public double calcularValorApolice() {
        double calculo;
        calculo = this.valorDoModelo + (12 * 0.05);
        return calculo;
    }
}

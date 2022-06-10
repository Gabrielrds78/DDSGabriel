package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_24_exercicio_interface_e_polimorfismo;

public class CorretoraSeguros {
    public void fazerProposta(Seguravel seguravel){
        imprimirLinha();
        System.out.println("SEGURO PROPOSTO");
        seguravel.obterDescricao();
        System.out.println("Valor do seguro: " + seguravel.calcularValorApolice());
        imprimirLinha();
    }
    public void imprimirLinha(){
        System.out.println("==================================");
    }
}

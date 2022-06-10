package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_21_classes_abstratas;

public class ProdutoPerecivel extends Produto {
    String dataValidade;

    @Override
    public void imprimirDescricao() {
        System.out.println("Descrição: " + super.getDescricao() + ", vencendo em: " + dataValidade + ".");
    }
}

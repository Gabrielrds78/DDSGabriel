package com.company.orientacao_a_objetos.orientacao_a_objetos_parte1.Exercicio02;

public class  Estoque {
    public static Estoque estoque;
    Produto[] produtos;

    void listarProdutos(){
        System.out.println("\nProduto em estoque");
        System.out.println("--------------------");
        for (int i =0; i < produtos.length; i++) {
            produtos[i].descrever();
        }
    }
}

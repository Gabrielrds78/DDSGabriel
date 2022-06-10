package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.sobreposicao_5_16.Sobreposicao;

import java.util.Date;

public class TesteSobreposicao {
    public static void main(String[] args) {
        ProdutoPerecivel pp = new ProdutoPerecivel();
        pp.descricao = "carne";
        pp.dataDeValidade = new Date();
        pp.identificar();
    }
}

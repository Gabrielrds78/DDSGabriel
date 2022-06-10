package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.sobreposicao_5_16.Sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto{
    protected Date dataDeValidade;
    public void identificar(){
        System.out.println("Minha data de validade é: " + dataDeValidade);
    }
}

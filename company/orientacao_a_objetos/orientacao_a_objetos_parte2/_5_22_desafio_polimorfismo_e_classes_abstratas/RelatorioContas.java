package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_22_desafio_polimorfismo_e_classes_abstratas;

public class RelatorioContas {
    public void exibirListagem(Conta[] contas) {
        System.out.println("===[DETALHAMENTOS DAS CONTAS]===");
        for (int i = 0; i < contas.length; i++){
            System.out.println("============================");
            contas[i].exibirDetalhes();
            System.out.println("============================");
        }
    }
}

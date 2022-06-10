package com.company.orientacao_a_objetos._6_Topicos_Avancados._6_4_tratando_e_lancando_excecoes;

public class TesteExcecoes {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(100);
        try{
            cc.depositar(-10);
        } catch (IllegalArgumentException e){
            System.out.println("Voce executou uma operação ilegal: " + e.getMessage());
        }
    }
}

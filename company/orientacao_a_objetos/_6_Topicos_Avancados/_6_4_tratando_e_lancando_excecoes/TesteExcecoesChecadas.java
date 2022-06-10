package com.company.orientacao_a_objetos._6_Topicos_Avancados._6_4_tratando_e_lancando_excecoes;

public class TesteExcecoesChecadas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100);

        try {
            cc.sacar(60);
        }catch (SaldoInsuficienteException e){
            System.out.println("Saldo insuficiente.");
        }
        System.out.println("Saldo: " + cc.getSaldo());

        try {
            cc.sacar(50);
        } catch (SaldoInsuficienteException e){
            System.out.println("Desculpa, saldo insuficiente.");
        }
        finally {
            System.out.println("Obrigado por utilizat nosso sistema.");
        }
        System.out.println("Saldo agora: " + cc.getSaldo());
    }
}

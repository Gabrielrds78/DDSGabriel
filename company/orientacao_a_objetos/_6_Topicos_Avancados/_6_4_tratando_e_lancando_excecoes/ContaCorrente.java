package com.company.orientacao_a_objetos._6_Topicos_Avancados._6_4_tratando_e_lancando_excecoes;

public class ContaCorrente {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void  depositar(double deposito){
        if (deposito <= 0){
            throw new IllegalArgumentException("O valor não pode ser menor que zero (0).");
        }
        saldo += deposito;
        System.out.println(saldo);
    }
    public void sacar(double quantidade) throws SaldoInsuficienteException {
        double saldoTemp = saldo - quantidade;
        if (saldoTemp < 0){
            throw new SaldoInsuficienteException("Voce não possui saldo suficiente.");
        }
        saldo -= quantidade;
    }

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }
}

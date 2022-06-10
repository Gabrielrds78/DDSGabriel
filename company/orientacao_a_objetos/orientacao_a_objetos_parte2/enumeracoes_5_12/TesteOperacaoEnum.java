package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.enumeracoes_5_12;

public class TesteOperacaoEnum {
    public static void main(String[] args) {
        OperacaoAritimetica o1 =    OperacaoAritimetica.ADICAO;
        int resultado = o1.operacao(5, 3);
        System.out.println("O resultado é: " + resultado);
    }
}

package com.company.orientacao_a_objetos._6_Topicos_Avancados._6_topicos_avancados_6_2_java_lang_math._6_3_desafio_classe_java_lang_math;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos jogos?");
        int quantidadeJogos = entrada.nextInt();

        System.out.println("-------------------------");

        for (int i = 1; i <= quantidadeJogos; i++){
            MegaSena mega = new MegaSena();
            mega.sortear();
            mega.exibirNumeros();
            System.out.println("---------------------");
        }

        System.out.println("*** Boa sorte! ***");
    }
}

package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.modificadores_static_e_final;

import java.util.Scanner;

public class TesteContador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contador c = new Contador();
        System.out.println("Até quanto deseja contar?");
        int contarAte = scanner.nextInt();
        for (int i = 0; i <= contarAte; i++){
            Contador.imprimirContador();
        }

    }
}

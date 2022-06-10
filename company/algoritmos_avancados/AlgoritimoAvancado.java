package com.company.algoritmos_avancados;

import java.util.Scanner;

public class AlgoritimoAvancado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaAlunos lista = new ListaAlunos();

        while (true) {
            Aluno aluno = new Aluno();
            System.out.println("Nome do Aluno:");
            aluno.nome = scanner.nextLine();
            lista.adicionar(aluno);
            if ("x".equalsIgnoreCase(aluno.nome)) {
                break;
            }
        }
        for (int i = 0; i < lista.tamanho(); i++) {
            Aluno a = lista.obter(i);
            System.out.println("Aluno: " + a.nome);
        }
    }

}
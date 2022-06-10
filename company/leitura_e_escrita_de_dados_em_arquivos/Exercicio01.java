package com.company.leitura_e_escrita_de_dados_em_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        System.out.println("---[ ESCREVA OS ITENS DA LISTA ]---");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "º Tarefa da lista:");
            String itens = scanner.nextLine();
            lista.add(itens);
        }
        Path arquivo = Paths.get("C:\\Users\\aluno.LABCETEC\\Desktop\\Lista_de_Tarefas.txt");
        Files.write(arquivo, lista);

        scanner.close();
        System.err.print("Salvando Lista...");
    }
}

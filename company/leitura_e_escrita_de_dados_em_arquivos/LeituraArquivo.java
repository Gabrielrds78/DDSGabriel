package com.company.leitura_e_escrita_de_dados_em_arquivos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivo {

    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("C:\\Users\\aluno.LABCETEC\\Desktop\\arquivo.txt");
        List<String> linhas = Files.readAllLines(arquivo);

        for (int i = 0; i < linhas.size(); i++) {
            String linhasDoArquivo = linhas.get(i);
            System.out.println(i+1 + "º: " + linhasDoArquivo);
        }

    }
}

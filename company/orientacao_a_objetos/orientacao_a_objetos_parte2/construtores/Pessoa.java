package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.construtores;

public class Pessoa {
    String nome;
    int idade;
    String cpf;
    String sexo;

    public Pessoa(String nome) {

        this.nome = nome;
    }

    public Pessoa(String nome, int idade) {
        this(nome);
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, String cpf) {
        this(nome, idade);
        this.cpf = cpf;
    }

    public Pessoa(String nome, int idade, String cpf, String sexo) {
        this(nome, idade, cpf);
        this.sexo = sexo;
    }
}


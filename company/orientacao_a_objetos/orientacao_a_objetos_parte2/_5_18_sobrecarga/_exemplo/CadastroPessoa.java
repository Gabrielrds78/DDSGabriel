package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_18_sobrecarga._exemplo;

public class CadastroPessoa {
    public void cadastrar(Pessoa pessoa ){
        armazenar(pessoa.getNome(), pessoa.getIdade());
    }
    public void cadastrar(String nome, int idade){
        armazenar(nome, idade);
    }
    public void cadastrar(String nome){
        armazenar(nome);
    }
    private void armazenar(String nome, int idade) {
            System.out.println("Salvando: \"" + nome + "\" com " + idade + " anos.");
    }
    private void armazenar(String nome){
        System.out.println("Salvando: \"" + nome + "\", idade não informada.");
    }
}

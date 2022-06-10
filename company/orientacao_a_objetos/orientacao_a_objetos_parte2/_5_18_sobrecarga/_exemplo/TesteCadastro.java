package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_18_sobrecarga._exemplo;

public class TesteCadastro {
    public static void main(String[] args) {
        CadastroPessoa cadastro = new CadastroPessoa();
        Pessoa pessoa = new Pessoa("Pedro", 18);
        cadastro.cadastrar(pessoa);
        cadastro.cadastrar("Maria", 25);
        cadastro.cadastrar("João");

    }
}

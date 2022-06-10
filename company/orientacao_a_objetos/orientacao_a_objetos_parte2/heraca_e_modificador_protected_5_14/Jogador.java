package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.heraca_e_modificador_protected_5_14;

public class Jogador extends Pessoa {
    public Jogador(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    protected boolean aindaJoga = false;
    public void dizerSeAindaNao(){
        System.out.println("Ainda joga? " + aindaJoga);
    }
}

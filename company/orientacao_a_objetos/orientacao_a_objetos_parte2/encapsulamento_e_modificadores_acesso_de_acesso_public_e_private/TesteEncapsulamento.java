package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.encapsulamento_e_modificadores_acesso_de_acesso_public_e_private;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.trocarTemperatura(21);
        System.out.println("A temperatura atual do ar é de: " + ar.imprimirTemperatura());
    }
}

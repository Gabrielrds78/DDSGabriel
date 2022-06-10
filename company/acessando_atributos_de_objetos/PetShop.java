package com.company.acessando_atributos_de_objetos;

public class PetShop {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
    cachorro.nome = "bidu";
    cachorro.idade = 9;
    cachorro.raca = "Boxer";
    cachorro.sexo = 'M';

        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Idade: " + cachorro.idade);
        System.out.println("Raça: " + cachorro.raca);
        System.out.println("Sexo: " + cachorro.sexo);

    Cachorro cachorro1 = new Cachorro();
    cachorro1.sexo = 'F';
    cachorro1.nome = "Kissi";
    cachorro1.raca = "Boxer";
    cachorro1.idade = 5;
        System.out.println();
        System.out.println("Nome: " + cachorro1.nome);
        System.out.println("Idade: " + cachorro1.idade);
        System.out.println("Raça: " + cachorro1.raca);
        System.out.println("Sexo: " + cachorro1.sexo);
    }
}

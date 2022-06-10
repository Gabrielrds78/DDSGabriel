package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.construtores;

public class TesteConstrutor {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João");
        System.out.println("Nome: \"" + p1.nome + "\"" + "\nTem: " + p1.idade + "anos");
        imprimirtraco();
        Pessoa p2 = new Pessoa("Maria", 22);
        System.out.println("Nome: \"" + p2.nome + "\"" + "\ntem " + p2.idade + " anos.");
        imprimirtraco();
        Pessoa p3 = new Pessoa("Pedro", 15,"87654354");
        System.out.println("Nome: \"" + p3.nome + "\"" + "\ntem " + p3.idade + " anos " + "\ncpf: " + p3.cpf);
        imprimirtraco();
        Pessoa p4 = new Pessoa("Thiago", 18, "777.888.999-10", "Masculino");
        System.out.println("Nome: \"" + p3.nome + "\"" + "\ntem " + p3.idade + " anos " + "\ncpf: " + p3.cpf + "\nSexo: " + p4.sexo);

    }
    static void imprimirtraco(){
        System.out.println("--------------------------");
    }
}

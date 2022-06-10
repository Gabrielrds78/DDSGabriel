package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_24_exercicio_interface_e_polimorfismo;

import java.util.Scanner;

public class Principal {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    CorretoraSeguros corretoraSeguros = new CorretoraSeguros();
    Seguravel carro = new Carro(2010, 69.710, "Civic");
    corretoraSeguros.fazerProposta(carro);
    Seguravel imovel = new Imovel(100000,20);
    corretoraSeguros.fazerProposta(imovel);



    }
}


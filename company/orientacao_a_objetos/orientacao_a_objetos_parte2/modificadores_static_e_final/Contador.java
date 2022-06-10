package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.modificadores_static_e_final;

public class Contador {
    public static int COUNT = 0;
    public static final double PI = 3.14;
    public void incrementar(){
        COUNT++;
    }
    public static void imprimirContador(){
        COUNT++;
        System.out.println("O valor do contador agora é: " + Contador.COUNT);
    }
}

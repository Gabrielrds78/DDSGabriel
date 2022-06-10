package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.modificadores_static_e_final.Desafio;

public class MatematicaUtil {
    public static final double PI = 3.14;
    public static int calcularFibonacci(int posicao){
        if (posicao < 2){
            return posicao;
        }
        return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao -2);
    }
    public static double calcularAreaCirculo(double raio){
        return  raio * raio * MatematicaUtil.PI;
    }
}

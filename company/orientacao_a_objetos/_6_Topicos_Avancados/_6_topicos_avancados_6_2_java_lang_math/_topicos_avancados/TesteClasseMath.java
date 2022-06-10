package com.company.orientacao_a_objetos._6_Topicos_Avancados._6_topicos_avancados_6_2_java_lang_math._topicos_avancados;

import static java.lang.Math.*;

public class TesteClasseMath {

    public static void main(String[] args) {
        imprimir();
        //Comprimento de uma circuferencia 2 x r x PI(3,14)
        int raio = 4;
        double comprimento = 2 * raio * PI;
        System.out.println("Comprimento: " + comprimento);
        imprimir();
        //Máximo e minimo
        double[] precosProdutoA = {30.20, 25.49};
        double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
        System.out.println("Maior preço: " + maiorPreco);
        System.out.println("Menor preço: " + min(precosProdutoA[0], precosProdutoA[1]));
        imprimir();
        //Potêcia
        System.out.println("2³: " + Math.pow(2,3));
        imprimir();
        //Raiz
        System.out.println("Raiz de 9: " + Math.sqrt(9));
        imprimir();
        //Arredondamento ceil, floor e round
        double n = 5.4;
        System.out.println("Menor inteiro: " + Math.floor(n));
        System.out.println("Maior inteiro: " + Math.ceil(n));
        System.out.println("Arredondamento natural: " + Math.round(n));
        imprimir();
        //TRIGONOMETRIA
        System.out.println("Seno: " + Math.signum(40));
        imprimir();
        //Numeros randomicos
        double numeroAleatorio = Math.random() * 100;
        System.out.println("numero aleatorio: " + numeroAleatorio);
        imprimir();
    }
    public static void imprimir(){
        System.out.println("================================================================");
        System.out.println();
    }
}

package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.modificadores_static_e_final.Desafio;

    public class TesteMatematica {

        public static void main(String[] args) {
            int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
            System.out.println("Número de Fibonacci da posição 8: " + numeroFibonacci);
            double areaCirculo = MatematicaUtil.calcularAreaCirculo(104.8);
            System.out.println("Área do círculo: " + areaCirculo);
        }
    }


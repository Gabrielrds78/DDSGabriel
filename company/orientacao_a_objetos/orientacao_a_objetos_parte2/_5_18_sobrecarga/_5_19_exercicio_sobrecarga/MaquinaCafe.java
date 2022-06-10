package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_18_sobrecarga._5_19_exercicio_sobrecarga;

public class MaquinaCafe {
     int acucarDisponivel;

   void fazerCafe(int quantidadeAcucar) {
        if (acucarDisponivel < quantidadeAcucar){
            System.out.println("Não há acucar suficiente para fazer seu café.");
        } else {
            acucarDisponivel -= quantidadeAcucar;
            System.out.println("Fazendo café com " + quantidadeAcucar + " gramas de acucar.");
        }
    }
    void fazerCafe() {
        fazerCafe(10);
    }
}

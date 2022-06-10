package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_18_sobrecarga._5_19_exercicio_sobrecarga;

public class TesteMaquinaCafe {
    public static void main(String[] args) {
        MaquinaCafe cafe = new MaquinaCafe();
        cafe.acucarDisponivel = 30;
        cafe.fazerCafe(10);
        cafe.fazerCafe(15);
        cafe.fazerCafe();
    }
}

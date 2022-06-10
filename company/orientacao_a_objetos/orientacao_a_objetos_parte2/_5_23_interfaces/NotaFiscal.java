package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_23_interfaces;

public class NotaFiscal implements Imprimivel, EnviavelPorEmail{
    private int numero;

    public NotaFiscal(int numero) {
        this.numero = numero;
    }

    @Override
    public void enviar(String email) {
        System.out.println("Enviando a nota de número: " + numero + " para o e-mail: " + email);
    }
    @Override
    public void imprimir() {
        System.out.println("Vamos imprimir essa nota de número: " + numero);
    }

    public void adicionarPedido(String produto) {

    }
}

package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_22_desafio_polimorfismo_e_classes_abstratas;

public class ContaReceber extends Conta {
    private Cliente cliente;

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Conta a receber");
        System.out.println("=======================");
        System.out.println("Cliente: " + this.getCliente().getNome());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Vencimento: " + this.getDataDeVencimento());
        System.out.println("Situação: " + this.getSituacaoConta());
        System.out.println("========================");
        System.out.println();
    }

    public ContaReceber(){
    }
    public ContaReceber(Cliente cliente, String descricao, double valor, String dataDeVencimento) {
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataDeVencimento(dataDeVencimento);
    }

    void cancelar() {
        if (getValor() >= 50000) {
            System.err.println("Conta não pode ser cancelada, por valor muito alto.");
        } else {
            super.cancelar();
        }
    }

    public void receber() {
        if (SituacaoConta.PAGA.equals(getSituacaoConta()) || SituacaoConta.CANCELADA.equals(getSituacaoConta())){
            System.out.println("Conta não pode ser recebida: " + this.getDescricao());
        } else {
            System.out.println("Recebendo conta " + this.getDescricao() + " no valor de " + this.getValor() +
                    " e vencimento: " + this.getDataDeVencimento() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }
}
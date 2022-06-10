package com.company.orientacao_a_objetos._6_Topicos_Avancados._6_5_desafio_excecoes;

public class ContaReceber extends Conta {
    private Cliente cliente;

    public ContaReceber(){

    }
    public ContaReceber(Cliente cliente, String descricao, double valor, String dataDeVencimento) {
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataDeVencimento(dataDeVencimento);
    }

    void cancelar() throws OperacaoContaException {
        if (getValor() >= 50000) {
            throw new OperacaoContaException("Não pode cancelar conta já " + this.getSituacaoConta());
        } else {
            super.cancelar();
        }
    }

    public void receber() throws OperacaoContaException {
        if (SituacaoConta.PAGA.equals(getSituacaoConta())|| SituacaoConta.CANCELADA.equals(getSituacaoConta())){
            throw new OperacaoContaException("Não pode receber conta já " + this.getSituacaoConta());
        } else {
            System.out.println("Recebendo conta " + this.getDescricao() + " no valor de " + this.getValor() +
                    " e vencimento: " + this.getDataDeVencimento() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }
}

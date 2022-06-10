package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.sobreposicao_5_16.desafio_heranca_e_sobreposicao_5_17.atividade;

public class ContaReceber extends Conta{
    private Cliente cliente;

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
        if (SituacaoConta.PAGA.equals(getSituacaoConta())||SituacaoConta.CANCELADA.equals(getSituacaoConta())){
            System.out.println("Conta não pode ser recebida: " + this.getDescricao());
        } else {
            System.out.println("Recebendo conta " + this.getDescricao() + " no valor de " + this.getValor() +
                    " e vencimento: " + this.getDataDeVencimento() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }
}

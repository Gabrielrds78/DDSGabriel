package com.company.orientacao_a_objetos._6_Topicos_Avancados._6_5_desafio_excecoes;

public class ContaPagar extends Conta {

    private Fornecedor fornecedor;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public ContaPagar(){

    }
    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataDeVencimento) {
        this.fornecedor = fornecedor;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataDeVencimento(dataDeVencimento);
    }

    void pagar() throws OperacaoContaException {

        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            throw new OperacaoContaException("Não pode pagar conta já " + this.getSituacaoConta());
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            throw new OperacaoContaException("Não pode pagar conta já " + this.getSituacaoConta());
        } else {
            System.out.println("Pagando conta " + this.getDescricao() +
                    "no valor de " + this.getValor() +
                    "e vencimento em " + this.getDataDeVencimento() +
                    "do fornecedor " + this.fornecedor.getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }
}


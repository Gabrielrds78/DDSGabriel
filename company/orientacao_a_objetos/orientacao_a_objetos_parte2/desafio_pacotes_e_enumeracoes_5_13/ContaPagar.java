package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.desafio_pacotes_e_enumeracoes_5_13;

public class ContaPagar {

    String descricao;
    Double valor;
    String dataDeVencimento;

    private SituacaoConta situacaoConta;

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    Fornecedor fornecedor = new Fornecedor();

    String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    double getValor() {

        return valor;
    }

    public void setValor(Double valor) {

        this.valor = valor;
    }

    String getDataDeVencimento() {

        return dataDeVencimento;
    }

    public void setDataVencimento(String dataDeVencimento) {

        this.dataDeVencimento = dataDeVencimento;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor.nome = fornecedor.nome;
    }

    public Fornecedor getFornecedor() {

        return fornecedor;
    }

    public ContaPagar() {
        this.situacaoConta = SituacaoConta.PENDENTE;
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataDeVencimento) {
        this();
        this.descricao = descricao;
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
        this.fornecedor.nome = fornecedor.nome;
    }


    void pagar() {

        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.err.println("Não pode pagar uma conta que já esta paga: " + this.getSituacaoConta() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.err.println("Não pode pagar uma conta cancelada: " + this.getSituacaoConta() + ".");
        } else {
            System.out.println("Pagando conta " + this.getDescricao() +
                    "no valor de " + this.getValor() +
                    "e vencimento em " + this.getDataDeVencimento() +
                    "do fornecedor " + this.getFornecedor().getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }

    void cancelar() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta()) || SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.err.println("Conta não pode ser cancelada.");
        } else {
            this.situacaoConta = SituacaoConta.CANCELADA;
            System.err.println("Conta foi cancelada com sucesso!!");
        }
    }
}


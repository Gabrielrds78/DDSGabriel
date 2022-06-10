package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_22_desafio_polimorfismo_e_classes_abstratas;

public abstract class Conta {
    private String descricao;
    private Double valor;
    private String dataDeVencimento;

public abstract void exibirDetalhes();

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    protected SituacaoConta situacaoConta;
    protected Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    public Conta() {
        this.situacaoConta = SituacaoConta.PENDENTE;
    }

    void cancelar() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta()) || SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.err.println("Conta não pode ser cancelada.");
        } else {
            this.situacaoConta = SituacaoConta.CANCELADA;
            System.err.println("Cancelando conta do mês.");
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }
}

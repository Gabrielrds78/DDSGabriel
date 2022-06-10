package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_22_desafio_polimorfismo_e_classes_abstratas;

public class ContaPagar extends Conta {

    private Fornecedor fornecedor;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Fornecedor: " + this.getFornecedor().getNome());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Data de Vencimento: " + this.getDataDeVencimento());
    }

    public ContaPagar(){

    }
    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataDeVencimento) {
        this.fornecedor = fornecedor;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataDeVencimento(dataDeVencimento);
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
                    "do fornecedor " + this.fornecedor.getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }
}


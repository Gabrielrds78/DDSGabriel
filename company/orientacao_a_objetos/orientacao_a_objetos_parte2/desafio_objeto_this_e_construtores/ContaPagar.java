package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.desafio_objeto_this_e_construtores;

public class ContaPagar {

    String descricao;
    Double valor;
    String dataDeVencimento;

    Fornecedor fornecedor = new Fornecedor();

    String getDescricao (){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    double getValor(){
        return valor;
    }
    public void setValor(Double valor){
        this.valor = valor;
    }
    String getDataDeVencimento(){
        return dataDeVencimento;
    }
    public void setDataDeVencimento(String dataDeVencimento){
        this.dataDeVencimento = dataDeVencimento;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor.nome = fornecedor.nome;
    }
    public Fornecedor getFornecedor(){
        return fornecedor;
    }

public ContaPagar (){

}
public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataDeVencimento){
    this();
    this.descricao = descricao;
    this.valor = valor;
    this.dataDeVencimento = dataDeVencimento;
    this.fornecedor.nome = fornecedor.nome;
}


    void pagar() {
        System.out.println("-----==[NOTA FISCAL]==-----");
        System.out.println("Fornecedor: " + this.getFornecedor().getNome());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Data de Vencimento: " + this.getDataDeVencimento());
        System.out.println();
    }
}

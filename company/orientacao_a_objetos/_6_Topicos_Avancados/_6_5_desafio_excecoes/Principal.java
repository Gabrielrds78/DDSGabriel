package com.company.orientacao_a_objetos._6_Topicos_Avancados._6_5_desafio_excecoes;

public class Principal {
    public static void main(String[] args) {
        // instanciando fornecedores
        Fornecedor imobiliaria = new Fornecedor();
        imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
        Fornecedor mercado = new Fornecedor();
        mercado.setNome("Mercado do João");
        // instanciando clientes
        Cliente atacadista = new Cliente();
        atacadista.setNome("Triângulo Quadrado Atacadista");
        Cliente telecom = new Cliente();
        telecom.setNome("FoneNet Telecomunicações");
        // instanciando contas a pagar
        ContaPagar contaPagar1 = new ContaPagar();
        contaPagar1.setDescricao("Aluguel da matriz");
        contaPagar1.setValor(1230d);
        contaPagar1.setDataDeVencimento("10/05/2012");
        contaPagar1.setFornecedor(imobiliaria);
        ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");
        // instanciando contas a receber
        ContaReceber contaReceber1 = new ContaReceber();
        contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
        contaReceber1.setValor(89500d);
        contaReceber1.setDataDeVencimento("23/05/2012");
        contaReceber1.setCliente(atacadista);
        ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online", 53200d, "13/05/2012");
        // pagamento e cancelamento de contas a pagar
        try {
            contaPagar1.pagar();
        } catch (OperacaoContaException e){
            System.out.println(e.getMessage());
        }
        try {
            contaPagar2.cancelar();
        } catch (OperacaoContaException e){
            System.out.println(e.getMessage());
        } try {
            contaReceber1.receber();
        } catch (OperacaoContaException e){

        } try {
            contaReceber2.cancelar();
        } catch (OperacaoContaException e){
            System.out.println(e.getMessage());
        } try {
            contaReceber2.cancelar();
        } catch (OperacaoContaException e){
            System.out.println(e.getMessage());
        }
    }
}
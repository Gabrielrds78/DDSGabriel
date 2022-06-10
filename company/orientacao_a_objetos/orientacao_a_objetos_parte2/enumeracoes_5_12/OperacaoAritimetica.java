package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.enumeracoes_5_12;

public enum OperacaoAritimetica {
    ADICAO {
        public int operacao(int x, int y){
            return x + y;
        }
    },
    SUBTRACAO {
        public int operacao(int x, int y){
            return x - y;
        }
    };
    public abstract int operacao(int x, int y);
}

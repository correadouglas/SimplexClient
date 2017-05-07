/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplex;

/**
 *
 * Pontificia Universidade Catolica de Minas Gerais. 
 * Otimizacao de Sistemas Computacionais.
 *
 * Implementacao Simplex Client.
 *
 * Douglas Henrique Silva Correa. 
 * Guilherme Silva Santos. 
 * Mateus Felipe Martins Miranda.
 *
 */
public enum SimplexSinaisEnum {
    
    IGUAL(1, "="),
    MAIOR_QUE(2, ">="),
    MENOR_QUE(3, "<=");
    
    private int valor;
    
    private String descricao;

    /**
     * cosntrutor padrao.
     * 
     * @param valor 
     */
    private SimplexSinaisEnum(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

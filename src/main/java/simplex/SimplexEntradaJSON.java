/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplex;

import com.google.gson.Gson;

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
public class SimplexEntradaJSON {

    private int objetivo;
    private double[] funcaoObjetivo;
    private double[][] restricoes;
    private double[] sinaisRestricoes;
    private double[] b;

    /**
     * construtor padrao.
     *
     * @param objetivo
     * @param funcaoObjetivo
     * @param restricoes
     * @param sinaisRestricoes
     * @param b
     */
    public SimplexEntradaJSON(int objetivo, double[] funcaoObjetivo, double[][] restricoes, double[] sinaisRestricoes, double[] b) {
        this.objetivo = objetivo;
        this.funcaoObjetivo = funcaoObjetivo;
        this.restricoes = restricoes;
        this.sinaisRestricoes = sinaisRestricoes;
        this.b = b;
    }

    public String getJSON() {
        SimplexEntradaJSON entrada = new SimplexEntradaJSON(this.objetivo, this.funcaoObjetivo, this.restricoes, this.sinaisRestricoes, this.b);
        Gson gson = new Gson();
        return gson.toJson(entrada);
    }

    public int getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(int objetivo) {
        this.objetivo = objetivo;
    }

    public double[] getFuncaoObjetivo() {
        return funcaoObjetivo;
    }

    public void setFuncaoObjetivo(double[] funcaoObjetivo) {
        this.funcaoObjetivo = funcaoObjetivo;
    }

    public double[][] getRestricoes() {
        return restricoes;
    }

    public void setRestricoes(double[][] restricoes) {
        this.restricoes = restricoes;
    }

    public double[] getSinaisRestricoes() {
        return sinaisRestricoes;
    }

    public void setSinaisRestricoes(double[] sinaisRestricoes) {
        this.sinaisRestricoes = sinaisRestricoes;
    }

    public double[] getB() {
        return b;
    }

    public void setB(double[] b) {
        this.b = b;
    }
}

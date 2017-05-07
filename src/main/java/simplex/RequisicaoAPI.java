/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * Pontificia Universidade Catolica de Minas Gerais. Otimizacao de Sistemas
 * Computacionais.
 *
 * Implementacao Simplex Client.
 *
 * Douglas Henrique Silva Correa. 
 * Guilherme Silva Santos. 
 * Mateus Felipe Martins Miranda.
 *
 */
public class RequisicaoAPI {

    private static final String LINK = "http://localhost:8080/simplex";

    /**
     * metodo que faz a requisicao para a API do simplex.
     * 
     * @param JSON
     * @return
     * @throws MalformedURLException
     * @throws IOException 
     */
    public static String requestPOST(String JSON) throws MalformedURLException, IOException {

        String retorno = null;

        URL url = new URL(LINK);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setConnectTimeout(5000);//5 secs
        connection.setReadTimeout(5000);//5 secs

        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");

        OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
        out.write(JSON);
        out.flush();
        out.close();

        int res = connection.getResponseCode();

        System.out.println(res);

        InputStream is = connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            retorno = line;
        }
        connection.disconnect();

        return retorno;
    }
    
    /**
     * main criado para testar integracao com a api.
     * 
     * @param args 
     */
    public static void main(String[] args) throws IOException {
        // setando variaveis de teste
        int objetivo = SimplexObjetivoEnum.MAXIMO.getValor();
	double[] funcaoObjetivo = { 80, 60 };
        double[][] restricoes = { { 4, 6 }, { 4, 2 }, { 0, 1 } };
	double[] sinaisRestricoes = { SimplexSinaisEnum.MAIOR_QUE.getValor(), 
                                      SimplexSinaisEnum.MENOR_QUE.getValor(), 
                                      SimplexSinaisEnum.MENOR_QUE.getValor() };
	double[] b = { 24, 16, 3 };
        
        // criando objeto de entrada para a api
        SimplexEntradaJSON entrada = new SimplexEntradaJSON(objetivo, funcaoObjetivo, restricoes, sinaisRestricoes, b);
        
        // chamada a api
        String saida = requestPOST(entrada.getJSON());
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.es.vaimeufilho;

import java.util.HashMap;

/**
 *
 * @author 1998547
 */
public class Calculadora {

    private HashMap<String, Integer> mapaNumeros;

    public Calculadora() {
        mapaNumeros = new HashMap<String, Integer>();
        mapaNumeros.put("I", 1);
        mapaNumeros.put("V", 5);
        mapaNumeros.put("X", 10);
        mapaNumeros.put("L", 50);
        mapaNumeros.put("C", 100);
        mapaNumeros.put("D", 500);
        mapaNumeros.put("M", 1000);

        System.out.println("Resposta: " + calcular("MMXVIII"));
    }

    public int calcular(String numeroRomano) {

        if (mapaNumeros.containsKey(numeroRomano)) {
            return mapaNumeros.get(numeroRomano);
        } else {

            int corrente;
            int anterior;
            int resultado = mapaNumeros.get(String.valueOf(numeroRomano.charAt(numeroRomano.length() - 1))); //Inicia com o valor do primeiro dígito

            for (int iterador = numeroRomano.length() - 1; iterador > 0; iterador--) {
                corrente = mapaNumeros.get(String.valueOf(numeroRomano.charAt(iterador)));
                anterior = (mapaNumeros.get(String.valueOf(numeroRomano.charAt(iterador - 1))));
                if (corrente > anterior) {
                    resultado -= mapaNumeros.get(String.valueOf(numeroRomano.charAt(iterador - 1)));

                } else {
                    if (corrente <= anterior) {
                        resultado += mapaNumeros.get(String.valueOf(numeroRomano.charAt(iterador - 1)));

                    }
                }
            }
            return resultado;
        }
    }
}

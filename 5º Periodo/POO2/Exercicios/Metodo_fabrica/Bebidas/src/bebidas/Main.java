/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidas;

/**
 *
 * @author ISM
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here

        BebidasFactory bebidasFactory = new BebidasFactory();
        Bebidas bebida = bebidasFactory.prepareBebida("bebidas.Cha");
        bebida.prepare();

    }

}

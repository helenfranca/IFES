/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author 20142bsi0070
 */
public class ClamPizza extends Pizza {

    @Override
    public void bake() {
        System.out.println("A Assar uma pizza de 'clam'!");
    }

    @Override
    public void prepare() {
        System.out.println("A preparar uma pizza de 'clam'");
    }

    @Override
    public void cut() {
        System.out.println("A cortar uma pizza de 'clam'");
    }

    @Override
    public void box() {
        System.out.println("Embalando uma pizza de 'clam'");
    }

}

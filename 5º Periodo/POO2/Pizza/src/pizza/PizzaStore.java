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
public class PizzaStore {

    public Pizza orderPizza() {
        PizzaFactory pizzaFactory = new PizzaFactory();

        return pizzaFactory.createPizza("chesse");
    }

}

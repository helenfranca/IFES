/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author ISM
 */
public class Main {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStore();
        Pizza pizza = pizzaStore.orderPizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

    }

}

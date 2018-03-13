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
public class PizzaFactory extends Pizza {

    // TODO code application logic here
    public static Pizza createPizza(String tipo) {
        Pizza pizza;
        Object classeReflection = null;
        try {
            classeReflection = Class.forName(tipo).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        pizza = (Pizza) classeReflection;
        return pizza;
    }

}

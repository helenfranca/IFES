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
public class BebidasFactory {
    public Bebidas prepareBebida(String tipo) {
        Bebidas bebida;
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
        bebida = (Bebidas) classeReflection;
        return bebida;
    }
    
}

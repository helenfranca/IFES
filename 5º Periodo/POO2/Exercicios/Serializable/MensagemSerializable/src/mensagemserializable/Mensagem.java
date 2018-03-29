/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensagemserializable;

import java.io.Serializable;

/**
 *
 * @author ISM
 */
public class Mensagem implements Serializable {

    String texto;
    Usuario usuario;
    

    public Mensagem(String pTexto, Usuario pUsuario) {
        this.texto = pTexto;
        this.usuario = pUsuario;
    }

    public String getTexto() {
        return texto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String toString() {
        return "Mensagem: " + this.texto;
    }
}
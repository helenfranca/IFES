/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensagemserializable;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ISM
 */
public class Usuario implements Serializable {

    String nome;
    ArrayList<Mensagem> mensagensEnviadas;
    ArrayList<Mensagem> mensagensRecebidas;

    public Usuario(String pNome) {
        this.nome = pNome;
        this.mensagensEnviadas = new ArrayList<Mensagem>();
        this.mensagensRecebidas = new ArrayList<Mensagem>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addMensagemEnviadas(Mensagem nMensagem) {
        mensagensEnviadas.add(nMensagem);
    }

    public void addMensagemRecebidas(Mensagem nMensagem) {
        mensagensRecebidas.add(nMensagem);
    }

    public String getMensagensEnviadas() {
        String retorno = "";

        for (Mensagem sms : this.mensagensEnviadas) {
            retorno += sms.toString() + "\n";
        }

        return retorno;
    }

    public String getMensagensRecebidas() {
        String retorno = "";

        for (Mensagem sms : this.mensagensRecebidas) {
            retorno += sms.toString() + "\n";
        }

        return retorno;
    }

    public String toString() {
        return "\nDe: " + this.nome;
    }
}

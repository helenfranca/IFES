/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensagemserializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author ISM
 */
public class MensagemSerializable {

    public static void main(String[] args) throws Exception {

        Usuario usuario1 = new Usuario("Lelinha");
        Usuario usuario2 = new Usuario("Helen");

        Mensagem sms1 = new Mensagem("Comida Japonesa", usuario1);
        usuario1.addMensagemEnviadas(sms1);
       
        Mensagem sms3 = new Mensagem("Melancia!", usuario2);
        usuario2.addMensagemRecebidas(sms3);
        
        Mensagem sms2 = new Mensagem("Melancia!", usuario2);
        usuario2.addMensagemEnviadas(sms2);

        Escrever escrever = new Escrever();
        escrever.escrever(usuario1, usuario2);

        Ler ler = new Ler();
        ler.ler();

    }

}

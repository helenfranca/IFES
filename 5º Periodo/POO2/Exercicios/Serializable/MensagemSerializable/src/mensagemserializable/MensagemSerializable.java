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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ISM
 */
public class MensagemSerializable {

    public static void main(String[] args) throws Exception {
        Escrever escrever = new Escrever();
        Ler ler = new Ler();

        Usuario usuario1 = new Usuario("Lelinha");
        Usuario usuario2 = new Usuario("Helen");

        Mensagem sms1 = new Mensagem("Comida Japonesa", usuario1);
        usuario1.addMensagemEnviadas(sms1);

        Mensagem sms3 = new Mensagem("Melancia!", usuario2);
        usuario2.addMensagemRecebidas(sms3);

        Mensagem sms2 = new Mensagem("Sorvete!", usuario2);
        usuario2.addMensagemEnviadas(sms2);

        escrever.escrever(usuario1, usuario2);
        ler.ler();

    }

}

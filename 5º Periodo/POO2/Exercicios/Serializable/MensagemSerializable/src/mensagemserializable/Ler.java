/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensagemserializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author ISM
 */
public class Ler {
    public void ler() throws Exception {
        Usuario user1 = null;
        Usuario user2 = null;

        String current = new java.io.File(".").getCanonicalPath();

        FileInputStream arquivoSerialIn = new FileInputStream(current + "\\src\\arquivoSerialOut.ser");
        ObjectInputStream inputSerial = new ObjectInputStream(arquivoSerialIn);
        user1 = (Usuario) inputSerial.readObject();
        user2 = (Usuario) inputSerial.readObject();

        inputSerial.close();
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensagemserializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author ISM
 */
public class Escrever {

    public void escrever(Usuario pUsu1, Usuario pUsu2) throws IOException {
        String current = new java.io.File(".").getCanonicalPath();

        FileOutputStream arquivoSerialOut = new FileOutputStream(current + "\\src\\arquivoSerialOut.ser");
        ObjectOutputStream outputSerial = new ObjectOutputStream(arquivoSerialOut);
        outputSerial.writeObject(pUsu1);
        outputSerial.writeObject(pUsu2);

        outputSerial.close();
        
    }

}

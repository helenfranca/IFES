/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata;

/**
 *
 * @author 20142BSI0070
 */
public class EnvioSMSClaro implements EnvioSMS {

    @Override
    public boolean enviar(Mensagem msg, int telefone) {
        System.out.println("Enviando mensagem:" + msg.texto
                + " para o telefone tim:" + telefone);
        return true;
    }

}

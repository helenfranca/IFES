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
public class FabricaClaro extends FabricaAbstrataEnvios {

    @Override
    public Cobranca criaCobranca() {
        return new CobrancaClaro();
    }

    @Override
    public EnvioSMS criaEnvioSMS() {
        return new EnvioSMSClaro();
    }
    
}

package leitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeCsv {

    public LinkedList<Cliente> leCsvClientes() throws IOException {

        LinkedList<Cliente> clientes = new LinkedList<Cliente>();
        String current = new java.io.File(".").getCanonicalPath();
        BufferedReader ler = new BufferedReader(new FileReader(current + "\\src\\arquivo.csv"));

        ler.readLine();
        while (ler.ready()) {
            String linha = ler.readLine();
            String array[] = new String[6];
            array = linha.split(";");
            Cliente cliente = new Cliente();
            cliente.setId(array[0]);
            cliente.setNome(array[1]);
            cliente.setEmail(array[2]);
            cliente.setTelefone(array[4]);
            cliente.setTotalCompras(Double.parseDouble(array[5]));

            clientes.add(cliente);
        }
        ler.close();

        return clientes;
    }
}

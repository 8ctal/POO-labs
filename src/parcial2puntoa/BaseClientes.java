package parcial2puntoa;

import java.util.ArrayList;
import java.util.List;

public class BaseClientes {
    private final List<Cliente> clientes;

    public BaseClientes() {
        clientes = new ArrayList<>();
    }

    public void addCliente(Cliente e) {
        clientes.add(e);
    }
    
    public void imprimirClientes(){
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}

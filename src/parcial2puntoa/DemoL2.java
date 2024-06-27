package parcial2puntoa;

public class DemoL2 {

    public static void main(String[] args) {
        BaseClientes clientBase = new BaseClientes();
        clientBase.addCliente(new NoRegistrado("Lucas", "Vallejo", 500000,10));
        clientBase.addCliente(new NoRegistrado("Andres", "Perez", 500000,18));
        clientBase.addCliente(new Registrado("Tatiana", "Delgado", 500000,10));
        clientBase.addCliente(new Registrado("Kanny", "Gelvez", 500000,23));
        clientBase.imprimirClientes();
    }
    
}
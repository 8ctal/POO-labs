package parcial2puntoa;

public class DemoL2 {

    public static void main(String[] args) {
        BaseClientes n = new BaseClientes();
        n.addCliente(new NoRegistrado("Lucas", "Vallejo", 500000,10));
        n.addCliente(new NoRegistrado("Andres", "Perez", 500000,18));
        n.addCliente(new Registrado("Tatiana", "Delgado", 500000,10));
        n.addCliente(new Registrado("Kanny", "Gelvez", 500000,23));
        n.imprimirClientes();
    }
    
}
package parcial2puntoa;

public class NoRegistrado extends Cliente {

    public NoRegistrado(String nombre, String apellido, float valorCompra, int mesesDesdePrimeraCompra) {
        super(nombre, apellido, valorCompra, mesesDesdePrimeraCompra);
    }

    @Override
    public double anclasPorCompra() {
        double anclasPorCompra = 0;
        anclasPorCompra = (getMesesDesdePrimeraCompra() > 12
                ? (getValorCompra() / 5000)
                : (getValorCompra() / 6000));
        return anclasPorCompra;
    }
}

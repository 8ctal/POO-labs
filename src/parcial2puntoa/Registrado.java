package parcial2puntoa;

public class Registrado extends Cliente implements ClienteAmigo{
    public Registrado (String nombre, String apellido, float valorCompra, int mesesDesdePrimeraCompra) {
        super(nombre, apellido, valorCompra, mesesDesdePrimeraCompra);
        
    }
    
    @Override
    public double getBonoPorTiempo() {
        return (getValorCompra() / 6000) * getMesesDesdePrimeraCompra();
    }
    
    @Override
    public double getBonoPorCompra() {
        return (getValorCompra() / 6000);
    }
    
    
    @Override
    public double anclasPorCompra() {
        double anclasPorCompra = 0;
        if (getMesesDesdePrimeraCompra() > 12) {
            anclasPorCompra = ((getValorCompra() / 5000) + getBonoPorTiempo() + getBonoPorCompra());
        } else if(getMesesDesdePrimeraCompra() <= 12) {
            anclasPorCompra = ((getValorCompra() / 6000) + getBonoPorTiempo() + getBonoPorCompra());
        }
        return anclasPorCompra;
    }
}
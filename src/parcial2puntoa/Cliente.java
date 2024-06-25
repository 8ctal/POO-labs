package parcial2puntoa;

public abstract class Cliente {
    private String nombre;
    private String apellido;
    private float valorCompra;
    private int mesesDesdePrimeraCompra;

    public Cliente(String nombre, String apellido, float valorCompra, int mesesDesdePrimeraCompra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.valorCompra = valorCompra;
        this.mesesDesdePrimeraCompra = mesesDesdePrimeraCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getMesesDesdePrimeraCompra() {
        return mesesDesdePrimeraCompra;
    }

    public void setMesesDesdePrimeraCompra(int mesesDesdePrimeraCompra) {
        this.mesesDesdePrimeraCompra = mesesDesdePrimeraCompra;
    }

    public abstract double anclasPorCompra();

    @Override
    public String toString() {
        return "{Cliente: " + getClass().getSimpleName() + ", Nombre=" + nombre + ", Apellido=" + apellido
                + ", Valor de la compra=" + valorCompra + ", meses desde primera compra=" + mesesDesdePrimeraCompra + ", Anclas por compra=" + String.format("%.2f", anclasPorCompra()) + "}";
    }
}

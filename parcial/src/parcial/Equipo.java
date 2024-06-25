
package parcial;

public class Equipo {
    private int tipoDeEquipo;
    private String nombre;
    private int valorUnitario;
    private int cantidadEquipos; 
    //CONSTRUCTOR
    public Equipo(int tipo, String nombre, int valor,int cantidad){
    this.tipoDeEquipo=tipo;
    this.nombre=nombre;
    this.valorUnitario=valor;
    this.cantidadEquipos=cantidad;
    }
    
    public int getCosto(){
    return (cantidadEquipos*valorUnitario);
    }
    public int getTipoDeEquipo() {
        return tipoDeEquipo;
    }

    public int getValorUnitario() {
        return valorUnitario;
    }

    public int getCantidadEquipos() {
        return cantidadEquipos;
    }

    
}

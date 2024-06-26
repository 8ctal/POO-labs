/*
 * private: sting nombre; long  dni; int diasVacaciones; double sueldoBase;
 * public: Asalariado(); Asalariado(String nombre, long dni, int diasVacaciones, double sueldoBase);
 * public: String getNombre(); void setNombre(String nombre);
 * public: long getDni(); void setDni(long dni);
 * public: int getDiasVacaciones(); void setDiasVacaciones(int diasVacaciones);
 * public: getSalario(): double;
 * 
 * 
 */
package demoasalariado;


public class Asalariado {
    private String nombre;
    private long dni;
    private int diasVacaciones;
    private double sueldoBase;
    
   /* public Asalariado(){
        this.nombre = "";
        this.dni = 0;
        this.diasVacaciones = 0;
        this.sueldoBase = 0;
    }
    */
    public Asalariado(String nombre, long dni, int diasVacaciones, double sueldoBase){
        this.nombre = nombre;
        this.dni = dni;
        this.diasVacaciones = diasVacaciones;
        this.sueldoBase = sueldoBase;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public long getDni(){
        return dni;
    }
    
    public void setDni(long dni){
        this.dni = dni;
    }
    
    public int getDiasVacaciones(){
        return diasVacaciones;
    }
    
    public void setDiasVacaciones(int diasVacaciones){
        this.diasVacaciones = diasVacaciones;
    }
    
    public double getSueldoBase(){
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase){
        this.sueldoBase = sueldoBase;
    }

    public void imprimir(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("DNI: " + this.dni);
        System.out.println("Dias de vacaciones: " + this.diasVacaciones);
        System.out.println("Sueldo Base: " + this.sueldoBase);
    }
}

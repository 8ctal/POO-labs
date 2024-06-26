/*
 * zona: String
 * EmpleadoDistribucion(string nombre, long dni, int diasVacaciones, double sueldoBase, String zona)
 * getZona(): String
 * setZona(String zona); void
 * getSalario(): double
 * los empleados de distribución reciben un aumento del 10% sobre su salarioBase
 */
package demoasalariado;

public class EmpleadoDistribucion extends Asalariado{
    private String zona;
    
    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, double sueldoBase, String zona){
        super(nombre, dni, diasVacaciones, sueldoBase);
        this.zona = zona;
    }
    
    public String getZona(){
        return zona;
    }
    
    public void setZona(String zona){
        this.zona = zona;
    }
    
    public double getSalario(){
        double salario = super.getSueldoBase();
        salario += salario * 0.1;
        return salario;
    }

     //metodo imprimir
    @Override
     public void imprimir(){
        System.out.println("Empleado Distribucion");
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("DNI: " + super.getDni());
        System.out.println("Dias de Vacaciones: " + super.getDiasVacaciones());
        System.out.println("Sueldo Base " + getSueldoBase());
        System.out.println("Salario: " + getSalario());
        System.out.println("Zona: " + getZona());
     }
}

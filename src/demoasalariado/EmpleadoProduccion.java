/*
 * private turno: String
 * EmpleadoProduccion(string nombre, long dni, int diasVacaciones, double sueldoBase, String turno)
 * getTurno(): String
 * setTurno(String turno); void 
 * getSalario(): double
 * Los empleados de producción reciben sobre el salarioBase un incremento del 15% sobre salarioBase
 * imprimir(): void toda la información del empleado de producción (nombre, dni, días de vacaciones, salario, turno)
 * 
 */
package demoasalariado;

public class EmpleadoProduccion extends Asalariado {
    private String turno;
    
    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, double sueldoBase, String turno){
        super(nombre, dni, diasVacaciones, sueldoBase);
        this.turno = turno;
    }
    
    public String getTurno(){
        return turno;
    }
    
    public void setTurno(String turno){
        this.turno = turno;
    }
    
    public double getSalario(){
        double salario = super.getSueldoBase();
        salario += salario * 0.15;
        return salario;
    }

    //metodo imprimir
    @Override
    public void imprimir(){
        System.out.println("Empleado Produccion");
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("DNI: " + super.getDni());
        System.out.println("Días de Vacaciones: " + super.getDiasVacaciones());
        System.out.println("Sueldo Base " + getSueldoBase());
        System.out.println("Salario: " + getSalario());
        System.out.println("Turno: " + getTurno());
    }

}

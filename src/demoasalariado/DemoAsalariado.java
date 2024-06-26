
package demoasalariado;

public class DemoAsalariado {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("------------------------------");
        System.out.println();
        
        Asalariado asalariado = new Asalariado("Camila", 7654987, 30, 1000000.0);
        asalariado.imprimir();
        
        System.out.println();
        System.out.println("------------------------------");
        System.out.println();
        
        EmpleadoProduccion empleadoProduccion = new EmpleadoProduccion("Laura", 87654321, 30, 1000000.0,"maniana");
        empleadoProduccion.imprimir();

        System.out.println();
        System.out.println("------------------------------");
        System.out.println();

        EmpleadoDistribucion empleadoDistribucion = new EmpleadoDistribucion("Juan", 12345678, 30, 1000000.0, "camion");
        empleadoDistribucion.imprimir();
        
        System.out.println();
        System.out.println("------------------------------");
        System.out.println();

    }
}

package factorialexception;

public class mainFactorialE {
//FALSO LANZAMIENTO DE LA EXCEPCION
    public static void main(String[] args) throws FactorialException {

        //long fact = factorial(-3);
        //System.out.println(fact);
        //test(-3);
        int n=-3;
        try{
            System.out.println("El factorial de " +n+ " es: "+ factorial(n));  
        }
        //TRATA LA EXCEPCION
        catch(FactorialException e){
            System.out.println(e.getMessage());
            if(e.getClass().getSimpleName().equals("FactorialException")){
                n = Math.abs(n);
                System.out.println("El resultado es "+ factorial(n));
            }
        }
        finally {
            System.out.println("Siempre se ejecuta");
        }
    }
    
    //ESPECIFICA LA EXCEPCION
    static long factorial(int n) throws FactorialException{ //Throws es necesario cuando se crean nuevas excepciones
        if(n<0){
            throw new FactorialException("Factorial indefinido por numero negativo");
        }
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    // RECIBE Y LANZA LA EXCEPCION
    static void test(int n) throws FactorialException {
        System.out.println("El factorial de "+ n+ " es "+factorial(n) );
        
    }
    
}

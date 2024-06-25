package demomap;

import java.util.*;

public class DemoMap {

    public static void main(String[] args) {
        
        Map<Integer,String> map= new HashMap<Integer,String>(); //HashMap parametrizado
        
        map.put(2221918, "Nicolas Rivera");    
        map.put(2221917, "Sebastian");
        map.put(2221902, "Daniel Sandoval");
        
        System.out.println(map.get(2221918));
        System.out.println(map.containsKey(2221918));// Verifica si contiene la CLAVE que se da por parametro (boolean)
        
        //OBTENER CLAVES
        
        Set<Integer> keys = map.keySet();//CUANDO SE PARAMETRIZA EL MAP SE DEBE PARAMETRIZAR LA VARIABLE QUE VA A ALMACENAR LAS CLAVES QUE COINCIDAN CON EL TIPO DE CLAVE
        Iterator<Integer> it= keys.iterator();
        
        System.out.println("------KEYS------");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        //OBTENER VALORES
        
        Collection<String> collectValues= map.values(); //CUANDO SE PARAMETRIZA EL MAP SE DEBE PARAMETRIZAR LA VARIABLE QUE VA A ALMACENAR LOS VALORES QUE COINCIDAN CON EL TIPO DE VALOR
        Iterator<String> itc= collectValues.iterator();
        
        System.out.println("------VALUES-----");
        while(itc.hasNext()){
            System.out.println(itc.next());
        }
        System.out.println("------------------");
        
        System.out.println("Initial size: " +map.size());
        map.remove(2221902);
        System.out.println("Size: "+ map.size());
        System.out.println(map);
        
    }
    
}

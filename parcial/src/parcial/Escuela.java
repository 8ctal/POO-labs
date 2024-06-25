
package parcial;

public class Escuela {
    private String nombre;
    private Grupo[] vGrupo;
    private int cantidadGrupos;
    
    public Escuela(String nombre){
    this.nombre=nombre;
    vGrupo= new Grupo[100];
    cantidadGrupos=0;
    }
    public void agregarGrupo(Grupo grup){
    vGrupo[cantidadGrupos]=grup;
    cantidadGrupos++;
    }
    public void agregarEquipoGrupo (int indice, Equipo equi){
    Grupo gru = vGrupo[indice];
    gru.agregarEquipo(equi);
    }
    public void mostarInventarioEscuela(){
    System.out.println(nombre);
    for (int i=0;i<cantidadGrupos;i++){
    Grupo grup= vGrupo[i];
    System.out.println("------------------------");
    System.out.println("*******"+ grup.getNombre()+"**********");
    System.out.println("Cantidad de equipos de ambiental: "+grup.getCantidadAmbiental()+ " Costo total: " +grup.getCostoAmbiental()+ " Cantidad total de equipos: "+grup.getTotalAmbiental());
    System.out.println("Cantidad de equipos de estructura: "+grup.getCantidadEstructura()+" Costo total: " +grup.getCostoEstructura()+" Cantidad total de equipos: "+grup.getTotalEstruct());
    System.out.println("Cantidad de equipos de geomatica: "+ grup.getCantidadGeomatica()+" Costo total: " +grup.getCostoGeo()+" Cantidad total de equipos: "+grup.getTotalGeo());
    System.out.println("Cantidad de equipos de hidraulica: " +grup.getCantidadHidraulica()+" Costo total: " +grup.getCostoHidraulica()+" Cantidad total de equipos: "+grup.getTotalHidra());
    System.out.println("Cantidad de equipos de material: "+grup.getCantidadMateriales()+" Costo total: " +grup.getCostoMaterial()+" Cantidad total de equipos: "+grup.getTotalMate());
    System.out.println("Cantidad de equipos de suelos y pavimentos: "+grup.getCantidadSuelosPavimentos()+" Costo total: " +grup.getCostoSuelos()+" Cantidad total de equipos: "+grup.getTotalSuelos());
    System.out.println("Cantidad de equipos de topografa: "+ grup.getCantidadTopografia()+" Costo total: " +grup.getCostoTopografia()+" Cantidad total de equipos: "+grup.getTotalTopo());
    }
    }
}

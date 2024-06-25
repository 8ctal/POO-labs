
package parcial;

public class Grupo {
    private String nombre;
    private Equipo[] vAmbiental;
    private Equipo[] vEstructura;
    private Equipo[] vGeomatica;
    private Equipo[] vHidraulica;
    private Equipo[] vMateriales;
    private Equipo[] vSuelosPavimentos;
    private Equipo[] vTopografia;
    private int cantidadAmbiental;
    private int cantidadEstructura;
    private int cantidadGeomatica;
    private int cantidadHidraulica;
    private int cantidadMateriales;
    private int cantidadSuelosPavimentos;
    private int cantidadTopografia;
    
    public Grupo (String nombre){
    this.nombre=nombre;
    vAmbiental= new Equipo[50];
    vEstructura= new Equipo[50];
    vGeomatica= new Equipo[50];
    vHidraulica= new Equipo[50];
    vMateriales= new Equipo[50];
    vSuelosPavimentos= new Equipo[50];
    vTopografia= new Equipo[50];
    cantidadAmbiental=0;
    cantidadEstructura=0;
    cantidadGeomatica=0;
    cantidadHidraulica=0;
    cantidadMateriales=0;
    cantidadSuelosPavimentos=0;
    cantidadTopografia=0;
    }
    public void agregarEquipo (Equipo equi){
    int tipo=equi.getTipoDeEquipo();
    switch(tipo){
        case 0:
            vAmbiental[cantidadAmbiental]=equi;
            cantidadAmbiental++;
            break;
        case 1:
            vEstructura[cantidadEstructura]=equi;
            cantidadEstructura++;
            break;
        case 2:
            vGeomatica[cantidadGeomatica]=equi;
            cantidadGeomatica++;
            break;
        case 3:
            vHidraulica[cantidadHidraulica]=equi;
            cantidadHidraulica++;
            break;
        case 4:
            vMateriales[cantidadMateriales]=equi;
            cantidadMateriales++;
            break;
        case 5:
            vSuelosPavimentos[cantidadSuelosPavimentos]=equi;
            cantidadSuelosPavimentos++;
            break;
        case 6:
            vTopografia[cantidadTopografia]=equi;
            cantidadTopografia++;  
            break;
        default:
            break;
    }
    }

    public int getCantidadAmbiental() {
        return cantidadAmbiental;
    }

    public int getCantidadEstructura() {
        return cantidadEstructura;
    }

    public int getCantidadGeomatica() {
        return cantidadGeomatica;
    }

    public int getCantidadHidraulica() {
        return cantidadHidraulica;
    }

    public int getCantidadMateriales() {
        return cantidadMateriales;
    }

    public int getCantidadSuelosPavimentos() {
        return cantidadSuelosPavimentos;
    }

    public int getCantidadTopografia() {
        return cantidadTopografia;
    }

    public String getNombre() {
        return nombre;
    }
    public int getCostoAmbiental(){
    int costo=0;
    for (int i=0;i<cantidadAmbiental;i++){
    costo+=vAmbiental[i].getCosto();
    }
    return costo;
    }
    public int getCostoEstructura(){
    int costo=0;
    for (int i=0;i<cantidadEstructura;i++){
    costo+=vEstructura[i].getCosto();
    }
    return costo;
    }
    public int getCostoGeo(){
    int costo=0;
    for (int i=0;i<cantidadGeomatica;i++){
    costo+=vGeomatica[i].getCosto();
    }
    return costo;
    }
    public int getCostoHidraulica(){
    int costo=0;
    for (int i=0;i<cantidadHidraulica;i++){
    costo+=vHidraulica[i].getCosto();
    }
    return costo;
    }
    public int getCostoMaterial(){
    int costo=0;
    for (int i=0;i<cantidadMateriales;i++){
    costo+=vMateriales[i].getCosto();
    }
    return costo;
    }
    public int getCostoSuelos(){
    int costo=0;
    for (int i=0;i<cantidadSuelosPavimentos;i++){
    costo+=vSuelosPavimentos[i].getCosto();
    }
    return costo;
    }
    public int getCostoTopografia(){
    int costo=0;
    for (int i=0;i<cantidadTopografia;i++){
    costo+=vTopografia[i].getCosto();
    }
    return costo;
    }
    public int getTotalAmbiental(){
     int total=0;
     for (int i=0;i<cantidadAmbiental;i++){
     total+=vAmbiental[i].getCantidadEquipos();
     }
      return total;
     }
     public int getTotalEstruct(){
        int total=0;
      for (int i=0;i<cantidadEstructura;i++){
      total+=vEstructura[i].getCantidadEquipos();
      }
      return total;
    }
      public int getTotalGeo(){
        int total=0;
      for (int i=0;i<cantidadGeomatica;i++){
      total+=vGeomatica[i].getCantidadEquipos();
      }
      return total;
    }
       public int getTotalHidra(){
        int total=0;
      for (int i=0;i<cantidadHidraulica;i++){
      total+=vHidraulica[i].getCantidadEquipos();
      }
      return total;
    }
      public int getTotalMate(){
        int total=0;
      for (int i=0;i<cantidadMateriales;i++){
      total+=vMateriales[i].getCantidadEquipos();
      }
      return total;
    }
       public int getTotalSuelos(){
        int total=0;
      for (int i=0;i<cantidadSuelosPavimentos;i++){
      total+=vSuelosPavimentos[i].getCantidadEquipos();
      }
      return total;
    }
       public int getTotalTopo(){
        int total=0;
      for (int i=0;i<cantidadTopografia;i++){
      total+=vTopografia[i].getCantidadEquipos();
      }
      return total;
    }
}

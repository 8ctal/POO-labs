
package parcial;
/**
 *
 * @author Camilo Avila
 */
public class Parcial {
    public static void main(String[] args) {
        Escuela escuela= new Escuela("Ingenieria Civil UIS");
        Equipo canastas= new Equipo(0,"canastas",20000,4);
        Equipo recogedores= new Equipo(0,"recogedores",20000,4);
        Equipo pilar= new Equipo(1,"pilar",300000,2);
        Equipo barreras= new Equipo(2,"barreras",50000,5);
        Equipo columnas= new Equipo(2,"columnas",50000,5);
        Equipo gatos= new Equipo(3,"gatos",10000,1);
        Equipo concreto= new Equipo(4,"concreto",40000,1);
        Equipo pavimento= new Equipo(5,"pavimento",30000,2);
        Equipo cemento= new Equipo(4,"cemento",15000,6);
        Equipo sensor= new Equipo(6,"sensor",30000,6);
        Grupo grupo1= new Grupo("INME");
        Grupo grupo2= new Grupo("GPH");
        escuela.agregarGrupo(grupo1);
        escuela.agregarGrupo(grupo2);
        escuela.agregarEquipoGrupo(0,sensor);
        escuela.agregarEquipoGrupo(0,pavimento);
        escuela.agregarEquipoGrupo(0,concreto);
        escuela.agregarEquipoGrupo(0,pilar);
        escuela.agregarEquipoGrupo(0,gatos);
        escuela.agregarEquipoGrupo(0,barreras);
        escuela.agregarEquipoGrupo(0,canastas);
        escuela.agregarEquipoGrupo(0,recogedores);
        escuela.agregarEquipoGrupo(0,columnas);
        escuela.agregarEquipoGrupo(1,sensor);
        escuela.agregarEquipoGrupo(1,pavimento);
        escuela.agregarEquipoGrupo(1,concreto);
        escuela.agregarEquipoGrupo(1,pilar);
        escuela.agregarEquipoGrupo(1,gatos);
        escuela.agregarEquipoGrupo(0,barreras);
        escuela.agregarEquipoGrupo(1,canastas);
        escuela.agregarEquipoGrupo(1,recogedores);
        escuela.agregarEquipoGrupo(1,columnas);
        escuela.agregarEquipoGrupo(1,cemento);
        escuela.mostarInventarioEscuela();
    }
    
}

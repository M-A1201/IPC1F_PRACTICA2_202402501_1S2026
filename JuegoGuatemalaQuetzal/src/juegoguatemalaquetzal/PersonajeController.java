
package juegoguatemalaquetzal;

/**
 *
 * @author Manuel
 */
public class PersonajeController {
 //arreglo que almacena todos los personajes del juego
    public static PersonajeModel[] personajes=new PersonajeModel[100];
    
    //metodo para agregar personajes predefinidos del sistema
    public void agregarPersonajesQuemados(){
        
        //creacion de objetos tipo personaje
    PersonajeModel harry =new PersonajeModel();
    PersonajeModel draco= new PersonajeModel();
    PersonajeModel ron= new PersonajeModel(); 
    
    //creacion de objeto de tipo escoba
    EscobaModel nimbus2000=new EscobaModel();
    EscobaModel nimbus2001=new EscobaModel();
    //configuracion de la escoba nimbus 2000
    nimbus2000.setDormirSegundos(3);
    nimbus2000.setNombre("Nimbus 2000");
    nimbus2000.setIdEscoba(1);
    
    //...
    nimbus2001.setDormirSegundos(2);
    nimbus2001.setNombre("Nimbus 2001");
    nimbus2001.setIdEscoba(2);

    //asignacion de datos al personaje harry
    harry.setIdpersonaje(1);
    harry.setCasa(Casa.GRIFINDOR);
    harry.setEscoba(nimbus2000);
    harry.setNombre("Harry Potter");
    
    //...
    draco.setIdpersonaje(2);
    draco.setCasa(Casa.SLYTHERIN);
    draco.setEscoba(nimbus2001);
    draco.setNombre("Draco Malfoy");
    
    
    //se almacena los personajes en el arreglo 
    ron.setIdpersonaje(3);
    ron.setCasa(Casa.GRIFINDOR);
    ron.setNombre("Ron Weasley");
    ron.setEscoba(nimbus2000);
    
    
    personajes[0]= harry;
    
    personajes[1]=draco;
    personajes[2]=ron;
    
    }
    
    
}


package juegoguatemalaquetzal;

/**
 *
 * @author Manuel
 */
public class PersonajeController {
 
    public static PersonajeModel[] personajes=new PersonajeModel[100];
    
    public void agregarPersonajesQuemados(){
    PersonajeModel harry =new PersonajeModel();
    PersonajeModel draco= new PersonajeModel();
    
    EscobaModel nimbus2000=new EscobaModel();
    EscobaModel nimbus2001=new EscobaModel();
    
    nimbus2000.setDormirSegundos(3);
    nimbus2000.setNombre("Nimbus 2000");
    nimbus2000.setIdEscoba(1);
    
    nimbus2001.setDormirSegundos(2);
    nimbus2001.setNombre("Nimbus 2001");
    nimbus2001.setIdEscoba(2);

    
    harry.setIdpersonaje(1);
    harry.setCasa(Casa.GRIFINDOR);
    harry.setEscoba(nimbus2000);
    harry.setNombre("Harry Potter");
    
    draco.setIdpersonaje(2);
    draco.setCasa(Casa.SLYNERIN);
    draco.setEscoba(nimbus2001);
    draco.setNombre("Draco Malfoy");
    
    
    
    personajes[0]= harry;
    personajes[1]=draco;
    
    
    }
    
    
}

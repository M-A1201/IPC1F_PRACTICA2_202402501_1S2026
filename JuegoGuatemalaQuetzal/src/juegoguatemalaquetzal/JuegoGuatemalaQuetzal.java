
package juegoguatemalaquetzal;

/**
 *
 * @author Manuel
 */
//clase principal para inicial la ejecucion del programa 
public class JuegoGuatemalaQuetzal {

    public static void main(String[] args) {

//se crea una instancia del controlador de peronaje 
        PersonajeController control=new PersonajeController();
       //se agregan personajes 
        control.agregarPersonajesQuemados();
       
        //se crea la vista principal del juego 
    VistaPrincipal vPrincipal=new VistaPrincipal();
    //hacemos visible la ventana de la interfaz grafica 
    vPrincipal.setVisible(true);
    }
    
}

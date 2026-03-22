
package juegoguatemalaquetzal;

/**
 *
 * @author Manuel
 */
public class JuegoGuatemalaQuetzal {

    public static void main(String[] args) {
        PersonajeController control=new PersonajeController();
        control.agregarPersonajesQuemados();
       
    VistaPrincipal vPrincipal=new VistaPrincipal();
    vPrincipal.setVisible(true);
    }
    
}

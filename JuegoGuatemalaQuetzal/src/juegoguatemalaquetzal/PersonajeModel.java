
package juegoguatemalaquetzal;

/**
 *
 * @author Manuel
 */
public class PersonajeModel {
  int idpersonaje;
String nombre;
Casa casa;
EscobaModel escoba;


    public int getIdpersonaje() {
        return idpersonaje;
    }

    public void setIdpersonaje(int idpersonaje) {
        this.idpersonaje = idpersonaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public EscobaModel getEscoba() {
        return escoba;
    }

    public void setEscoba(EscobaModel escoba) {
        this.escoba = escoba;
    }


}

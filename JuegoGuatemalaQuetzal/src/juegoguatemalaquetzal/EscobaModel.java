/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoguatemalaquetzal;

/**
 *
 * @author Manuel
 */
public class EscobaModel {
    //atributos que representan las caracteristicas de la escoga 
   private int idEscoba;
   private String nombre;
   private int dormirSegundos;

   //metodos de acceso que permiten obtener(acceder) y modificar los atributos de la clase
    public int getIdEscoba() {
        return idEscoba;
    }

    public void setIdEscoba(int idEscoba) {
        this.idEscoba = idEscoba;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//metodo que permite obtener el tiempo de espera(velocidad)
    public int getDormirSegundos() {
        return dormirSegundos;
    }
//metdo que permite asignar el tiempo de espera de la escoba 
    public void setDormirSegundos(int dormirSegundos) {
        this.dormirSegundos = dormirSegundos;
    }
   
   
}

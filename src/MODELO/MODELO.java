/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class MODELO implements Serializable{// implements serializables se coloca para poder guardar en una compu como objetos
    public String cedula,nombres,apellidoss;

    public MODELO(String cedula, String nombres, String apellidoss) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidoss = apellidoss;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoss() {
        return apellidoss;
    }

    public void setApellidoss(String apellidoss) {
        this.apellidoss = apellidoss;
    }
    
}

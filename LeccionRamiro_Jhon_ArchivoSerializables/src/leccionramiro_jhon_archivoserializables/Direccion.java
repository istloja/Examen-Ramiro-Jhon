/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccionramiro_jhon_archivoserializables;

import java.io.Serializable;

/**
 *
 * @author ISTLOJAV
 */
public class Direccion implements Serializable {
    private String ciudad;
    private String calle;
    private int numcasa;

    public Direccion() {
    }

    public Direccion(String ciudad, String calle, int numcasa) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.numcasa = numcasa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumcasa() {
        return numcasa;
    }

    public void setNumcasa(int numcasa) {
        this.numcasa = numcasa;
    }
    
    
}
